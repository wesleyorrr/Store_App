package com.example.store_app.store.domain.model

data class NetworkError(
    val error: ApiError,
    val t: Throwable? = null

    )

enum class ApiError(val message: String){
    NetworkError("Network Error"),
    UnknownResponse("UnknownResponse"),
    UnknownError("Unknown Error")
}

