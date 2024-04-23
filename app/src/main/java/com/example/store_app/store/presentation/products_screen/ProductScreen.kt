package com.example.store_app.store.presentation.products_screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.store_app.store.presentation.ultil.components.LoadingDialog
import com.example.store_app.store.presentation.ultil.components.MyTopAppBar

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
           MyTopAppBar(title = "Products")
        }
    ) {
LazyVerticalStaggeredGrid(modifier = Modifier.padding(top = it.calculateTopPadding()) ,
    columns = StaggeredGridCells.Fixed(2)
){
 items(state.products){
    products ->
}
}
    }
}