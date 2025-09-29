package com.example.calcularcuentasapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calcularcuentasapp.ui.theme.CalcularCuentasAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalcularCuentasAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var cuantity by remember { mutableStateOf("") }
    var people by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(false) }
    var sliderPosition by remember { mutableStateOf(0f) }
    Column {

        Text("Antonio Salces Alcaraz (2º DAM)")

        TextField(
            value = cuantity,
            onValueChange = { cuantity = it },
            modifier = Modifier.padding(50.dp),
            label = { Text("Cantidad de €") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            keyboardActions = KeyboardActions { KeyboardType.Number }
        )
24
        TextField(
            value = people,
            onValueChange = { people = it },
            modifier = Modifier.padding(50.dp),
            label = { Text("Cantidad de personas") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            keyboardActions = KeyboardActions { KeyboardType.Number }
        )

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

        Text("Propina")
        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp),
            enabled = checked,
            steps = 4,
            valueRange = 0.1f..5f
        )
        Text(text = sliderPosition.toInt().toString())

        var totalCuantity: Int? = cuantity.toIntOrNull()
        var totalPeople: Int? = people.toIntOrNull()
        var solution by remember { mutableStateOf("") }

        Button(
            onClick = {
                if (totalCuantity != null && totalPeople != null && totalPeople > 0) {
                    var tip: Float = 0F
                    if (checked == true){
                        tip = totalCuantity * ((sliderPosition*5) / 100)
                    }
                    var total = totalCuantity + tip
                    var cuantityPerPerson = total / totalPeople
                    solution = "Cantidad total: $total€ \n " + "$cuantityPerPerson€ por cada uno"
                } else {
                    solution = "error en la cuenta"
                }
            },
            modifier = Modifier.fillMaxWidth().padding(20.dp)
        ) {
            Text(
                text = "Dividir cuenta"
            )
        }
            Text(
                text = "$solution€"
            )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalcularCuentasAppTheme {
        Greeting("Android")
    }
}