package com.breezefieldmaruthiconcreteworks.features.nearbyuserlist.api

import com.breezefieldmaruthiconcreteworks.app.Pref
import com.breezefieldmaruthiconcreteworks.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldmaruthiconcreteworks.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldmaruthiconcreteworks.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}