package com.example.productcase.data.model.network


import com.google.gson.annotations.SerializedName

data class Widget(
    @SerializedName("bannerContents")
    val bannerContents: List<BannerContent>,
    @SerializedName("displayCount")
    val displayCount: Int,
    @SerializedName("displayOptions")
    val displayOptions: DisplayOptions,
    @SerializedName("displayType")
    val displayType: String,
    @SerializedName("endDate")
    val endDate: String,
    @SerializedName("eventKey")
    val eventKey: String,
    @SerializedName("fullServiceUrl")
    val fullServiceUrl: String,
    @SerializedName("fullServiceUrlWithPage")
    val fullServiceUrlWithPage: String,
    @SerializedName("height")
    val height: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("marketing")
    val marketing: MarketingX,
    @SerializedName("refreshRequired")
    val refreshRequired: Boolean,
    @SerializedName("serviceUrl")
    val serviceUrl: String,
    @SerializedName("startDate")
    val startDate: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("widgetNavigation")
    val widgetNavigation: WidgetNavigation,
    @SerializedName("width")
    val width: Int
)