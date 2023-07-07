package com.nourelden515.cinematicketsreservations.ui.screen.moviedetails.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nourelden515.cinematicketsreservations.R

@Composable
fun PlayerIcon(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.player_icon),
            contentDescription = "",
            modifier = Modifier.size(48.dp / 2)
        )
    }
}