package com.nourelden515.cinematicketsreservations.ui.screen.home.composable

import androidx.compose.runtime.Composable
import com.nourelden515.cinematicketsreservations.ui.composable.MovieCategories
import com.nourelden515.cinematicketsreservations.ui.composable.MovieTitle
import com.nourelden515.cinematicketsreservations.ui.composable.Timer
import com.nourelden515.cinematicketsreservations.ui.screen.home.HomeUIState

@Composable
fun BottomSheetHome(
    state: HomeUIState,
    page: Int,
) {
    Timer(text = state.movies[page].time)
    MovieTitle(state.movies[page].name)
    MovieCategories(categories = state.movies[page].categories)
}