package com.nourelden515.cinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MovieTitle(text:String) {
    Text(
        modifier = Modifier
            .padding(vertical = 12.dp, horizontal = 32.dp),
        text = text,
        maxLines = 2,
        fontSize = 18.sp,
        textAlign = TextAlign.Center
    )
}