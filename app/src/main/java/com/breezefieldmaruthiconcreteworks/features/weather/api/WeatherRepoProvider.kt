package com.breezefieldmaruthiconcreteworks.features.weather.api

import com.breezefieldmaruthiconcreteworks.features.task.api.TaskApi
import com.breezefieldmaruthiconcreteworks.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}