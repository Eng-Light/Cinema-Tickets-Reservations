package com.nourelden515.cinematicketsreservations.ui.screen.booking.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.nourelden515.cinematicketsreservations.ui.screen.booking.BookingUiState

@Composable
fun Days(state: BookingUiState) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(state.days) { item ->
            DayItem(
                dayText = item.dayText,
                dayNumber = item.dayNumber.toString()
            )
        }
    }
}