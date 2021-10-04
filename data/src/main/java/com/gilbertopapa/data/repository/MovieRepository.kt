package com.gilbertopapa.data.repository

import com.gilbertopapa.domain.model.Movie
import com.gilbertopapa.domain.model.Movies
import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    fun getMoviesPopular(): Flow<Result<Movies>>

    fun getMoviesUpcoming(): Flow<Result<Movies>>

    fun getMoviesTopRated(): Flow<Result<Movies>>

    fun getMovieDetail(id: Int): Flow<Result<Movie>>
}