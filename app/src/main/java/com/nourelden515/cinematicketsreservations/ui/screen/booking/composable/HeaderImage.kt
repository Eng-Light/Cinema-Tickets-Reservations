package com.nourelden515.cinematicketsreservations.ui.screen.booking.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.nourelden515.cinematicketsreservations.R

@Composable
fun HeaderImage(
    image: Int,
) {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(3.5f / 1f),
        painter = painterResource(id = image),
        contentDescription = stringResource(R.string.content_description),
    )
}