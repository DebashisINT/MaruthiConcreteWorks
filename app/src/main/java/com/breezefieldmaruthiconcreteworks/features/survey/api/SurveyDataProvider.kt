package com.breezefieldmaruthiconcreteworks.features.survey.api

import com.breezefieldmaruthiconcreteworks.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldmaruthiconcreteworks.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}