package com.breezefieldmaruthiconcreteworks.features.mylearning.apiCall

import com.breezefieldmaruthiconcreteworks.base.BaseResponse
import com.breezefieldmaruthiconcreteworks.features.addshop.presentation.Crash_Report_Save
import io.reactivex.Observable

class LMSRepo(val apiService: LMSApi) {

    fun saveCrashReportToServer(mCrash_Report_Save: Crash_Report_Save): Observable<BaseResponse> {
        return apiService.saveCrashReportToServer(mCrash_Report_Save)
    }
}