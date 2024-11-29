package com.breezefieldmaruthiconcreteworks.features.viewAllOrder.orderOptimized

import com.breezefieldmaruthiconcreteworks.app.domain.ProductOnlineRateTempEntity
import com.breezefieldmaruthiconcreteworks.base.BaseResponse
import com.breezefieldmaruthiconcreteworks.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}