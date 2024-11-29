package com.breezefieldmaruthiconcreteworks.features.viewAllOrder.interf

import com.breezefieldmaruthiconcreteworks.app.domain.NewOrderProductEntity
import com.breezefieldmaruthiconcreteworks.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}