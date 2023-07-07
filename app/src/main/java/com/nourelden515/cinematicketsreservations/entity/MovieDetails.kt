package com.nourelden515.cinematicketsreservations.entity

data class MovieDetails(
    val id: Int,
    val imageUrl: String,
    val imageContentDescription: String,
    val name: String,
    val categories: List<String>,
    val time: String,
    val cast: List<String>,
    val description: String,
    val imdbRate: String,
    val rottenTomatoesRate: String,
    val ignRate: String,
)
