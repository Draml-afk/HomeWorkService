package com.bignerdranch.android.homeworkservice.data


import com.google.gson.annotations.SerializedName

data class SuggestAutocompleteAll(
    @SerializedName("contexts")
    val contexts: Contexts,
    @SerializedName("input")
    val input: List<String>,
    @SerializedName("weight")
    val weight: Int
)