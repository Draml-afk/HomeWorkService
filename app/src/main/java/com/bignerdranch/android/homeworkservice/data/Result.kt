package com.bignerdranch.android.homeworkservice.data


import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("config")
    val config: Config,
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("info")
    val info: Info
)