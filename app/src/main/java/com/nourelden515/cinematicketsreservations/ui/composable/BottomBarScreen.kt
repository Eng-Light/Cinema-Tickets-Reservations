package com.nourelden515.cinematicketsreservations.ui.composable

import com.nourelden515.cinematicketsreservations.R

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
) {

    object Home : BottomBarScreen(
        route = "Home",
        title = "Home",
        icon = R.drawable.home_icon,
    )

    object Search : BottomBarScreen(
        route = "Search",
        title = "Search",
        icon = R.drawable.search_icon,
    )

    object Reservation : BottomBarScreen(
        route = "Reservation",
        title = "Reservation",
        icon = R.drawable.ticket_icon,
    )

    object Profile : BottomBarScreen(
        route = "Profile",
        title = "Profile",
        icon = R.drawable.profile_icon,
    )

}