package com.example.calcularcuentasapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calcularcuentasapp.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    var cuantity by remember { mutableStateOf("") }
    var people by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(false) }
    var sliderPosition by remember { mutableFloatStateOf(0f) }
    var solution by remember { mutableStateOf("") }

    Column {

        Text("Antonio Salces Alcaraz (2º DAM)")

        TextField(
            value = cuantity,
            onValueChange = { cuantity = it },
            modifier = Modifier.padding(8.dp).fillMaxWidth(),
            label = { Text(stringResource(R.string.money)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            keyboardActions = KeyboardActions { KeyboardType.Number }
        )

        TextField(
            value = people,
            onValueChange = { people = it },
            modifier = Modifier.padding(8.dp).fillMaxWidth(),
            label = { Text(stringResource(R.string.people)) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            keyboardActions = KeyboardActions { KeyboardType.Number }
        )
        Row (modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically){
            Text("Redondear propina")
            Switch(
                checked = checked,
                onCheckedChange = { checked = it },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = MaterialTheme.colorScheme.primary,
                    checkedTrackColor = MaterialTheme.colorScheme.primaryContainer,
                    uncheckedThumbColor = MaterialTheme.colorScheme.secondary,
                    uncheckedTrackColor = MaterialTheme.colorScheme.secondaryContainer,
                )
            )
        }


        Text("Propina", modifier = Modifier.padding(8.dp))
        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            modifier = Modifier.fillMaxWidth().padding(10.dp),
            enabled = checked,
            steps = 4,
            valueRange = 0.1f..5f,
        )
        Text(text = (sliderPosition.toInt()*5).toString() + "%", modifier = Modifier.padding(8.dp))

        val totalCuantity: Int? = cuantity.toIntOrNull()
        val totalPeople: Int? = people.toIntOrNull()

        Button(
            onClick = {
                if (totalCuantity != null && totalPeople != null && totalPeople > 0) {
                    var tip = 0F
                    if (checked){
                        tip = totalCuantity * ((sliderPosition*5) / 100)
                    }
                    val total = totalCuantity + tip
                    val cuantityPerPerson = total / totalPeople
                    solution = "Cantidad total: $total€ \n $cuantityPerPerson€ por cada uno"
                } else {
                    solution = "error en la cuenta"
                }
            },
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        ) {
            Text(
                text = "Dividir cuenta",
                modifier = Modifier.padding(8.dp)
            )
        }
        Text(
            text = solution,
            modifier = Modifier.padding(8.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        Greeting()
    }
}