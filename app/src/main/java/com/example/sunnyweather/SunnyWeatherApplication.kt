package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * Created by lw on 2021/9/7 20:08.
 */
class SunnyWeatherApplication : Application() {
    companion object{

        const val TOKEN = "zxcNTJuGq8xfSLbX" // 填入你申请到的令牌值

        @SuppressLint("StaticFileLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}