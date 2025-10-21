package com.example.basic.Practica

fun main(){
    /*
    * Realizar los siguientes ejercicios y adjuntar evidencia en un pdf codigo+corrida

Semáforo peatonal
Pide color del semáforo ("rojo", "amarillo", "verde") y si el peatón presionó el botón ("si"/"no").
Si está verde y presionó → “Espera a rojo”.
Si está rojo → “Cruza”.
Si amarillo → “Prepárate”.
En otros casos → “Espera”.
*/
    println("semaforo peatonal")
    println("Ingresar el color del semáforo: ")
    var color:String = readln()

    when(color){
        "rojo" -> println("Cruza")
        "verde" -> println("Espera a rojo")
        "amarillo" -> println("prepárate")
        else -> println("Espera")
    }

}