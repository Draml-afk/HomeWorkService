package com.bignerdranch.android.homeworkservice.data


import com.google.gson.annotations.SerializedName

data class Thumbnail(
    @SerializedName("alt_text")
    val altText: String,
    @SerializedName("height")
    val height: Int,
    @SerializedName("lqip")
    val lqip: String,
    @SerializedName("width")
    val width: Int
)