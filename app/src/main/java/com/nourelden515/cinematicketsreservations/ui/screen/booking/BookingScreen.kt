package com.nourelden515.cinematicketsreservations.ui.screen.booking

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.nourelden515.cinematicketsreservations.R
import com.nourelden515.cinematicketsreservations.ui.composable.CircleIconButton
import com.nourelden515.cinematicketsreservations.ui.composable.SpacerVertical16
import com.nourelden515.cinematicketsreservations.ui.composable.SpacerVertical24
import com.nourelden515.cinematicketsreservations.ui.screen.booking.composable.BottomSheetBooking
import com.nourelden515.cinematicketsreservations.ui.screen.booking.composable.HeaderImage
import com.nourelden515.cinematicketsreservations.ui.screen.booking.composable.SeatStates
import com.nourelden515.cinematicketsreservations.ui.screen.booking.composable.Seats
import com.nourelden515.cinematicketsreservations.ui.theme.BlackBackground

@Composable
fun BookingScreen(
    navController: NavHostController,
    viewModel: BookingViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsState()
    TicketContent(
        state = state,
        onClickByTickets = {},
        onClickExit = {
            navController.navigateUp()
        }
    )
}

@Composable
fun TicketContent(
    state: BookingUiState,
    modifier: Modifier = Modifier,
    onClickExit: () -> Unit,
    onClickByTickets: () -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(BlackBackground)
    ) {
        CircleIconButton(
            modifier = Modifier
                .padding(top = 32.dp, bottom = 0.dp, start = 16.dp, end = 16.dp),
            icon = R.drawable.exit_icon,
            onClickExit
        )
        HeaderImage(R.drawable.header)
        Seats(state)
        SpacerVertical24()
        SeatStates()
        SpacerVertical16()
        BottomSheetBooking(
            state = state,
            onClickByTickets = onClickByTickets
        )
    }
}