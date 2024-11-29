package com.breezefieldmaruthiconcreteworks.features.orderList.model

import com.breezefieldmaruthiconcreteworks.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}