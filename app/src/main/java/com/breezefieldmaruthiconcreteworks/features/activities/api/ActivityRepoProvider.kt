package com.breezefieldmaruthiconcreteworks.features.activities.api

import com.breezefieldmaruthiconcreteworks.features.member.api.TeamApi
import com.breezefieldmaruthiconcreteworks.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}