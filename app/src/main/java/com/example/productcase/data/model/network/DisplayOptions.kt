package com.example.productcase.data.model.network


import com.google.gson.annotations.SerializedName

data class DisplayOptions(
    @SerializedName("paddingRightLeft")
    val paddingRightLeft: Int,
    @SerializedName("paddingTopBottom")
    val paddingTopBottom: Int,
    @SerializedName("showClearButton")
    val showClearButton: Boolean,
    @SerializedName("showCountOnTitle")
    val showCountOnTitle: Boolean,
    @SerializedName("showCountdown")
    val showCountdown: Boolean,
    @SerializedName("showProductFavoredButton")
    val showProductFavoredButton: Boolean,
    @SerializedName("showProductPrice")
    val showProductPrice: Boolean
)