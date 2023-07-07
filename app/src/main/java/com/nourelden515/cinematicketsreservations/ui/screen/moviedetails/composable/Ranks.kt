package com.nourelden515.cinematicketsreservations.ui.screen.moviedetails.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.nourelden515.cinematicketsreservations.R
import com.nourelden515.cinematicketsreservations.ui.composable.RankText
import com.nourelden515.cinematicketsreservations.ui.screen.moviedetails.MovieDetailsUiState

@Composable
fun Ranks(state: MovieDetailsUiState) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        RankText(stringResource(R.string.imdb), stringResource(R.string._10), state.imdbRate)
        RankText(stringResource(R.string.rotten_tomatoes), "", state.rottenTomatoesRate)
        RankText(stringResource(R.string.ign), stringResource(R.string._10), state.ignRate)
    }
}