package com.example.movieapi

import javax.inject.Inject

class TvShowRepository @Inject constructor(
    private val api: ApiService
){
    suspend fun getTvShows() = api.getTvShows()

}