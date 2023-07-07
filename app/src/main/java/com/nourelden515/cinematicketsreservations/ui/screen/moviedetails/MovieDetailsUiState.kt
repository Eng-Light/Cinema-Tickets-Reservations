package com.nourelden515.cinematicketsreservations.ui.screen.moviedetails

import com.nourelden515.cinematicketsreservations.entity.MovieDetails

data class MovieDetailsUiState(
    val id: Int = 0,
    val imageUrl: String = "",
    val imageContentDescription: String = "",
    val name: String = "",
    val categories: List<String> = emptyList(),
    val time: String = "",
    val cast: List<String> = emptyList(),
    val description: String = "",
    val imdbRate: String = "",
    val rottenTomatoesRate: String = "",
    val ignRate: String = "",
)

fun MovieDetails.toMovieDetailsUiState(): MovieDetailsUiState {
    return MovieDetailsUiState(
        id = id,
        imageUrl = imageUrl,
        imageContentDescription = imageContentDescription,
        name = name,
        categories = categories,
        time = time,
        cast = cast,
        description = description,
        imdbRate = imdbRate,
        rottenTomatoesRate = rottenTomatoesRate,
        ignRate = ignRate
    )
}