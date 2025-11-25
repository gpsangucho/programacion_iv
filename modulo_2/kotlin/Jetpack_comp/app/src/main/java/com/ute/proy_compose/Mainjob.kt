package com.ute.proy_compose

// Nombre del trabajador, años de servicio. Calcular dìas de vacaciones
// Menores a 5 años: 10 días
// mayoress a 5 años: 15 años
// Mayores de 15 años: 15 dìas
// investigar ciclos


// importio librerías:
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
import androidx.compose.ui.unit.sp

class Mainjob : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { Appjob() }
    }
}

@Composable
fun Appjob() {
    MaterialTheme {
        Surface(Modifier.fillMaxSize()) {
            Calcular_vacaciones()
        }
    }
}


@Composable
fun Calcular_vacaciones() {
    var activo by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(48.dp),
        verticalArrangement = Arrangement.spacedBy(100.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Text(if (activo) "Calcular ✅" else "Calcular ⛔")

        Button(onClick = { activo = !activo },
                modifier = Modifier
                    .fillMaxWidth() // Hace el botón más ancho
                    .height(80.dp) // Establece la altura del botón
        ) {
            Text(if (activo) "Calcular ✅" else "Calcular ⛔",
                color = Color(0xff880e4f),
                fontFamily = FontFamily.Cursive,
                fontSize = 20.sp // Cambiar tamaño de la fuente para que sea más grande
            )
        }
    }
}
