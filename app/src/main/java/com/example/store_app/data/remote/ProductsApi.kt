package com.example.store_app.data.remote

import com.example.store_app.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {
    @GET("products")
    suspend fun getProducts(): List<Product>

}