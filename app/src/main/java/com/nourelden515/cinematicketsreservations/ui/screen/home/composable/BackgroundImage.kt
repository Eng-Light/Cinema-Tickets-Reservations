package com.nourelden515.cinematicketsreservations.ui.screen.home.composable

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.nourelden515.cinematicketsreservations.ui.screen.home.HomeUIState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BackgroundImage(state: HomeUIState, pagerState: PagerState) {
    Image(
        modifier = Modifier
            .fillMaxSize()
            .blur(60.dp)
            .offset(y = (-200).dp),

        alignment = Alignment.Center,
        contentScale = ContentScale.Crop,
        painter = rememberAsyncImagePainter(model = state.movies[pagerState.currentPage].imageUrl),
        contentDescription = state.movies[pagerState.currentPage].imageContentDescription
    )
    GradientBlurLayer()
}