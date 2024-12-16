package com.example.cinesmart.model

import java.sql.Timestamp

enum class FilmType {
    COMEDY,
    CARTOON,
    FAMILY,
    ADVENTURE,
    ACTION
}

data class Film(
    val id:Int,
    val title: String,
    val type:FilmType,
    val restrict_age:Timestamp,
    val ranking_id:Int,
    val poster:String,
)

data class FilmResponse (
    val message:String,
    val data:List<Film>
)
