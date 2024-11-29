package com.breezefieldmaruthiconcreteworks.features.location.shopRevisitStatus

import com.breezefieldmaruthiconcreteworks.base.BaseResponse
import com.breezefieldmaruthiconcreteworks.features.location.model.ShopDurationRequest
import com.breezefieldmaruthiconcreteworks.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}