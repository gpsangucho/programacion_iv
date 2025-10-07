package com.example.basic

fun main(){

    /*
    * el alumno ingresa una hora 0-23
    * Si está entre 7 y 13 "Clase en la mañana"
    * Si está entre 14 y 19 "clase de la tarde
    * Otro caso "horario electivo""*/

    println("\n ingrese la hora de clase: (0-23 horas)")
    val valor = readln()
    val hora = valor.toDoubleOrNull()?:0.0
    when{
        hora >= 7 && hora <= 13  -> println("clase en la mañana")
        hora >= 14 && hora <= 19  -> println("clase en la mañana")
        else -> println("Horario electivo")
    }

}