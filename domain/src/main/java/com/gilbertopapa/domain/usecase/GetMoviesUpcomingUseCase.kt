package com.gilbertopapa.domain.usecase

import com.gilbertopapa.data.repository.MovieRepository
import com.gilbertopapa.domain.model.Movies
import kotlinx.coroutines.flow.Flow

class GetMoviesUpcomingUseCase(private val movieRepository: MovieRepository) {

    operator fun invoke(): Flow<Result<Movies>> =
        movieRepository.getMoviesUpcoming()
}