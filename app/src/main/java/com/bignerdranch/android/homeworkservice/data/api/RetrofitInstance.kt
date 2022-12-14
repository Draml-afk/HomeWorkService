package com.bignerdranch.android.homeworkservice.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.artic.edu/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val retroServer = retrofit.create(ApiService::class.java)


}