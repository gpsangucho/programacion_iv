package com.example.basic

fun main(){

    /*
    * Sistema de becas
    * Un usuario ingresa su promedio y si trabaja (si o no)
    * 1.- Promedio >= 90 y No trabaja -> Beca complete
    * 2.- Promedio > = 90 y trabaja -> beca parcial
    * 3.- Promedio < 90 -> Sin beca
    * Promedio y si trabaja
    * */

    println("SISTEMAS DE BECAS")
    println("ingrese el promedio entre 0 y 100")
    val valor = readln()
    val promedio = valor.toDoubleOrNull()?:0.0
    println("ingrese si el estudiante trabaja (si/no)")
    val trabaja: String = readln()

    when{
        promedio >= 90 && promedio <= 100 && trabaja == "no" -> println("Beca completa")
        promedio >= 90 && promedio <= 100 && trabaja == "si" -> println("Beca parcial")
        promedio > 0 && promedio < 90 -> println("sin beca")
        else -> println("Ingrese un valor correcto")
    }
}

