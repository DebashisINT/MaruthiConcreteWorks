package com.breezefieldmaruthiconcreteworks.features.viewAllOrder.interf

import com.breezefieldmaruthiconcreteworks.app.domain.NewOrderGenderEntity
import com.breezefieldmaruthiconcreteworks.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}