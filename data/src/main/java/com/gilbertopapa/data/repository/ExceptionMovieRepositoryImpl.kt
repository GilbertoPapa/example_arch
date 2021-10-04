package com.gilbertopapa.data.repository

import com.gilbertopapa.data.exception.CommonErrors
import com.gilbertopapa.data.exception.DomainException
import com.gilbertopapa.data.exception.HttpErrors.getHttpError
import retrofit2.HttpException

class ExceptionMovieRepositoryImpl : CommonErrors(), DomainExceptionRepository {

    override fun manageError(error: Throwable): DomainException {
        return if (error is HttpException) {
            getHttpError(error)
        } else {
            manageException(error)
        }
    }
}