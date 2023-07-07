package com.nourelden515.cinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.nourelden515.cinematicketsreservations.R
import com.nourelden515.cinematicketsreservations.ui.screen.home.HomeUIState

@Composable
fun Timer(
    modifier: Modifier = Modifier,
    text:String,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.clock_icon),
            contentDescription = stringResource(R.string.clock),
            modifier = Modifier.padding(4.dp)
        )
        Text(text = text,textAlign = TextAlign.Center,modifier = Modifier.padding(4.dp))
    }
}