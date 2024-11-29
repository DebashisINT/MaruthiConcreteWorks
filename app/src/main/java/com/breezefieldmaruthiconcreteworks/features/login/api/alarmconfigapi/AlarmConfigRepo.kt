package com.breezefieldmaruthiconcreteworks.features.login.api.alarmconfigapi

import com.breezefieldmaruthiconcreteworks.app.Pref
import com.breezefieldmaruthiconcreteworks.features.login.model.alarmconfigmodel.AlarmConfigResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 19-02-2019.
 */
class AlarmConfigRepo(val apiService: AlarmConfigApi) {
    fun alarmConfig(): Observable<AlarmConfigResponseModel> {
        return apiService.alarmConfigResponse(Pref.session_token!!, Pref.user_id!!)
    }
}