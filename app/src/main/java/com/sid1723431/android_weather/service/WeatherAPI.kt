package com.sid1723431.android_weather.service

import com.sid1723431.android_weather.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {

    //https://api.openweathermap.org/data/2.5/weather?q=bingöl&APPID=813e3a9b93bdb7cd510452b0e49af603

    @GET("data/2.5/weather?&units=metric&APPID=813e3a9b93bdb7cd510452b0e49af603")
    fun getData(
        @Query("q") cityName: String
    ): Single<WeatherModel>

}