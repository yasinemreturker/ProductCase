package com.example.productcase.data.model.network


import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("pagination")
    val pagination: Pagination,
    @SerializedName("widgets")
    val widgets: List<Widget>
)