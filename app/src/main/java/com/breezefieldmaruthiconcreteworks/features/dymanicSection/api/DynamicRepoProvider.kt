package com.breezefieldmaruthiconcreteworks.features.dymanicSection.api

import com.breezefieldmaruthiconcreteworks.features.dailyPlan.api.PlanApi
import com.breezefieldmaruthiconcreteworks.features.dailyPlan.api.PlanRepo

/**
 * Created by Saikat on 19-Aug-20.
 */
object DynamicRepoProvider {
    fun dynamicRepoProvider(): DynamicRepo {
        return DynamicRepo(DynamicApi.create())
    }

    fun dynamicRepoProviderMultipart(): DynamicRepo {
        return DynamicRepo(DynamicApi.createImage())
    }
}