package com.breezefieldmaruthiconcreteworks.features.document.api

import com.breezefieldmaruthiconcreteworks.features.dymanicSection.api.DynamicApi
import com.breezefieldmaruthiconcreteworks.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}