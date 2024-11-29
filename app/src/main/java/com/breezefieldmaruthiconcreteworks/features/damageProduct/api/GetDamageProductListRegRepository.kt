package com.breezefieldmaruthiconcreteworks.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldmaruthiconcreteworks.app.FileUtils
import com.breezefieldmaruthiconcreteworks.base.BaseResponse
import com.breezefieldmaruthiconcreteworks.features.NewQuotation.model.*
import com.breezefieldmaruthiconcreteworks.features.addshop.model.AddShopRequestData
import com.breezefieldmaruthiconcreteworks.features.addshop.model.AddShopResponse
import com.breezefieldmaruthiconcreteworks.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldmaruthiconcreteworks.features.damageProduct.model.delBreakageReq
import com.breezefieldmaruthiconcreteworks.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldmaruthiconcreteworks.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldmaruthiconcreteworks.features.myjobs.model.WIPImageSubmit
import com.breezefieldmaruthiconcreteworks.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}