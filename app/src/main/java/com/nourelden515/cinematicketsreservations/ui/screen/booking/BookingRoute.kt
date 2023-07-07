package com.nourelden515.cinematicketsreservations.ui.screen.booking

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

private const val ROUTE = "MovieDetailsRoute"

fun NavController.navigateToBooking() {
    navigate(ROUTE)
}

fun NavGraphBuilder.bookingRoute(
    navController: NavHostController,
) {
    composable(route = ROUTE) {
        BookingScreen(navController)
    }
}