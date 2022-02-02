package com.example.productcase.data.model.network


import com.google.gson.annotations.SerializedName

data class MarketingX(
    @SerializedName("delphoi")
    val delphoi: DelphoiX,
    @SerializedName("order")
    val order: Int
)