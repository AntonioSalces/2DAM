package com.example.practicandonavegacion.navigation

sealed class Destinations(val route: String) {
    object FirstScreen: Destinations("first_screen")
    object SecondScreen: Destinations("second_screen")
}