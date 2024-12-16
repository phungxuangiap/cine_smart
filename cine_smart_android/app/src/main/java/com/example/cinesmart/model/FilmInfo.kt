package com.example.cinesmart.model

import java.sql.Timestamp

data class FilmInfo (
    val id:Int,
    val film_id:Int,
    val intro:String,
    val release_date :Timestamp,
    val ranking_id:Int,
    val duration:Int,
    val description:String,
    val director:String,
    val language:String,
)

data class FilmInfoResponse (
    val message:String,
    val data:List<FilmInfo>
)