package com.breezefieldmaruthiconcreteworks.app.utils

import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import com.breezefieldmaruthiconcreteworks.R
import com.breezefieldmaruthiconcreteworks.app.AppDatabase
import com.breezefieldmaruthiconcreteworks.app.NetworkConstant
import com.breezefieldmaruthiconcreteworks.app.Pref
import com.breezefieldmaruthiconcreteworks.app.domain.CrashReportEntity
import com.breezefieldmaruthiconcreteworks.base.BaseResponse
import com.breezefieldmaruthiconcreteworks.base.presentation.BaseActivity
import com.breezefieldmaruthiconcreteworks.features.dashboard.presentation.DashboardActivity
import com.breezefieldmaruthiconcreteworks.features.location.LocationFuzedService
import com.breezefieldmaruthiconcreteworks.features.splash.presentation.CrashActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.system.exitProcess


class CustomExceptionHandler(
    private val context: Context
) : Thread.UncaughtExceptionHandler {

    private val defaultHandler = Thread.getDefaultUncaughtExceptionHandler()
    override fun uncaughtException(thread: Thread, throwable: Throwable) {

        // Capture crash details
        val timestamp = System.currentTimeMillis()
        val errorMessage = throwable.localizedMessage ?: "An unexpected error occurred."
        val stackTrace = throwable.stackTraceToString()
        val user_id = Pref.user_id
        val date_time = AppUtils.getCurrentDateTime()


        // Start the CrashDialogActivity with crash details
        val intent = Intent(context, CrashActivity::class.java).apply {
            putExtra("crash_message", errorMessage)
            putExtra("crash_timestamp", timestamp)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
        context.startActivity(intent)


        val userRemarks = intent.getStringExtra("user_remarks") ?: ""

        // Create crash report entity
        val crashReport = CrashReportEntity(
            timestamp = timestamp,
            errorMessage = errorMessage,
            stackTrace = stackTrace,
            user_id = user_id!!,
            date_time = date_time,
            device = AppUtils.getDeviceName(),
            os_version = AppUtils.getAndroidVersion(),
            app_version = AppUtils.getVersionName(context),
            user_remarks = userRemarks,
            isUpload = false
        )

       /* var obj = Crash_Report_Save_Data()
        obj.errorMessage = errorMessage.trim()
        obj.stackTrace = stackTrace.trim()
        obj.date_time = AppUtils.getCurrentDateTime()
        obj.device = AppUtils.getDeviceName()
        obj.os_version = AppUtils.getAndroidVersion()
        obj.app_version = AppUtils.getVersionName(context)
        obj.user_remarks = userRemarks  // User Remarks
        mCrash_Report_Save_Data.add(obj)*/

        CoroutineScope(Dispatchers.IO).launch {
            try {
                AppDatabase.getDBInstance()!!.crashReportDao().insertCrashReport(crashReport)
                AppDatabase.getDBInstance()!!.crashReportDao().deletemultipleSameCrashReports(AppUtils.getCurrentDateyymmdd())

                Log.d("CustomExceptionHandler", "Crash report saved to database.")
            } catch (e: Exception) {
                Log.e("CustomExceptionHandler", "Failed to save crash report: ${e.message}")
            }
        }



        // Optionally, delay the termination of the app to allow the dialog to show
        //Thread.sleep(2000)

        // Let the system kill the process after the dialog is shown
        context.stopService(Intent(context, LocationFuzedService::class.java))
        exitProcess(0)
    }


}


