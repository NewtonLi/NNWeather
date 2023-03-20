package com.nnweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * N n weather application
 *
 * @constructor Create empty N n weather application
 */
class NNWeatherApplication:Application() {

    companion object {

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "p2y2igbRk8vFMTsC"

    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}