package com.example.myapplication.data

import androidx.compose.runtime.mutableStateOf

data class ToDo(
    val id: Long,
    val title: String,
    val description: String,
    val state: Boolean = false,
)

val toDos: MutableList<ToDo> = mutableListOf(
    ToDo(
        id = 1,
        title = "Aprender Kotllin",
        description = "Que me suspenden",
        state = false
    ),
    ToDo(
        id = 2,
        title = "Aprender TypeScript",
        description = "Bombardeen aliqindoi",
        state = false
    )
)