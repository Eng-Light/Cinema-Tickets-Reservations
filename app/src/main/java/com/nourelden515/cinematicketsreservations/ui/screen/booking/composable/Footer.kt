package com.nourelden515.cinematicketsreservations.ui.screen.booking.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nourelden515.cinematicketsreservations.R
import com.nourelden515.cinematicketsreservations.ui.composable.IconButton
import com.nourelden515.cinematicketsreservations.ui.screen.booking.BookingUiState
import com.nourelden515.cinematicketsreservations.ui.theme.Gray
import com.nourelden515.cinematicketsreservations.ui.theme.Orange

@Composable
fun Footer(
    modifier: Modifier = Modifier,
    state: BookingUiState,
    onClickByTickets: () -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(horizontalAlignment = Alignment.Start) {
            Text(text = "$${state.totalPrice}", color = Color.Black, fontSize = 28.sp)
            Text(
                text = state.numberOfTickets.toString() + stringResource(R.string.tickets),
                color = Gray, fontSize = 12.sp
            )
        }
        IconButton(
            onClick = onClickByTickets,
            text = stringResource(R.string.buy_tickets),
            icon = R.drawable.booking_icon,
            color = Orange
        )
    }
}