package com.nourelden515.cinematicketsreservations.ui.screen.moviedetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.nourelden515.cinematicketsreservations.R
import com.nourelden515.cinematicketsreservations.ui.composable.CircleIconButton
import com.nourelden515.cinematicketsreservations.ui.composable.Timer
import com.nourelden515.cinematicketsreservations.ui.screen.booking.navigateToBooking
import com.nourelden515.cinematicketsreservations.ui.screen.moviedetails.composable.BottomSheetMovie
import com.nourelden515.cinematicketsreservations.ui.screen.moviedetails.composable.PlayerIcon
import com.nourelden515.cinematicketsreservations.ui.theme.Orange
import com.nourelden515.cinematicketsreservations.ui.theme.White

@Composable
fun MovieDetailsScreen(
    navController: NavHostController,
    viewModel: MovieDetailsViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsState()
    MovieDetailsContent(state = state, onClickBooking = {
        navController.navigateToBooking()
    }, onClickExit = {
        navController.navigateUp()
    })
}

@Composable
fun MovieDetailsContent(
    state: MovieDetailsUiState,
    onClickExit: () -> Unit,
    onClickBooking: () -> Unit,
) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (exit, timer, player, movieImage, details) = createRefs()
        val guideLine = createGuidelineFromTop(0.5f)

        Image(
            painter = rememberAsyncImagePainter(state.imageUrl),
            contentDescription = state.imageContentDescription,
            modifier = Modifier
                .aspectRatio(4f / 5f)
                .constrainAs(movieImage) {
                    top.linkTo(parent.top)
                },
            contentScale = ContentScale.Crop
        )

        Timer(
            modifier = Modifier
                .padding(end = 16.dp)
                .clip(shape = RoundedCornerShape(16.dp))
                .background(color = White.copy(alpha = .40f))
                .constrainAs(timer) {
                    end.linkTo(movieImage.end)
                    top.linkTo(exit.top)
                    bottom.linkTo(exit.bottom)
                },
            text = state.time
        )

        CircleIconButton(
            modifier = Modifier
                .constrainAs(exit) {
                    start.linkTo(movieImage.start)
                    top.linkTo(movieImage.top)
                }
                .padding(top = 32.dp, bottom = 32.dp, start = 16.dp, end = 16.dp),
            icon = R.drawable.exit_icon,
            onClickExit
        )

        PlayerIcon(
            modifier = Modifier
                .constrainAs(player) {
                    start.linkTo(movieImage.start)
                    end.linkTo(movieImage.end)
                    top.linkTo(movieImage.top)
                    bottom.linkTo(guideLine)
                }
                .size(56.dp)
                .background(Orange, CircleShape)
        )
        BottomSheetMovie(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
                .background(Color.White)
                .fillMaxSize()
                .constrainAs(details) {
                    top.linkTo(guideLine)
                }, state, onClickBooking
        )
    }
}

