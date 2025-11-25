package com.example.hellojetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlin.text.format

sealed class HealtScreen(val route: String) {
    object Home : HealtScreen("health_home")
    object Bmi : HealtScreen("bmi")
    object Converter : HealtScreen("converter")
}

class MainHealthExercises_mp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { HealtNavApp() }
    }
}

@Composable
fun HealtNavApp() {
    val nav = rememberNavController()
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            NavHost(
                navController = nav,
                startDestination = HealthScreen.Home.route
            ) {
                composable(HealthScreen.Home.route) { HealtHomeScreen(nav) }
                composable(HealthScreen.Bmi.route) { BmScreen(nav) }
                composable(HealthScreen.Converter.route) { ConverteScreen(nav) }
            }
        }
    }
}

@Composable
fun HealtHomeScreen(nav: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Salud de mascotas",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(20.dp))
        Button(
            onClick = { nav.navigate(HealthScreen.Bmi.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Indice de Masa corporal")
        }
        Spacer(Modifier.height(12.dp))
        Button(
            onClick = { nav.navigate(HealthScreen.Converter.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Convertir Metros / Kilometros")
        }
    }
}

@Composable
fun BmScreen(nav: NavController) {
    var weight by remember { mutableStateOf("") }
    var height by remember { mutableStateOf("") }

    val bmi = bmValue(weight, height)
    val bmiText = bmCategory(bmi)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Indice de masa corporal de mascotas",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )

        Image(
            painter = painterResource(id = R.drawable.health),
            contentDescription = "Health image",
            modifier = Modifier.size(120.dp)
        )

        OutlinedTextField(
            value = weight,
            onValueChange = { weight = it },
            label = { Text("Peso (kg)") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = height,
            onValueChange = { height = it },
            label = { Text("Altura (m)") },
            modifier = Modifier.fillMaxWidth()
        )

        Text("BMI = ${"%.2f".format(bmi)}")
        Text(bmiText)

        Button(
            onClick = { nav.navigateUp() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("<-- Inicio")
        }
    }
}

@Composable
fun ConverteScreen(nav: NavController) {
    var meters by remember { mutableStateOf("") }
    var kilometers by remember { mutableStateOf("") }

    val metersToKm = meterToKilometers(meters)
    val kmToMeters = kilometerToMeters(kilometers)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Meters / Kilometers Converter",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier.padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text("De metros a kilometros", fontWeight = FontWeight.SemiBold)
                OutlinedTextField(
                    value = meters,
                    onValueChange = { meters = it },
                    label = { Text("Metros") }
                )
                Text("Resultado: ${"%.3f".format(metersToKm)} km")
            }
        }

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier.padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text("De kilometros a metros", fontWeight = FontWeight.SemiBold)
                OutlinedTextField(
                    value = kilometers,
                    onValueChange = { kilometers = it },
                    label = { Text("Kilómetros") }
                )
                Text("Resultado: ${"%.3f".format(kmToMeters)} m")
            }
        }

        Button(
            onClick = { nav.navigateUp() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("<-- Inicio")
        }
    }
}

fun bmValue(weight: String, height: String): Double {
    val w = weight.replace(",", ".").toDoubleOrNull() ?: 0.0
    val h = height.replace(",", ".").toDoubleOrNull() ?: 0.0
    if (w <= 0.0 || h <= 0.0) return 0.0
    return w / (h * h)
}

fun bmCategory(bmi: Double): String {
    if (bmi == 0.0) return "Ingrese valores válidos"
    return when {
        bmi < 18.5 -> "Peso bajo"
        bmi < 25.0 -> "Peso normal"
        bmi < 30.0 -> "Sobrepeso"
        else -> "Obesidad"
    }
}

fun meterToKilometers(meters: String): Double {
    val m = meters.replace(",", ".").toDoubleOrNull() ?: 0.0
    return m / 1000.0
}

fun kilometerToMeters(kilometers: String): Double {
    val k = kilometers.replace(",", ".").toDoubleOrNull() ?: 0.0
    return k * 1000.0
}

@Preview(showBackground = true)
@Composable
fun PreviewHealtNav() {
    HealtNavApp()
}