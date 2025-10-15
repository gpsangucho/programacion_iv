package com.example.basic.tarea
import java.lang.StringBuilder
import kotlin.io.readLine
import kotlin.random.Random
import kotlin.text.toIntOrNull
fun ejercicio1(){
    println("1.- Termostato doméstico")
    println("Ingrese temperatura actual (°C):")
    val temp: Int = readLine()?.toIntOrNull()?:0
    println("Ingrese la preferencia del usuario (“frío”, “templado” o “caliente”.): ")
    val pref: String = readln().lowercase()

    when{
        pref == "frio" && temp > 22 -> println("encender el aire")
        pref == "caliente" && temp < 18 -> println("encender el aire")
        pref == "frio" && temp in 18.. 22 -> println("encender el aire")
        else -> println("Ventilar")
    }
}
fun main(){

    println("Ejercicio 1")
    ejercicio1()
}