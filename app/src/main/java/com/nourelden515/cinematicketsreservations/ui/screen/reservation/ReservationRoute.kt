package com.nourelden515.cinematicketsreservations.ui.screen.reservation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.nourelden515.cinematicketsreservations.ui.composable.BottomBarScreen

fun NavGraphBuilder.reservationRoute(
    navController: NavHostController,
) {
    composable(route = BottomBarScreen.Reservation.route) {
        ReservationScreen(navController)
    }
}