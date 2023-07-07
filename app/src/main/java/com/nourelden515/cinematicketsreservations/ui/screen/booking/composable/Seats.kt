package com.nourelden515.cinematicketsreservations.ui.screen.booking.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nourelden515.cinematicketsreservations.ui.screen.booking.BookingUiState

@Composable
fun Seats(
    state: BookingUiState,
) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.Center,
    ) {
        items(state.rows) { row ->
            SeatsRow(state = row)
        }
    }
}