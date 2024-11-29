package com.breezefieldmaruthiconcreteworks.features.weather.api

import com.breezefieldmaruthiconcreteworks.base.BaseResponse
import com.breezefieldmaruthiconcreteworks.features.task.api.TaskApi
import com.breezefieldmaruthiconcreteworks.features.task.model.AddTaskInputModel
import com.breezefieldmaruthiconcreteworks.features.weather.model.ForeCastAPIResponse
import com.breezefieldmaruthiconcreteworks.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}