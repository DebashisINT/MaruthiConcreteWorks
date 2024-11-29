package com.breezefieldmaruthiconcreteworks.features.newcollectionreport

import com.breezefieldmaruthiconcreteworks.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}