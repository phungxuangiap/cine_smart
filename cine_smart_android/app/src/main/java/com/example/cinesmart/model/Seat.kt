package com.example.cinesmart.model



data class Seat(
    val perform_id:Int,
    val charge:Int,
    val x:Int,
    val y:Int,
    val user_id:Int,
)

data class SeatResponse(
    val message:String,
    val data:List<Seat>
)
