package com.nourelden515.cinematicketsreservations.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.nourelden515.cinematicketsreservations.ui.composable.BottomBarScreen
import com.nourelden515.cinematicketsreservations.ui.screen.booking.bookingRoute
import com.nourelden515.cinematicketsreservations.ui.screen.home.homeRoute
import com.nourelden515.cinematicketsreservations.ui.screen.moviedetails.movieDetailsRoute
import com.nourelden515.cinematicketsreservations.ui.screen.profile.profileRoute
import com.nourelden515.cinematicketsreservations.ui.screen.reservation.reservationRoute
import com.nourelden515.cinematicketsreservations.ui.screen.search.searchRoute

@Composable
fun CinemaNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        profileRoute(navController)
        reservationRoute(navController)
        searchRoute(navController)
        homeRoute(navController)
        movieDetailsRoute(navController)
        bookingRoute(navController)
    }
}