package com.breezefieldmaruthiconcreteworks.features.stockAddCurrentStock.model

import com.breezefieldmaruthiconcreteworks.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class CurrentStockGetData {
    var status:String ? = null
    var message:String ? = null
    var total_stocklist_count:String ? = null
    var stock_list :ArrayList<CurrentStockGetDataDtls>? = null
}