package com.example.hellojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Maininput_mp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { AppCampTexto() }
    }
}

@Composable
fun AppCampTexto() {
    MaterialTheme {
        Surface(Modifier.fillMaxSize()) {
            CampTextoScreen()
        }
    }
}

@Composable
fun CampTextoScreen() {
    var nombre by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Consultas veterinarias",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(16.dp)
        )
        Text("Nombre: ")
        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Escribe el nombre de tu mascota") },
            singleLine = true
        )

        Text(
            text = if (nombre.isBlank()) "Aún no has escrito nada..." else "Hola, $nombre 👋",
            style = MaterialTheme.typography.titleMedium
        )

        Button(onClick = { nombre = "" }) {
            Text("Limpiar")
        }


    }
}

@Preview(showBackground = true)
@Composable
private fun CampoTextoPreview() { AppCampoTexto() }