package com.nourelden515.cinematicketsreservations.ui.screen.booking.composable

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.nourelden515.cinematicketsreservations.ui.screen.booking.ContainerState
import com.nourelden515.cinematicketsreservations.ui.screen.booking.SeatState
import com.nourelden515.cinematicketsreservations.ui.screen.booking.SeatsContainerUiState
import com.nourelden515.cinematicketsreservations.ui.theme.Gray
import com.nourelden515.cinematicketsreservations.ui.theme.Orange
import com.nourelden515.cinematicketsreservations.ui.theme.White

@Composable
fun SeatsContainer(
    modifier: Modifier = Modifier,
    state: SeatsContainerUiState,
) {
    SeatContainerItem(
        modifier = modifier,
        firstSeatColor = getSeatColor(state.seats.first.state),
        secondSeatColor = getSeatColor(state.seats.second.state),
        containerColor = getContainerColor(state.state)
    )
}

private fun getContainerColor(
    state: ContainerState,
): Color {
    return when (state) {
        ContainerState.TAKEN -> Gray.copy(alpha = .60f)
        ContainerState.HALF_TAKEN -> Gray
        ContainerState.AVAILABLE -> White
        ContainerState.SELECTED -> Orange
        ContainerState.HALF_SELECTED -> Orange.copy(alpha = .60f)
    }
}

private fun getSeatColor(seatState: SeatState): Color {
    return when (seatState) {
        SeatState.AVAILABLE -> White
        SeatState.TAKEN -> Gray
        SeatState.SELECTED -> Orange
    }
}