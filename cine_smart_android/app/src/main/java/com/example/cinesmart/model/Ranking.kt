package com.example.cinesmart.model



data class Ranking(
    val id:Int,
    val total_Ranking:Array<Float>
)
data class RankingResponse(
    val message:String,
    val data:List<Ranking>
)
