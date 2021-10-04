package com.gilbertopapa.data.repository

import com.gilbertopapa.data.api.MovieAPI
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.transform


class MovieRepositoryImpl(
    private val movieAPI: MovieAPI,
    private val apiKey: String,
    private val domainExceptionRepository: DomainExceptionRepository
) : MovieRepository {

    override fun getMoviesPopular() =
        movieAPI.getMoviesPopular(apiKey).transform { apiResult ->
            emit(Result.Success(apiResult.toDomainMovies()))
        }.catch {
            throw domainExceptionRepository.manageError(it)
        }

    override fun getMoviesUpcoming() =
        movieAPI.getMoviesUpcoming(apiKey).transform { apiResult ->
            emit(Result.Success(apiResult.toDomainMovies()))
        }.catch {
            throw domainExceptionRepository.manageError(it)
        }

    override fun getMoviesTopRated() =
        movieAPI.getMoviesTopRated(apiKey).transform { apiResult ->
            emit(Result.Success(apiResult.toDomainMovies()))
        }.catch {
            throw domainExceptionRepository.manageError(it)
        }

    override fun getMovieDetail(id: Int) =
        movieAPI.getMovieDetail(id, apiKey).transform { apiResult ->
            emit(Result.Success(apiResult.toDomainMovie()))
        }.catch {
            throw domainExceptionRepository.manageError(it)
        }
}