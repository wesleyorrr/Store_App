package com.example.store_app.store.presentation.products_screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.store_app.store.presentation.ultil.LoadingDialog

@Composable
internal fun ProductsScreen(){

}
@Composable

fun ProductsContext(
    state: ProductsViewState
){

LoadingDialog(isLoading = state.isLoading)
    Scaffold(  modifier = Modifier.fillMaxWidth(),
        topBar ={

        } ) {
// so comentario:
    }
}