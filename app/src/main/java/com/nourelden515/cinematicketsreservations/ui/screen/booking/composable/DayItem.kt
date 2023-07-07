package com.nourelden515.cinematicketsreservations.ui.screen.booking.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nourelden515.cinematicketsreservations.ui.theme.Gray
import com.nourelden515.cinematicketsreservations.ui.theme.TextBlack

@Composable
fun DayItem(
    dayNumber: String,
    dayText: String,
) {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(Color.Transparent)
            .border(0.1.dp, Gray, RoundedCornerShape(16.dp)),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            modifier = Modifier.padding(top = 8.dp, end = 16.dp, start = 16.dp),
            text = dayNumber,
            fontSize = 20.sp,
            color = TextBlack
        )
        Text(
            modifier = Modifier.padding(bottom = 8.dp),
            text = dayText,
            color = Gray,
            fontSize = 12.sp
        )
    }
}