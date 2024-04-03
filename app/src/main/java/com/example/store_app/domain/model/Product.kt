package com.example.store_app.domain.model

data class Product (val id : Int,
                    val description: String,
                    val title : String,
                    val price : String,
                    val category: String,
                    val image: String,

                    )

data class Rating(
    val rage: Double,
    val count:Int
)