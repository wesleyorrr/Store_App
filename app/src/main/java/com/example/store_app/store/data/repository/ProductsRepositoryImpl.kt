package com.example.store_app.store.data.repository

import arrow.core.Either
import com.example.store_app.store.data.mapper.toNetworkError
import com.example.store_app.store.data.remote.ProductsApi
import com.example.store_app.store.domain.model.NetworkError
import com.example.store_app.store.domain.model.Product
import com.example.store_app.store.domain.repository.ProductsRepository

class ProductsRepositoryImpl constructor(
    private val productsApi: ProductsApi
): ProductsRepository {
    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
       return Either.catch {
           productsApi.getProducts()
       } .mapLeft { it.toNetworkError() }
    }
}