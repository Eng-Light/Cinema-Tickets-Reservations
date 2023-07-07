package com.nourelden515.cinematicketsreservations.ui.screen.moviedetails

import androidx.lifecycle.SavedStateHandle

class MovieDetailsArgs(savedStateHandle: SavedStateHandle) {

    val movieId: String = checkNotNull(savedStateHandle[MOVIE_ID])

    companion object {
        const val MOVIE_ID = "movie_id"
    }
}