package com.breezefieldmaruthiconcreteworks.features.viewAllOrder.interf

import com.breezefieldmaruthiconcreteworks.app.domain.NewOrderColorEntity
import com.breezefieldmaruthiconcreteworks.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}