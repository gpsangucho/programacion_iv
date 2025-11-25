package com.example.hellojetpackcompose


import android.os.Bundle
import java.net.URLEncoder
import java.nio.charset.StandardCharsets
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
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.navArgument

data class Usuario2(val id: Int, val nombre: String,val rol: String = "")

class MainNavegation_mp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { Nav_BasicaApp() }
    }
}

@Composable
fun Nav_BasicaApp() {
    MaterialTheme {
        Surface(Modifier.fillMaxSize()) {
            val nav = rememberNavController()
            NavHost(navController = nav, startDestination = "home") {

                // Pantalla lista
                composable("home") {
                    Home_Screen(
                        onOpenDetail = { id, nombre ->
                            // Codificar nombre por seguridad (espacios, tildes, etc.)
                            val safe = URLEncoder.encode(nombre, StandardCharsets.UTF_8.toString())
                            nav.navigate("detail/$id/$safe")
                        }
                    )
                }

                // Pantalla detalle con argumentos tipados
                composable(
                    route = "detail/{id}/{nombre}",
                    arguments = listOf(
                        navArgument("id") { type = NavType.IntType },
                        navArgument("nombre") { type = NavType.StringType }
                    )
                ) { backStack ->
                    val id = backStack.arguments?.getInt("id") ?: -1
                    val nombre = backStack.arguments?.getString("nombre") ?: ""
                    Detail_Screen(
                        id = id,
                        nombre = nombre,
                        onBack = { nav.popBackStack() }
                    )
                }
            }
        }
    }
}

@Composable
fun Home_Screen(onOpenDetail: (Int, String) -> Unit) {
    val usuarios = remember {
        listOf(
            Usuario2(1, "Dinky"),
            Usuario2(2, "Lucas"),
            Usuario2(3, "Puma"),
            Usuario2(4, "Fiu")
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Home: selecciona una mascota", style = MaterialTheme.typography.titleLarge)

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(usuarios, key = { it.id }) { user ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onOpenDetail(user.id, user.nombre) }
                ) {
                    Row(
                        modifier = Modifier.padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("ID: ${user.id} — ${user.nombre}")
                    }
                }
            }
        }
    }
}

@Composable
fun Detail_Screen(id: Int, nombre: String, onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Detalle", style = MaterialTheme.typography.titleLarge)
        Card(Modifier.fillMaxWidth()) {
            Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("ID: $id", style = MaterialTheme.typography.titleMedium)
                Text("Nombre: $nombre", style = MaterialTheme.typography.bodyLarge)
            }
        }
        Button(onClick = onBack) { Text("⬅️ Volver") }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewHome() { MaterialTheme { Home_Screen { _, _ -> } } }

@Preview(showBackground = true)
@Composable
private fun PreviewDetail() { MaterialTheme { Detail_Screen(9, "Ejemplo", onBack = {}) } }