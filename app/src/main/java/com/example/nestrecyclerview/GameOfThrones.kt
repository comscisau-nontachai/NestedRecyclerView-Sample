package com.example.nestrecyclerview

import com.google.gson.annotations.SerializedName

data class GameOfThrones(
    @SerializedName("members")
    var member : List<Member>,
    var name : String,
    var slug: String
){
    data class Member(
        val name : String,
        val slug : String
    )
}