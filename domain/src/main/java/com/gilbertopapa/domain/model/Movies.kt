package com.gilbertopapa.domain.model

data class Movies(
    val page: Int,
    val movies: List<Movie>,
    val totalPages: Int,
    val totalResults: Int
)