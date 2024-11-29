package com.breezefieldmaruthiconcreteworks.features.viewAllOrder.interf

import com.breezefieldmaruthiconcreteworks.app.domain.NewOrderGenderEntity
import com.breezefieldmaruthiconcreteworks.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}