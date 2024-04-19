package com.example.store_app.store.presentation.products_screen

import androidx.lifecycle.ViewModel
import com.example.store_app.store.domain.repository.ProductsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class ProducyScreenViewModel @Inject constructor(
    private val productsRepository:ProductsRepository
):ViewModel() {
    private val _state = MutableStateFlow(ProductsViewState())
    val state = _state.asStateFlow()

    fun getProducts(){

    }
}