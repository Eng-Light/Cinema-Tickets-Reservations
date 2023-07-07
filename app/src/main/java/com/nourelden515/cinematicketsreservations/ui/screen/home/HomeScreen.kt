@file:OptIn(ExperimentalFoundationApi::class)

package com.nourelden515.cinematicketsreservations.ui.screen.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.nourelden515.cinematicketsreservations.ui.composable.SpacerVertical16
import com.nourelden515.cinematicketsreservations.ui.composable.SpacerVertical64
import com.nourelden515.cinematicketsreservations.ui.screen.home.composable.BackgroundImage
import com.nourelden515.cinematicketsreservations.ui.screen.home.composable.BottomSheetHome
import com.nourelden515.cinematicketsreservations.ui.screen.home.composable.HomeHeader
import com.nourelden515.cinematicketsreservations.ui.screen.home.composable.MoviePager
import com.nourelden515.cinematicketsreservations.ui.screen.moviedetails.navigateToMovieDetails

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

@OptIn(ExperimentalFoundationApi::class)
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
            HomeHeader()
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