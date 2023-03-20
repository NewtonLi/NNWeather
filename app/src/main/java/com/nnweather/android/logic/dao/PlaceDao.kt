package com.nnweather.android.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.nnweather.android.NNWeatherApplication
import com.nnweather.android.logic.model.Place

object PlaceDao {

    fun savePlace(place:Place) {
        sharePreferences().edit {
            putString("place",Gson().toJson(place))
        }
    }

    fun getSevedPlace():Place{
        val placeJson = sharePreferences().getString("place", "")
        return Gson().fromJson(placeJson,Place::class.java)
    }

    fun isPlaceSaved() = sharePreferences().contains("place")

    private fun sharePreferences() = NNWeatherApplication.context.getSharedPreferences("sunny_weather",Context.MODE_PRIVATE)
}