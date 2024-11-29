package com.breezefieldmaruthiconcreteworks.features.location.shopRevisitStatus

import com.breezefieldmaruthiconcreteworks.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldmaruthiconcreteworks.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}