package com.breezefieldmaruthiconcreteworks.features.mylearning.apiCall

import com.breezefieldmaruthiconcreteworks.features.login.api.opportunity.OpportunityListApi
import com.breezefieldmaruthiconcreteworks.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}