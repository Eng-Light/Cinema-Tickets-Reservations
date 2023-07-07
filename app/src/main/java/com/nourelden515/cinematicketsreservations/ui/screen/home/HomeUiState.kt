package com.nourelden515.cinematicketsreservations.ui.screen.home

import com.nourelden515.cinematicketsreservations.entity.Movie

data class HomeUIState(
    val movies: List<MovieUIState> = emptyList(),
)

data class MovieUIState(
    val id: Int,
    val imageUrl: String,
    val imageContentDescription: String,
    val name: String,
    val categories: List<String>,
    val time: String,
)

fun List<Movie>.toMovieUiState(): List<MovieUIState> {
    return this.map {
        MovieUIState(
            id = it.id,
            imageUrl = it.imageUrl,
            imageContentDescription = it.imageContentDescription,
            name = it.name,
            categories = it.categories,
            time = it.time
        )
    }
}