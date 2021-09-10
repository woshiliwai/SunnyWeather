package com.example.sunnyweather.logic.model

/**
 * Created by lw on 2021/9/10 19:44.
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)