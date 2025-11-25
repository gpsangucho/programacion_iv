package com.example.hellojetpackcompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class Users(val id: Int, val nombre: String, val rol: String)

class MainLista_mp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { ListUsuariosApp() }
    }
}

@Composable
fun ListUsuariosApp() {
    MaterialTheme {
        Surface(Modifier.fillMaxSize()) {
            ListUsuariosScreen()
        }
    }
}

@Composable
fun ListUsuariosScreen() {
    val usuarios = remember {
        listOf(
            Users(1, "Tarzán", "Perro"),
            Users(2, "Mimi", "Gato"),
            Users(3, "Jon", "Loro"),
            Users(4, "Piu", "pollo")
        )
    }

    var seleccionado by remember { mutableStateOf<Users?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Lista de mascotas", style = MaterialTheme.typography.titleLarge)

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(usuarios) { user ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { seleccionado = user }
                ) {
                    Column(Modifier.padding(12.dp)) {
                        Text(user.nombre, style = MaterialTheme.typography.titleMedium)
                        Text(user.rol, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }

        Divider()

        if (seleccionado != null) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
            ) {
                Column(Modifier.padding(12.dp)) {
                    Text("Seleccionado:", style = MaterialTheme.typography.titleMedium)
                    Text("Nombre: ${seleccionado!!.nombre}")
                    Text("Rol: ${seleccionado!!.rol}")
                }
            }
        } else {
            Text("Selecciona un usuario para ver detalles.")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewLista() { ListUsuariosApp() }