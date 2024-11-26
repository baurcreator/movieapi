package com.example.movieapi

import com.example.movieapi.models.TvShowResponse
import com.example.movieapi.util.Constants
import retrofit2.http.GET
import retrofit2.Response


interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getTvShows():Response<TvShowResponse>

}