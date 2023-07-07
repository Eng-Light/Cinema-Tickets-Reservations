package com.nourelden515.cinematicketsreservations.ui.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nourelden515.cinematicketsreservations.ui.theme.Gray

@Composable
fun ChipButton(
    modifier: Modifier = Modifier,
    text: String = "",
    textSize: Int = 12,
    buttonColor: Color = Color.Transparent,
    textColor: Color = Color.Black,
    onClick: () -> Unit,
) {
    OutlinedButton(
        modifier = modifier
            .defaultMinSize(minWidth = 1.dp, minHeight = 1.dp),
        onClick = onClick,
        border = BorderStroke(0.5.dp, Gray),
        colors = ButtonDefaults.buttonColors(buttonColor),
    ) {
        Text(
            text = text,
            fontSize = textSize.sp,
            color = textColor
        )
    }
}

@Composable
@Preview(showBackground = false)
fun PreviewOutlinedButton() {
    ChipButton(onClick = {})
}