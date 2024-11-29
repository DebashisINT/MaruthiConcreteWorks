package com.breezefieldmaruthiconcreteworks.features.newcollection.model

import com.breezefieldmaruthiconcreteworks.app.domain.CollectionDetailsEntity
import com.breezefieldmaruthiconcreteworks.base.BaseResponse
import com.breezefieldmaruthiconcreteworks.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}