package com.breezefieldmaruthiconcreteworks.features.photoReg.present

import com.breezefieldmaruthiconcreteworks.app.domain.ProspectEntity
import com.breezefieldmaruthiconcreteworks.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}