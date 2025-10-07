package com.example.lol_asa.data
import com.example.lol_asa.R

data class Habilidad(
    val nombre: String,
    val descripcion: String
)

data class Estadisticas(
    val vida: Int,
    val ataque: Int,
    val defensa: Int,
    val velocidadMovimiento: Int
)

data class Character(
    val id: Int,
    val image: Int,
    val name: String,
    val description: String,
    val habilidades: List<Habilidad>,
    val historia: String,
    val estadisticas: Estadisticas
)

object CharactersRepository {
    fun returnCharacters(): List<Character> {
        return listOf(
            Character(
                id = 1,
                image = R.drawable.annie,
                name = "Annie",
                description = "Pequeña maestra del fuego",
                habilidades = listOf(
                    Habilidad("Incinerar", "Lanza una bola de fuego que inflige daño."),
                    Habilidad("Escudo fundido", "Le otorga un escudo que bloquea daño.")
                ),
                historia = "Annie es una niña prodigio con un gran poder mágico y su oso de peluche tibbers a su lado.",
                estadisticas = Estadisticas(vida = 524, ataque = 50, defensa = 19, velocidadMovimiento = 335)
            ),

            Character(
                id = 2,
                image = R.drawable.diana,
                name = "Diana",
                description = "Guerrera de la noche lunar",
                habilidades = listOf(
                    Habilidad("Creciente plateada", "Un ataque en arco que daña a enemigos."),
                    Habilidad("Armadura de luna", "Refuerza su defensa mágica y velocidad.")
                ),
                historia = "Diana es una guerrera vinculada a la luna que lucha con un fervor inquebrantable.",
                estadisticas = Estadisticas(vida = 582, ataque = 58, defensa = 22, velocidadMovimiento = 345)
            ),

            Character(
                id = 3,
                image = R.drawable.fizz,
                name = "Fizz",
                description = "Travieso asesino del océano",
                habilidades = listOf(
                    Habilidad("Lanzamiento de tridente", "Lanza su tridente para infligir daño."),
                    Habilidad("Golpe de tiburón", "Salta y ataca con gran contundencia.")
                ),
                historia = "Fizz es un ser acuático conocido por su agilidad y habilidad para acechar a sus presas.",
                estadisticas = Estadisticas(vida = 570, ataque = 60, defensa = 18, velocidadMovimiento = 350)
            ),

            Character(
                id = 4,
                image = R.drawable.irelia,
                name = "Irelia",
                description = "Bailarina de la guerra",
                habilidades = listOf(
                    Habilidad("Hoja de hielo", "Corta a los enemigos con láminas de energía."),
                    Habilidad("Danza de la hoja", "Realiza ataques y movimientos fluidos y letales.")
                ),
                historia = "Irelia es una guerrera graciosa y letal que defiende su tierra con precisión y arte.",
                estadisticas = Estadisticas(vida = 540, ataque = 55, defensa = 21, velocidadMovimiento = 335)
            ),

            Character(
                id = 5,
                image = R.drawable.leona,
                name = "Leona",
                description = "Escudo del sol naciente",
                habilidades = listOf(
                    Habilidad("Luz del amanecer", "Cegadora explosión solar que aturde enemigos."),
                    Habilidad("Guardiana Zenith", "Protege aliados y refleja daño.")
                ),
                historia = "Leona es una defensora sagrada que usa el poder del sol para proteger a su gente.",
                estadisticas = Estadisticas(vida = 600, ataque = 50, defensa = 30, velocidadMovimiento = 340)
            ),

            Character(
                id = 6,
                image = R.drawable.mordekaiser,
                name = "Mordekaiser",
                description = "Señor del reino de los muertos",
                habilidades = listOf(
                    Habilidad("Maza de hierro", "Golpea con fuerza brutal a sus enemigos."),
                    Habilidad("Espectro sombrío", "Invoca espíritus para atacar.")
                ),
                historia = "Mordekaiser domina la muerte y trae terror a quienes se le enfrentan.",
                estadisticas = Estadisticas(vida = 650, ataque = 60, defensa = 28, velocidadMovimiento = 320)
            ),

            Character(
                id = 7,
                image = R.drawable.neeko,
                name = "Neeko",
                description = "Espíritu curioso de mil formas",
                habilidades = listOf(
                    Habilidad("Engaño chispeante", "Engaña a los enemigos con ilusiones."),
                    Habilidad("Flor explosiva", "Invoca plantas explosivas.")
                ),
                historia = "Neeko cambia de forma y encanta con su curiosidad y magia natural.",
                estadisticas = Estadisticas(vida = 540, ataque = 52, defensa = 19, velocidadMovimiento = 335)
            ),

            Character(
                id = 8,
                image = R.drawable.senna,
                name = "Senna",
                description = "Cazadora de sombras",
                habilidades = listOf(
                    Habilidad("Disparo sombra", "Dispara proyectiles que atraviesan enemigos."),
                    Habilidad("Luz sagrada", "Sana a sus aliados cercanos.")
                ),
                historia = "Senna lucha contra las fuerzas oscuras con un espíritu inquebrantable.",
                estadisticas = Estadisticas(vida = 570, ataque = 58, defensa = 21, velocidadMovimiento = 340)
            ),

            Character(
                id = 9,
                image = R.drawable.taric,
                name = "Taric",
                description = "Guardián del resplandor",
                habilidades = listOf(
                    Habilidad("Ataque brillante", "Golpea con luz cegadora."),
                    Habilidad("Escudo gemelo", "Protege a sus aliados con un escudo.")
                ),
                historia = "Taric canaliza el poder de las gemas para proteger a sus camaradas.",
                estadisticas = Estadisticas(vida = 620, ataque = 54, defensa = 29, velocidadMovimiento = 330)
            ),

            Character(
                id = 10,
                image = R.drawable.teemo,
                name = "Teemo",
                description = "Francotirador del bosque",
                habilidades = listOf(
                    Habilidad("Dardo cegador", "Lanza un dardo que ciega a su objetivo."),
                    Habilidad("Trampas explosivas", "Coloca hongos explosivos.")
                ),
                historia = "Teemo es un explorador pequeño pero letal, siempre listo para la batalla.",
                estadisticas = Estadisticas(vida = 530, ataque = 49, defensa = 18, velocidadMovimiento = 330)
            ),

            Character(
                id = 11,
                image = R.drawable.vi,
                name = "Vi",
                description = "Puños de justicia",
                habilidades = listOf(
                    Habilidad("Golpe contundente", "Golpea fuerte con sus puños mecánicos."),
                    Habilidad("Carga descomunal", "Avanza derribando obstáculos.")
                ),
                historia = "Vi usa su fuerza extrema para proteger a quienes ama en la ciudad.",
                estadisticas = Estadisticas(vida = 590, ataque = 61, defensa = 22, velocidadMovimiento = 340)
            ),

            Character(
                id = 12,
                image = R.drawable.ziggs,
                name = "Ziggs",
                description = "Maniático de las explosiones",
                habilidades = listOf(
                    Habilidad("Bomba rebotadora", "Lanza bombas que explotan varias veces."),
                    Habilidad("Carga de metralla", "Dispara una carga explosiva.")
                ),
                historia = "Ziggs es un experto en explosivos, causando caos con alegría.",
                estadisticas = Estadisticas(vida = 520, ataque = 55, defensa = 17, velocidadMovimiento = 335)
            ),
        )
    }

    fun getCharacterById(id: Int): Character? {
        return returnCharacters().find { it.id == id }
    }
}
