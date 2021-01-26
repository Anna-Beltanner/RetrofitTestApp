package com.example.retrofittestapp

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ToDoApi {
    @GET("/todos")

    suspend fun getToDo(): Response<List<ToDoClass>>
}
