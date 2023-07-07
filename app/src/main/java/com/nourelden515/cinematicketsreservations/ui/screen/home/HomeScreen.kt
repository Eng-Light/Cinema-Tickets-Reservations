@file:OptIn(ExperimentalFoundationApi::class)

package com.nourelden515.cinematicketsreservations.ui.screen.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.nourelden515.cinematicketsreservations.R
import com.nourelden515.cinematicketsreservations.ui.composable.ChipButton
import com.nourelden515.cinematicketsreservations.ui.composable.SpacerVertical16
import com.nourelden515.cinematicketsreservations.ui.composable.SpacerVertical64
import com.nourelden515.cinematicketsreservations.ui.screen.home.composable.BottomSheetHome
import com.nourelden515.cinematicketsreservations.ui.screen.home.composable.MoviePager
import com.nourelden515.cinematicketsreservations.ui.screen.moviedetails.navigateToMovieDetails
import com.nourelden515.cinematicketsreservations.ui.theme.Orange
import com.nourelden515.cinematicketsreservations.ui.theme.TextWhite

@Composable
fun HomeScreen(
    navController: NavHostController, viewModel: HomeViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsState()
    val pagerState = rememberPagerState(
        initialPage = 1,
    ) { state.movies.size }
    HomeContent(state = state, onClickMovie = {
        navController.navigateToMovieDetails(it)
    }, pagerState = pagerState)
}

@Composable
fun HomeContent(
    state: HomeUIState,
    onClickMovie: (Int) -> Unit,
    pagerState: PagerState,
) {
    Box(modifier = Modifier.fillMaxSize()) {

        BackgroundImage(state, pagerState)

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SpacerVertical64()
            Header()
            SpacerVertical16()
            MoviePager(
                modifier = Modifier
                    .fillMaxWidth(),
                state = state,
                pagerState = pagerState,
                onClickMovie = onClickMovie
            )
            SpacerVertical16()
            BottomSheetHome(
                page = pagerState.currentPage,
                state = state
            )
        }
    }
}

@Composable
private fun BackgroundImage(state: HomeUIState, pagerState: PagerState) {
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

@Composable
private fun GradientBlurLayer() {
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


@Composable
private fun Header() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        ChipButton(
            modifier = Modifier.padding(end = 8.dp),
            text = stringResource(R.string.now_showing),
            textColor = Color.White,
            buttonColor = Orange
        ) {}
        ChipButton(text = stringResource(R.string.coming_soon), textColor = TextWhite) {}
    }
}