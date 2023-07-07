package com.nourelden515.cinematicketsreservations.ui.screen.moviedetails.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nourelden515.cinematicketsreservations.R
import com.nourelden515.cinematicketsreservations.ui.composable.IconButton
import com.nourelden515.cinematicketsreservations.ui.composable.MovieCategories
import com.nourelden515.cinematicketsreservations.ui.composable.MovieTitle
import com.nourelden515.cinematicketsreservations.ui.composable.SpacerVertical12
import com.nourelden515.cinematicketsreservations.ui.composable.SpacerVertical24
import com.nourelden515.cinematicketsreservations.ui.composable.SpacerVertical8
import com.nourelden515.cinematicketsreservations.ui.screen.moviedetails.MovieDetailsUiState
import com.nourelden515.cinematicketsreservations.ui.theme.Orange
import com.nourelden515.cinematicketsreservations.ui.theme.TextBlack

@Composable
fun BottomSheetMovie(
    modifier: Modifier = Modifier,
    state: MovieDetailsUiState,
    onClickBooking: () -> Unit,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpacerVertical24()
        Ranks(state)
        MovieTitle(state.name)
        MovieCategories(state.categories)
        SpacerVertical8()
        Cast(state.cast)
        SpacerVertical8()
        Text(
            text = state.description,
            color = TextBlack,
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        SpacerVertical12()
        IconButton(
            onClick = onClickBooking,
            text = stringResource(id = R.string.booking),
            icon = R.drawable.booking_icon,
            color = Orange
        )
    }
}