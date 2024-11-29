package com.breezefieldmaruthiconcreteworks.features.login.model.opportunitymodel

import com.breezefieldmaruthiconcreteworks.app.domain.OpportunityStatusEntity
import com.breezefieldmaruthiconcreteworks.app.domain.ProductListEntity
import com.breezefieldmaruthiconcreteworks.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}