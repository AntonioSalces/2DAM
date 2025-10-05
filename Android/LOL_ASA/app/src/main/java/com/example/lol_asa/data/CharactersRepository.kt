package com.example.lol_asa.data
import com.example.lol_asa.R

object CharactersRepository {
    fun returnCharacters(): List<Character> {
        return listOf(
            Character(
                image = R.drawable.annie,
                name = "Annie",
                description = "Pequeña maestra del fuego"
            ),

            Character(
                image = R.drawable.diana,
                name = "Diana",
                description = "Guerrera de la noche lunar"
            ),

            Character(
                image = R.drawable.fizz,
                name = "Fizz",
                description = "Travieso asesino del océano"
            ),

            Character(
                image = R.drawable.irelia,
                name = "Irelia",
                description = "Bailarina de la guerra"
            ),

            Character(
                image = R.drawable.leona,
                name = "Leona",
                description = "Escudo del sol naciente"
            ),

            Character(
                image = R.drawable.mordekaiser,
                name = "Mordekaiser",
                description = "Señor del reino de los muertos"
            ),

            Character(
                image = R.drawable.neeko,
                name = "Neeko",
                description = "Espíritu curioso de mil formas"
            ),

            Character(
                image = R.drawable.senna,
                name = "Senna",
                description = "Cazadora de sombras"
            ),

            Character(
                image = R.drawable.taric,
                name = "Taric",
                description = "Guardián del resplandor"
            ),

            Character(
                image = R.drawable.teemo,
                name = "Teemo",
                description = "Francotirador del bosque"
            ),

            Character(
                image = R.drawable.vi,
                name = "Vi",
                description = "Puños de justicia"
            ),

            Character(
                image = R.drawable.ziggs,
                name = "Ziggs",
                description = "Maniático de las explosiones"
            ),
        )
    }
}