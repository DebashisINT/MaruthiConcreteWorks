package com.breezefieldmaruthiconcreteworks.features.viewAllOrder.interf

import com.breezefieldmaruthiconcreteworks.app.domain.NewOrderGenderEntity
import com.breezefieldmaruthiconcreteworks.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}