package com.example.practicandonavegacion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.practicandonavegacion.screens.FirstScreen
import com.example.practicandonavegacion.screens.SecondScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destinations.FirstScreen.route) {
        composable(route = Destinations.FirstScreen.route) {
            FirstScreen(navController)
        }

        composable(route = Destinations.SecondScreen.route) {
            SecondScreen(navController)
        }
    }
}