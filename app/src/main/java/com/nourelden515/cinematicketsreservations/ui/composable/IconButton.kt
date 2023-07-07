package com.nourelden515.cinematicketsreservations.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    text: String,
    icon: Int,
    color: Color,
    onClick: () -> Unit,
) {
    Row(
        modifier = modifier
            .clickable {
                onClick()
            }
            .clip(shape = RoundedCornerShape(32.dp))
            .background(color)
            .wrapContentSize()
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier
                .wrapContentSize()
                .padding(start = 20.dp)
                .align(Alignment.CenterVertically)
        )
        SpacerHorizontal8()
        Text(
            text = text,
            color = Color.White,
            modifier = Modifier.padding(end = 20.dp, top = 12.dp, bottom = 12.dp)
        )
    }
}