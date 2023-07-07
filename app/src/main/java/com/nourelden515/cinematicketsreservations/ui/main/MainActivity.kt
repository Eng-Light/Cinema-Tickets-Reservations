package com.nourelden515.cinematicketsreservations.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.nourelden515.cinematicketsreservations.ui.CinemaNavGraph
import com.nourelden515.cinematicketsreservations.ui.composable.BottomBar
import com.nourelden515.cinematicketsreservations.ui.composable.BottomBarScreen
import com.nourelden515.cinematicketsreservations.ui.theme.CinemaTicketsReservationsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CinemaTicketsReservationsTheme {
                val navController = rememberNavController()
                val bottomBarState = checkBottomBarState(navController)
                Scaffold(
                    Modifier.fillMaxHeight(),
                    bottomBar = {
                        BottomBar(navController, bottomBarState)
                    }
                )
                { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        CinemaNavGraph(navController)
                    }
                }
            }
        }
    }

    @Composable
    private fun checkBottomBarState(navController: NavHostController): MutableState<Boolean> {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val bottomBarState = rememberSaveable { (mutableStateOf(true)) }

        val bottomBarScreens = listOf(
            BottomBarScreen.Home.route,
            BottomBarScreen.Search.route,
            BottomBarScreen.Reservation.route,
            BottomBarScreen.Profile.route
        )

        when (navBackStackEntry?.destination?.route) {
            in bottomBarScreens -> {
                // Show BottomBar
                bottomBarState.value = true
            }

            else -> {
                // Hide BottomBar
                bottomBarState.value = false
            }
        }
        return bottomBarState
    }
}