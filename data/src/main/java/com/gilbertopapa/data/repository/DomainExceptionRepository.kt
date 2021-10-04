package com.gilbertopapa.data.repository

import com.gilbertopapa.data.exception.DomainException

interface DomainExceptionRepository {
    fun manageError(error: Throwable): DomainException
}