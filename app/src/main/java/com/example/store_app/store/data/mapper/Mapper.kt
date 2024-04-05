package com.example.store_app.store.data.mapper

import android.net.http.HttpException
import com.example.store_app.store.domain.model.ApiError
import com.example.store_app.store.domain.model.NetworkError
import java.io.IOException

fun Throwable.toNetworkError(): NetworkError {
    val error = when(this){
        is IOException -> ApiError.NetworkError
        is HttpException -> ApiError.UnknownResponse
        else -> ApiError.UnknownError
    }
    return NetworkError(
        error = error,
        t = this
    )
}