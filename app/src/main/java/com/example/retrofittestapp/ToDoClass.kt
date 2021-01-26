package com.example.retrofittestapp

data class ToDoClass(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)