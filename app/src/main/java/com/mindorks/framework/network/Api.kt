package com.mindorks.framework.network

import com.mindorks.framework.db.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "9f27579c00bf2cac2ad7b467e86c5105",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}