package com.breezefieldmaruthiconcreteworks.features.viewAllOrder.model

import com.breezefieldmaruthiconcreteworks.app.domain.NewOrderColorEntity
import com.breezefieldmaruthiconcreteworks.app.domain.NewOrderGenderEntity
import com.breezefieldmaruthiconcreteworks.app.domain.NewOrderProductEntity
import com.breezefieldmaruthiconcreteworks.app.domain.NewOrderSizeEntity
import com.breezefieldmaruthiconcreteworks.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

