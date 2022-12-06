package com.bignerdranch.android.homeworkservice.data


import com.google.gson.annotations.SerializedName

data class Contexts(
    @SerializedName("groupings")
    val groupings: List<String>
)