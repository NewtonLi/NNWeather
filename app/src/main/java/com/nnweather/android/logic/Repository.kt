package com.nnweather.android.logic

import androidx.lifecycle.liveData
import com.nnweather.android.logic.model.Place
import com.nnweather.android.logic.network.NNWeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException

object Repository {

    fun seachPlaces(query:String) =  liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = NNWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}