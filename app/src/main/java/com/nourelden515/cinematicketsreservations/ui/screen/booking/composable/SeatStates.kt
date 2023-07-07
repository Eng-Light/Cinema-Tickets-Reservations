package com.nourelden515.cinematicketsreservations.ui.screen.booking.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.nourelden515.cinematicketsreservations.R
import com.nourelden515.cinematicketsreservations.ui.theme.Gray
import com.nourelden515.cinematicketsreservations.ui.theme.Orange

@Composable
fun SeatStates(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        StateCard(text = stringResource(R.string.available), stateColor = Color.White)
        StateCard(text = stringResource(R.string.taken), stateColor = Gray)
        StateCard(text = stringResource(R.string.selected), stateColor = Orange)
    }
}