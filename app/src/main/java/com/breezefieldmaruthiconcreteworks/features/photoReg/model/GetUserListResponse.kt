package com.breezefieldmaruthiconcreteworks.features.photoReg.model

import com.breezefieldmaruthiconcreteworks.features.stockAddCurrentStock.model.CurrentStockGetDataDtls

class GetUserListResponse {
    var status:String ? = null
    var message:String ? = null
    var user_list :ArrayList<UserListResponseModel>? = null
}