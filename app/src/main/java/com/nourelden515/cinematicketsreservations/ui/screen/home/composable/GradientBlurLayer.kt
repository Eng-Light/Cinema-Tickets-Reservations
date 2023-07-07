package com.nourelden515.cinematicketsreservations.ui.screen.home.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun GradientBlurLayer() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    startY = 900f,
                    endY = 1300f,
                    colors = listOf(
                        Color.Transparent,
                        Color.White,
                    )
                )
            )
    )
}