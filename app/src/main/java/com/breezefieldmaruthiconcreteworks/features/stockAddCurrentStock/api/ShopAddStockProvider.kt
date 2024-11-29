package com.breezefieldmaruthiconcreteworks.features.stockAddCurrentStock.api

import com.breezefieldmaruthiconcreteworks.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldmaruthiconcreteworks.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}