package com.nourelden515.cinematicketsreservations.ui.screen.profile

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.nourelden515.cinematicketsreservations.ui.composable.BottomBarScreen

fun NavGraphBuilder.profileRoute(
    navController: NavHostController,
) {
    composable(route = BottomBarScreen.Profile.route) {
        ProfileScreen(navController)
    }
}