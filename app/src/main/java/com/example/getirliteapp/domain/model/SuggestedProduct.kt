package com.example.getirliteapp.domain.model

data class SuggestedProduct(
    val id: String,
    val imageURL: String,
    val name: String,
    val price: Double,
    val priceText: String,
    val shortDescription: String
)