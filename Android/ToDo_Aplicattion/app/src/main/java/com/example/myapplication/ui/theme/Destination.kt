package com.example.myapplication.ui.theme

import kotlinx.serialization.Serializable

sealed class Destination(val route: String) {
    @Serializable
    object List: Destination("todo_list")

    @Serializable
    object Create: Destination("todo_create")

    @Serializable
    data class Detail(val id: Long): Destination("todo_detail/$id")
}