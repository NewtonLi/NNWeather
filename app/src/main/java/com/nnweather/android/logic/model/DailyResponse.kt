package com.nnweather.android.logic.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class DailyResponse(val status:String, val result:Result) {

    data class Result(val daily: Daily)

    data class Daily(val temperature: List<Temperature>,
                     val skycon:List<Skycon>,
    @SerializedName("life_index") val lifeIndex:LiftIndex)

    data class Temperature(val max:Float, val min:Float)

    data class Skycon(val value: String, val date:Date)

    data class LiftIndex(val coldRisk:List<LiftDescription>,
                         val carWashing:List<LiftDescription>,
                         val ultraviolet:List<LiftDescription>,
                         val dressing:List<LiftDescription>)

    data class LiftDescription(val desc:String)
}
