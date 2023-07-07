package com.nourelden515.cinematicketsreservations.entity

data class Movie(
    val id: Int,
    val imageUrl: String,
    val imageContentDescription:String,
    val name: String,
    val categories: List<String>,
    val time: String,
)