package com.breezefieldmaruthiconcreteworks.fcm.api

import com.breezefieldmaruthiconcreteworks.app.Pref
import com.breezefieldmaruthiconcreteworks.base.BaseResponse
import io.reactivex.Observable

/**
 * Created by Saikat on 27-02-2019.
 */
class UpdateDeviceTokenRepo(val apiService: UpdateDeviceTokenApi) {
    fun updateDeviceToken(deviceToken: String): Observable<BaseResponse> {
        return apiService.updateDeviceToken(Pref.user_id!!, Pref.session_token!!, deviceToken, "Android")
    }

}