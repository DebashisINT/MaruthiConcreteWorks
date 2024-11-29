package com.breezefieldmaruthiconcreteworks.features.photoReg.adapter

import com.breezefieldmaruthiconcreteworks.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}