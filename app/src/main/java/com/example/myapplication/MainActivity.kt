package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color // Importación necesaria para Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        message = "Luis Orozco",
                        from = "22130872 "
                    )
                }
            }
        }
    }
}


@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = message,
            fontSize = 30.sp,
            // Cambia el color del texto
            color = if (message == "Luis Orozco") Color.Red else Color.Unspecified
        )
        Text(
            text = "- $from",
            fontSize = 24.sp
        )
    }
}


@Composable
fun Greeting(name: String, platform: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name from $platform!",
        modifier = modifier
    )
}

@Preview(showBackground = true, name = "Preview de GreetingText con Luis Orozco")
@Composable
fun GreetingTextLuisOrozcoPreview() {
    MyApplicationTheme {
        GreetingText(message = "Luis Orozco", from = "Android Studio")
    }
}

@Preview(showBackground = true, name = "Preview de GreetingText genérico")
@Composable
fun GreetingTextGenericPreview() {
    MyApplicationTheme {
        GreetingText(message = "Hola Developer", from = "Android Studio")
    }
}

@Preview(showBackground = true, name = "Preview de Greeting (original)")
@Composable
fun DefaultGreetingPreview() {
    MyApplicationTheme {
        Greeting("Android", "Desarrollo Android")
    }
}
