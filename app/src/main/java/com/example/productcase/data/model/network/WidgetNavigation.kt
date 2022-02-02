package com.example.productcase.data.model.network


import com.google.gson.annotations.SerializedName

data class WidgetNavigation(
    @SerializedName("deeplink")
    val deeplink: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("landingTitle")
    val landingTitle: String,
    @SerializedName("navigationType")
    val navigationType: String
)