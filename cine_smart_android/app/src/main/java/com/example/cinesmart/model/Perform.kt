package com.example.cinesmart.model

import java.sql.Time
import java.sql.Timestamp


data class Perform(
    val id:Int,
    val film_id:Int,
    val start_time:Timestamp,
    val end_time:Timestamp,
    val total_seat:Int,
    val available_seat:Int,
    val x_layout:Int,
    val y_layout:Int,
)

data class PerformResponse (
    val message:String,
    val data:List<Perform>
)
