package com.sid1723431.android_weather.service

import com.sid1723431.android_weather.model.WeatherModel
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class WeatherAPIService {

    //https://api.openweathermap.org/data/2.5/weather?q=bingol&APPID=813e3a9b93bdb7cd510452b0e49af603

    private val BASE_URL = "https://api.openweathermap.org/"

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(WeatherAPI::class.java)

    fun getDataService(cityName: String): Single<WeatherModel> {
        return api.getData(cityName)
    }

}