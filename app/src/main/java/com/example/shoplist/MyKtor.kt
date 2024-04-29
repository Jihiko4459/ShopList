package com.example.shoplist

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

class MyKtor {
    private val client= HttpClient()

    suspend fun greeting():String{
        val response=client.get("https://dummyjson.com/products/1")
        return response.bodyAsText()
    }
}