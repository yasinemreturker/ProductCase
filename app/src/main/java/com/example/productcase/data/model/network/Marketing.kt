package com.example.productcase.data.model.network


import com.example.productcase.data.model.network.Delphoi
import com.google.gson.annotations.SerializedName

data class Marketing(
    @SerializedName("delphoi")
    val delphoi: Delphoi,
    @SerializedName("order")
    val order: Int
)