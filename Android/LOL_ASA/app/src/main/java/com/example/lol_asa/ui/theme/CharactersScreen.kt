package com.example.lol_asa.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.lol_asa.data.Character
import com.example.lol_asa.data.CharactersRepository

annotation class Champion

@Composable
fun CharacterRow(character: Character) {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth().border(1.dp, Color.Black).padding(10.dp),
    ) {
        Image(
            modifier = Modifier.size(40.dp).clip(CircleShape),
            painter = painterResource(character.image),
            contentDescription = "Character image",
            contentScale = ContentScale.Crop
        )
        Column (
            modifier = Modifier.padding(start = 14.dp)
        ){
            Text(text = character.name, style = MaterialTheme.typography.titleMedium)
            Text(text = character.description)
        }
    }
}

@Composable
fun ListOfCharacters(modifier: Modifier = Modifier) {
    val characters : List<Character> = CharactersRepository.returnCharacters()
    LazyColumn(modifier = modifier) {
        items(
            items = characters,
            key = {it.id}
        ){
                character->
            CharacterRow(
                character = character
            )
        }
    }

}