package com.example.productcase.data.model.network


import com.google.gson.annotations.SerializedName

data class BannerContent(
    @SerializedName("bannerEventKey")
    val bannerEventKey: String,
    @SerializedName("displayOrder")
    val displayOrder: Int,
    @SerializedName("imageUrl")
    val imageUrl: String,
    @SerializedName("marketing")
    val marketing: Marketing,
    @SerializedName("navigation")
    val navigation: Navigation,
    @SerializedName("subtitle")
    val subtitle: String,
    @SerializedName("title")
    val title: String
)