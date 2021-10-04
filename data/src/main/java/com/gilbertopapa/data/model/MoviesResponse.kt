package com.gilbertopapa.data.model

import com.gilbertopapa.domain.model.Movie
import com.gilbertopapa.domain.model.Movies

data class MoviesResponse(
    val page: Int,
    val movies: List<MovieResponse>,
    val totalPages: Int,
    val totalResults: Int
)

fun MoviesResponse.toDomainMovies() = Movies(
    page = page,
    totalPages = totalPages,
    totalResults = totalResults,
    movies = movies.map {
        Movie(
            id = it.id,
            adult = it.adult,
            backdropPath = it.backdropPath ?: "",
            originalLanguage = it.originalLanguage,
            originalTitle = it.originalTitle,
            overview = it.overview,
            popularity = it.popularity,
            posterPath = it.posterPath ?: "",
            releaseDate = it.releaseDate ?: "",
            title = it.title,
            video = it.video,
            voteAverage = it.voteAverage,
            voteCount = it.voteCount
        )
    }
)

