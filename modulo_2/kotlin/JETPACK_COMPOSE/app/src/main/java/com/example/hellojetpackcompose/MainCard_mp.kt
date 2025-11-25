package com.example.hellojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainCard_mp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { FichUsuarioApp() }
    }
}

@Composable
fun FichUsuarioApp() {
    MaterialTheme { Surface(Modifier.fillMaxSize()) { FichUsuarioScreen() } }
}

@Composable
fun FichUsuarioScreen() {

    // valores
    var nombre by rememberSaveable { mutableStateOf("") }
    var especie by rememberSaveable { mutableStateOf("") }
    var tipo by rememberSaveable { mutableStateOf("") }
    var edad by rememberSaveable { mutableStateOf("") }

    // estados activo/inactivo
    var actNombre by rememberSaveable { mutableStateOf(false) }
    var actEspecie by rememberSaveable { mutableStateOf(false) }
    var actTipo by rememberSaveable { mutableStateOf(false) }
    var actEdad by rememberSaveable { mutableStateOf(false) }

    Column(
        Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {

            Column(
                Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {

                // --- FILA 1 ---
                FilaAtributo(
                    label = "Nombre:",
                    valor = nombre,
                    onValor = {
                        nombre = it
                        if (it.isBlank()) actNombre = false
                    },
                    activo = actNombre,
                    onToggle = { if (nombre.isNotBlank()) actNombre = !actNombre }
                )

                // --- FILA 2 ---
                FilaAtributo(
                    label = "Especie:",
                    valor = especie,
                    onValor = {
                        especie = it
                        if (it.isBlank()) actEspecie = false
                    },
                    activo = actEspecie,
                    onToggle = { if (especie.isNotBlank()) actEspecie = !actEspecie }
                )

                // --- FILA 3 ---
                FilaAtributo(
                    label = "Tipo:",
                    valor = tipo,
                    onValor = {
                        tipo = it
                        if (it.isBlank()) actTipo = false
                    },
                    activo = actTipo,
                    onToggle = { if (tipo.isNotBlank()) actTipo = !actTipo }
                )

                // --- FILA 4 ---
                FilaAtributo(
                    label = "Edad:",
                    valor = edad,
                    onValor = {
                        edad = it
                        if (it.isBlank()) actEdad = false
                    },
                    activo = actEdad,
                    onToggle = { if (edad.isNotBlank()) actEdad = !actEdad }
                )
            }
        }
    }
}

@Composable
fun FilaAtributo(
    label: String,
    valor: String,
    onValor: (String) -> Unit,
    activo: Boolean,
    onToggle: () -> Unit
) {
    Row(
        Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(label, Modifier.weight(1f))

        OutlinedTextField(
            value = valor,
            onValueChange = onValor,
            modifier = Modifier.weight(2f)
        )

        Spacer(Modifier.width(10.dp))

        Button(
            onClick = onToggle,
            enabled = valor.isNotBlank()
        ) {
            Text(if (activo) "ACTIVO" else "INACTIVO")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewFicha() { FichUsuarioApp() }
