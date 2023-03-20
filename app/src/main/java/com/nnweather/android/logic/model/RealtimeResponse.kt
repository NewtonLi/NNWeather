package com.nnweather.android.logic.model

import com.google.gson.annotations.SerializedName

/*{
    "status": "ok",
    "result": {
         "realtime":{
            "temperature": 23.16,
            "skycon": "WIND",
            "air_quality": {
                "aqi": {
                    "chn": 17.0
                }
            }
        }
    }
}*/
/**
 * Realtime response
 *
 * @property status
 * @property result
 * @constructor 获取实时天气信息接口
 */
data class RealtimeResponse(val status:String, val result:Result) {

    data class Result(val realtime:Realtime)

    data class Realtime(val skycon:String, val temperature:Float, @SerializedName("air_quality") val airQuality:AirQuality)

    data class AirQuality(val aqi:AQI)

    data class AQI(val chn:Float)
}