package com.breezefieldmaruthiconcreteworks.features.dashboard.presentation.api.unreadnotificationapi

import com.breezefieldmaruthiconcreteworks.app.Pref
import com.breezefieldmaruthiconcreteworks.features.dashboard.presentation.model.UnreadNotificationResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 07-03-2019.
 */
class UnreadNotificationRepo(val apiService: UnreadNotificationApi) {
    fun unreadNotification(): Observable<UnreadNotificationResponseModel> {
        return apiService.unreadNotification(Pref.session_token!!, Pref.user_id!!)
    }
}