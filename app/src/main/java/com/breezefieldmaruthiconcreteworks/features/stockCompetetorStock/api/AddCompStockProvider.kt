package com.breezefieldmaruthiconcreteworks.features.stockCompetetorStock.api

object AddCompStockProvider {
    fun provideCompStockRepositiry(): AddCompStockRepository{
        return AddCompStockRepository(AddCompStockApi.create())
    }

}