package com.gilbertopapa.data.api

import com.gilbertopapa.data.model.MovieResponse
import com.gilbertopapa.data.model.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import kotlinx.coroutines.flow.Flow

interface MovieAPI {
    @GET("movie/popular")
    fun getMoviesPopular(@Query("api_key") apiKey: String): Flow<MoviesResponse>

    @GET("movie/upcoming")
    fun getMoviesUpcoming(@Query("api_key") apiKey: String): Flow<MoviesResponse>

    @GET("movie/top_rated")
    fun getMoviesTopRated(@Query("api_key") apiKey: String): Flow<MoviesResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetail(@Path("movie_id") id: Int, @Query("api_key") apiKey: String): Flow<MovieResponse>
}