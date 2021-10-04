package com.gilbertopapa.data.model

import com.gilbertopapa.domain.model.Movie

data class MovieResponse(
    val id: Int,
    val adult: Boolean,
    val backdropPath: String?,
    val originalLanguage: String,
    val originalTitle: String,
    val overview: String,
    val popularity: Double,
    val posterPath: String?,
    val releaseDate: String?,
    val title: String,
    val video: Boolean,
    val voteAverage: Double,
    val voteCount: Int
)

fun MovieResponse.toDomainMovie() = Movie(
    id = id,
    adult = adult,
    backdropPath = backdropPath ?: "",
    originalLanguage = originalLanguage,
    originalTitle = originalTitle,
    overview = overview,
    popularity = popularity,
    posterPath = posterPath ?: "",
    releaseDate = releaseDate ?: "",
    title = title,
    video = video,
    voteAverage = voteAverage,
    voteCount = voteCount
)
