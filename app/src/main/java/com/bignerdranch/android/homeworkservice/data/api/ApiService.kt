package com.bignerdranch.android.homeworkservice.data.api

import com.bignerdranch.android.homeworkservice.data.Result
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    // https://api.artic.edu/api/v1/artworks/
    // 129884

    @GET("/api/v1/artworks/{id}")
   fun getText(
        @Path("id") id: Int
    ): Call<Result>

}