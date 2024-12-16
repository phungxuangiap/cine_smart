package com.example.cinesmart.model




data class Comment(
    val user_id:Int,
    val ranking_id:Int,
    val film_id:Int,
    val content:String,
    val total_like:Int,
    val total_reply:Int,
    val total_share:Int
)

data class CommentResponse(
    val message:String,
    val data:List<Comment>
)

