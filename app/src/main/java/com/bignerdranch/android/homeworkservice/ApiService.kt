package com.bignerdranch.android.homeworkservice

import com.bignerdranch.android.homeworkservice.data.Result
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    // https://api.artic.edu/api/v1/artworks/
    // 129884

    @GET("/api/v1/artworks/{id}")
    suspend fun getText(
       @Path("id") id : Int
   ) : Result

}