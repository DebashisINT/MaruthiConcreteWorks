package com.breezefieldmaruthiconcreteworks.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldmaruthiconcreteworks.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldmaruthiconcreteworks.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}