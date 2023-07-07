package com.nourelden515.cinematicketsreservations.ui.screen.home.composable

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import coil.compose.rememberAsyncImagePainter
import com.nourelden515.cinematicketsreservations.ui.screen.home.HomeUIState
import kotlin.math.absoluteValue

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun MoviePager(
    modifier: Modifier = Modifier,
    state: HomeUIState,
    pagerState: PagerState,
    onClickMovie: (Int) -> Unit,
) {
    HorizontalPager(
        modifier = modifier,
        state = pagerState,
        contentPadding = PaddingValues(start = 42.dp, end = 42.dp),
        pageSpacing = 16.dp
    ) { page ->
        Card(
            onClick = { onClickMovie(state.movies[page].id) },
            modifier = Modifier
                .aspectRatio(4f / 5.5f)
                .graphicsLayer {
                    val pageOffset =
                        (pagerState
                            .currentPage - page
                                + pagerState.currentPageOffsetFraction)
                            .absoluteValue

                    alpha = lerp(
                        start = 0.8f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceAtLeast(0f)
                    )

                    scaleY = lerp(
                        start = 0.85f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceAtLeast(0f)
                    )
                },
            elevation = CardDefaults.cardElevation(0.dp),
            shape = RoundedCornerShape(32.dp)
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
                painter = rememberAsyncImagePainter(model = state.movies[page].imageUrl),
                contentDescription = state.movies[page].imageContentDescription
            )
        }
    }
}