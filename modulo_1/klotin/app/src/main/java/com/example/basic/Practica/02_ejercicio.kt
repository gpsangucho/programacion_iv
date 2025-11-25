package com.example.basic.Practica

fun main(){
    /*
    Entrada de cine con descuento por edad
    Pide edad. Base $5.
   <12 → $3
   ≥65 → $4
    Si no, $5.
     */

    println("Entrada de cine con descuento por edad")
    println("ingrese su edad")
    var edad: Int = readLine()?.toIntOrNull()?:0
    val base = 5

    when{
        edad <12 -> print("entrada. $3")
        edad >= 65 -> print("entrada: $4")
        else -> print("entrada: ${base}")
    }
}