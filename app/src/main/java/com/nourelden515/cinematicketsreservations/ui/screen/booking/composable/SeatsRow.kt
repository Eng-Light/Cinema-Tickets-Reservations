package com.nourelden515.cinematicketsreservations.ui.screen.booking.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp
import com.nourelden515.cinematicketsreservations.ui.screen.booking.SeatsRowUiState

@Composable
fun SeatsRow(state: SeatsRowUiState) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        state.seatContainers.forEach {
            when (it.id) {
                1 -> SeatsContainer(
                    Modifier
                        .rotate(10f),
                    state = it
                )

                2 -> SeatsContainer(
                    Modifier
                        .rotate(0f)
                        .offset(y = 10.dp),
                    state = it
                )

                3 -> SeatsContainer(
                    Modifier
                        .rotate(-10f),
                    state = it
                )
            }
        }
    }
}