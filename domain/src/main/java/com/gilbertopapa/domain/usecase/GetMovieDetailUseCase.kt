package com.gilbertopapa.domain.usecase

import com.gilbertopapa.data.repository.MovieRepository
import com.gilbertopapa.domain.model.Movie
import kotlinx.coroutines.flow.Flow

class GetMovieDetailUseCase(private val movieRepository: MovieRepository) {

    operator fun invoke(id: Int): Flow<Result<Movie>> =
        movieRepository.getMovieDetail(id)
}