package com.breezefieldmaruthiconcreteworks.features.login.model

import com.breezefieldmaruthiconcreteworks.app.domain.QuestionSubmitEntity


class GetQtsAnsSubmitDtlsResponseModel {
    var status:String? = null
    var message:String? = null
    var Question_list: ArrayList<QuestionSubmitEntity>? = null
}