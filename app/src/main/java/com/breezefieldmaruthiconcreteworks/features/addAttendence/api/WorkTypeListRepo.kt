package com.breezefieldmaruthiconcreteworks.features.addAttendence.api

import com.breezefieldmaruthiconcreteworks.app.Pref
import com.breezefieldmaruthiconcreteworks.features.addAttendence.model.WorkTypeResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 31-08-2018.
 */
class WorkTypeListRepo(val apiService: WorkTypeListApi) {
    fun getWorkTypeList(): Observable<WorkTypeResponseModel> {
        return apiService.getWorkType(Pref.user_id!!)
    }
}