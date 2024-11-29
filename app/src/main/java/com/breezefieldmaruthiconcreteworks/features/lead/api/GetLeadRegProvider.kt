package com.breezefieldmaruthiconcreteworks.features.lead.api

import com.breezefieldmaruthiconcreteworks.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldmaruthiconcreteworks.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}