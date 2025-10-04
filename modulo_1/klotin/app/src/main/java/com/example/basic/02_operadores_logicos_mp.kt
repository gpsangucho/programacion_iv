package com.example.basic

fun main(){
    println("OPERADORES")
    println("!Operadores lógicos: Operadores condicionales¡")  //similar a javascritp
    val edad_mascota: Int = 25
    val estado_cita: Boolean = true
    val nivel_triaje: Int = 8

    val esApto = edad_mascota >= 18 && estado_cita && nivel_triaje > 5
    val necesitaAyuda = !estado_cita || nivel_triaje < 3

    println("Buen estado de salud: ${esApto}")
    println("Necesita ayuda: ${necesitaAyuda}")



}