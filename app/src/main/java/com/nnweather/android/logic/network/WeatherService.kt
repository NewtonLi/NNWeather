package com.nnweather.android.logic.network

import com.nnweather.android.NNWeatherApplication
import com.nnweather.android.logic.model.DailyResponse
import com.nnweather.android.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {

    @GET("v2.5/${NNWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng:String, @Path("lat") lat:String):Call<RealtimeResponse>

    @GET("v2.5/${NNWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng:String, @Path("lat") lat:String):Call<DailyResponse>

}