package com.nourelden515.cinematicketsreservations.ui.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.text.style.TextAlign
import com.nourelden515.cinematicketsreservations.ui.theme.Gray
import com.nourelden515.cinematicketsreservations.ui.theme.TextBlack

@Composable
fun RankText(text: String, mark: String, rank: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.wrapContentSize()
    ) {
        Row {
            Text(
                text = rank,
                color = TextBlack,
                textAlign = TextAlign.Center,
                modifier = Modifier.wrapContentSize()
            )
            Text(
                text = mark,
                color = Gray,
                textAlign = TextAlign.Center,
                modifier = Modifier.wrapContentSize()
            )
        }
        Text(
            text = text,
            color = Gray,
            textAlign = TextAlign.Center,
            modifier = Modifier.wrapContentSize()
        )
    }
}