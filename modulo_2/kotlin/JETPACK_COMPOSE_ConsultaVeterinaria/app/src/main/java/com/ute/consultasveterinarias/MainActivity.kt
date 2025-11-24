package com.ute.consultasveterinarias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppUI()
        }
    }
}

@Composable
fun AppUI() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

//*******************CONTENEDOR********************
        Column(
            modifier = Modifier
                .fillMaxWidth()
            .padding(16.dp)
        ) {
//*******************TITULO********************
            Text("REGISTRO DE MASCOTA", style = MaterialTheme.typography.headlineSmall)

            Spacer(Modifier.height(32.dp))

//***********Variables de los textos INPUT**********
            var mensaje1 by remember { mutableStateOf("VACA MUUU!!") }
            var mensaje2 by remember { mutableStateOf("VACA MUUU!!") }
            var mensaje3 by remember { mutableStateOf("VACA MUUU!!") }

            var text_nombre by remember { mutableStateOf("") }
            var text_edad by remember { mutableStateOf("") }
            var text_especie by remember { mutableStateOf("") }

//*******************Label********************

            OutlinedTextField(
                value = text_nombre,
                onValueChange = { text_nombre = it },
                label = { Text("Mascota") },
                modifier = Modifier.fillMaxWidth()
            )

            OutlinedTextField(
                value = text_especie,
                onValueChange = { text_especie = it },
                label = { Text("ESPECIE") },
                modifier = Modifier.fillMaxWidth()
            )

            OutlinedTextField(
                value = text_edad,
                onValueChange = { text_edad = it },
                label = { Text("EDAD") },
                modifier = Modifier.fillMaxWidth()
            )


            Spacer(Modifier.height(16.dp))
//*******************Boton********************
            Button(onClick = {
                mensaje1 = text_nombre
                mensaje2 = text_edad
                mensaje3 = "Especie:"+ text_especie
            }) {
                Text("Aceptar")
            }
            Spacer(Modifier.height(24.dp))
            Text("Datos de la mascota",style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Center,modifier = Modifier.fillMaxWidth(),fontWeight = FontWeight.Bold)
            Text("Nombre: $mensaje1", style = MaterialTheme.typography.headlineSmall)
            Text("Edad: $mensaje2", style = MaterialTheme.typography.headlineSmall)
            Text(mensaje3,style = MaterialTheme.typography.headlineSmall)

        }
    }
}

/* Opciones de MaterialTheme.typography.
* headlineLarge,headlineMedium,headlineSmall,
titleLarge,bodyLarge,bodyMedium,labelSmall
* */