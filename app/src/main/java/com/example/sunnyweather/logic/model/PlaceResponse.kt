package com.example.sunnyweather.logic.model


import com.google.gson.annotations.SerializedName

/**
 * Created by lw on 2021/9/7 20:11.
 */
data class PlaceResponse(val status: String, val places: List<Place>)
data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String,
)

data class Location(val lng: String, val lat: String)
