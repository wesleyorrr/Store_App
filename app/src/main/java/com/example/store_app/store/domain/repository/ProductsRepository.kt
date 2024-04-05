package com.example.store_app.store.domain.repository

import arrow.core.Either
import com.example.store_app.store.domain.model.NetworkError
import com.example.store_app.store.domain.model.Product

interface ProductsRepository {
    suspend fun getProducts(): Either<NetworkError, List<Product>>
}