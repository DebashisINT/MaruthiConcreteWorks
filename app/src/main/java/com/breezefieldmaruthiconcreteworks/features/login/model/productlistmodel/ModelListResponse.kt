package com.breezefieldmaruthiconcreteworks.features.login.model.productlistmodel

import com.breezefieldmaruthiconcreteworks.app.domain.ModelEntity
import com.breezefieldmaruthiconcreteworks.app.domain.ProductListEntity
import com.breezefieldmaruthiconcreteworks.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}