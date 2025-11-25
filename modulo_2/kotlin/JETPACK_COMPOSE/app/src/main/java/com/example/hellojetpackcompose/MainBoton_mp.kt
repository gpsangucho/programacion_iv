package com.example.hellojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainBoton_mp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { ApEstadoBasico() }
    }
}

@Composable
fun ApEstadoBasico() {
    MaterialTheme {
        Surface(Modifier.fillMaxSize()) {
            EstadoBasicScreen()
        }
    }
}

@Composable
fun EstadoBasicScreen() {

    var activo by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // 🔵 Texto principal según el estado
        Text(if (activo) "Modo ACTIVO ✅" else "Modo INACTIVO ⛔")

        // 🔵 Botón para cambiar estado
        Button(onClick = { activo = !activo }) {
            Text(
                if (activo) "Desactivar" else "Activar",
                color = Color(0xff880e4f),
                fontFamily = FontFamily.Cursive
            )
        }

        // 🟩🟥 CARD según el estado
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            colors = CardDefaults.cardColors(
                containerColor = if (activo) Color(0xFFB2FF59) else Color(0xFFFFCDD2)
            ),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Column(Modifier.padding(16.dp)) {

                // Primer texto
                Text(
                    text = if (activo) "Estado del servicio: ACTIVO" else "Estado del servicio: INACTIVO",
                    style = MaterialTheme.typography.titleMedium
                )

                Spacer(Modifier.height(8.dp))

                // Segundo texto
                Text(
                    text = if (activo)
                        "El servicio veterinario está disponible."
                    else
                        "El servicio está temporalmente deshabilitada.",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun EstadoPreview() {
    EstadoBasicScreen()
}
