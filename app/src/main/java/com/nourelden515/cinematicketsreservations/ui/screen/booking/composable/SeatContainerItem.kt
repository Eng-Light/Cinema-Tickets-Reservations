package com.nourelden515.cinematicketsreservations.ui.screen.booking.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.nourelden515.cinematicketsreservations.R

@Composable
fun SeatContainerItem(
    modifier: Modifier = Modifier,
    firstSeatColor: Color,
    secondSeatColor: Color,
    containerColor: Color,
) {
    Box(
        modifier = modifier
            .width(90.dp)
            .height(50.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .padding(
                    bottom = 8.dp,
                    start = 8.dp,
                    end = 8.dp,
                    top = 0.dp
                )
                .fillMaxWidth()
        ) {
            Icon(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize(),
                painter = painterResource(id = R.drawable.seat_icon),
                contentDescription = stringResource(id = R.string.content_description),
                tint = firstSeatColor
            )
            Icon(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize(),
                painter = painterResource(id = R.drawable.seat_icon),
                contentDescription = stringResource(id = R.string.content_description),
                tint = secondSeatColor
            )
        }
        Icon(
            modifier = Modifier
                .fillMaxSize(),
            painter = painterResource(id = R.drawable.seat_container_icon),
            contentDescription = stringResource(id = R.string.content_description),
            tint = containerColor
        )
    }
}