package com.example.calcularcuentasapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.calcularcuentasapp.ui.theme.CalcularCuentasAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalcularCuentasAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val brush = remember {
                        Brush.linearGradient(
                            colors = listOf(Color.Red, Color.Yellow, Color.Green, Color.Blue, Color.Magenta)
                        )
                    }
                    
                    TextField(
                        state = rememberTextFieldState(initialText = "Hello"),
                        label = { Text("Label") }
                    )

                    
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
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalcularCuentasAppTheme {
        Greeting("Android")
    }
}