package com.nourelden515.cinematicketsreservations.ui.screen.moviedetails

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

private const val ROUTE = "MovieDetailsRoute"

fun NavController.navigateToMovieDetails(movieId: Int) {
    navigate("${ROUTE}/${movieId}")
}

fun NavGraphBuilder.movieDetailsRoute(
    navController: NavHostController,
) {
    composable(
        route = "${ROUTE}/{${MovieDetailsArgs.MOVIE_ID}}",
        arguments = listOf(
            navArgument(MovieDetailsArgs.MOVIE_ID) { NavType.IntType }
        )
    ) {
        MovieDetailsScreen(navController)
    }
}