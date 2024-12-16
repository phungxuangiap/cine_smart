package com.example.cinesmart.model


data class User(
    val id:Int,
    val email:String,
    val password: String,
    val name:String,
    val age:Int,
)

data class UserResponse (
    val message:String,
    val data: List<User>
)
