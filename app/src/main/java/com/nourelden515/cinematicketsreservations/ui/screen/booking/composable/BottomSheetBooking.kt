package com.nourelden515.cinematicketsreservations.ui.screen.booking.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.nourelden515.cinematicketsreservations.ui.composable.SpacerVertical16
import com.nourelden515.cinematicketsreservations.ui.composable.SpacerVertical24
import com.nourelden515.cinematicketsreservations.ui.screen.booking.BookingUiState

@Composable
fun BottomSheetBooking(
    modifier: Modifier = Modifier,
    state: BookingUiState,
    onClickByTickets: () -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 8.dp)
            .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
            .background(Color.White)
    ) {
        SpacerVertical24()
        Days(state)
        SpacerVertical24()
        Times(state)
        SpacerVertical16()
        Footer(
            state = state,
            onClickByTickets = onClickByTickets
        )
    }
}