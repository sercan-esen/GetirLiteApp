package com.example.getirliteapp.data.remote

import com.example.getirliteapp.domain.model.Product
import com.example.getirliteapp.domain.model.SuggestedProduct
import retrofit2.http.GET

interface ApiService {
    @GET("suggestedProducts")
    suspend fun getSuggestedProducts() : List<SuggestedProduct>

    @GET("products")
    suspend fun getProducts() : List<Product>

}