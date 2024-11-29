package com.breezefieldmaruthiconcreteworks.features.stockAddCurrentStock.api

import com.breezefieldmaruthiconcreteworks.base.BaseResponse
import com.breezefieldmaruthiconcreteworks.features.location.model.ShopRevisitStatusRequest
import com.breezefieldmaruthiconcreteworks.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldmaruthiconcreteworks.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldmaruthiconcreteworks.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldmaruthiconcreteworks.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}