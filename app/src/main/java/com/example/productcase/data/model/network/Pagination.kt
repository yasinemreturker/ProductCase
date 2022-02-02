package com.example.productcase.data.model.network


import com.google.gson.annotations.SerializedName

data class Pagination(
    @SerializedName("currentPage")
    val currentPage: Int,
    @SerializedName("pageSize")
    val pageSize: Int,
    @SerializedName("totalCount")
    val totalCount: Int
)