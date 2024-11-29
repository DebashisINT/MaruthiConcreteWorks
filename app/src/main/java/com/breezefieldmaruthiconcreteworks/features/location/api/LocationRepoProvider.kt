package com.breezefieldmaruthiconcreteworks.features.location.api

import com.breezefieldmaruthiconcreteworks.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldmaruthiconcreteworks.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}