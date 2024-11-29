package com.breezefieldmaruthiconcreteworks.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldmaruthiconcreteworks.app.FileUtils
import com.breezefieldmaruthiconcreteworks.app.Pref
import com.breezefieldmaruthiconcreteworks.base.BaseResponse
import com.breezefieldmaruthiconcreteworks.features.addshop.model.AddLogReqData
import com.breezefieldmaruthiconcreteworks.features.addshop.model.AddShopRequestData
import com.breezefieldmaruthiconcreteworks.features.addshop.model.AddShopResponse
import com.breezefieldmaruthiconcreteworks.features.addshop.model.LogFileResponse
import com.breezefieldmaruthiconcreteworks.features.addshop.model.UpdateAddrReq
import com.breezefieldmaruthiconcreteworks.features.contacts.CallHisDtls
import com.breezefieldmaruthiconcreteworks.features.contacts.CompanyReqData
import com.breezefieldmaruthiconcreteworks.features.contacts.ContactMasterRes
import com.breezefieldmaruthiconcreteworks.features.contacts.SourceMasterRes
import com.breezefieldmaruthiconcreteworks.features.contacts.StageMasterRes
import com.breezefieldmaruthiconcreteworks.features.contacts.StatusMasterRes
import com.breezefieldmaruthiconcreteworks.features.contacts.TypeMasterRes
import com.breezefieldmaruthiconcreteworks.features.dashboard.presentation.DashboardActivity
import com.breezefieldmaruthiconcreteworks.features.login.model.WhatsappApiData
import com.breezefieldmaruthiconcreteworks.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}