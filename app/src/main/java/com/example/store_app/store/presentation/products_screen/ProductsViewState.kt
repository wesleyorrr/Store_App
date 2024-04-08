package com.example.store_app.store.presentation.products_screen

import com.example.store_app.store.domain.model.Product

data class ProductsViewState(
    val isLoading : Boolean = false,
    val products : List<Product> = emptyList(),
    val error : String? = null
)