package com.nourelden515.cinematicketsreservations.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.nourelden515.cinematicketsreservations.R
import com.nourelden515.cinematicketsreservations.ui.theme.White


@Composable
fun CircleIconButton(
    modifier: Modifier = Modifier,
    icon:Int,
    onClickExit: () -> Unit,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clickable {
                onClickExit()
            }
            .size(42.dp)
            .background(color = White.copy(alpha = .40f), shape = CircleShape),
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = stringResource(id = R.string.content_description),
            tint = Color.White
        )
    }
}