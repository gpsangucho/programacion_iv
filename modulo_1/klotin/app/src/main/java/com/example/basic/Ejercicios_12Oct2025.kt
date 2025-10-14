package com.example.basic

fun ejercicio(){
    println("Ingrese temperatura actual (°C):")
    val temp: Int = readLine()?.toIntOrNull()?:0
    println("Ingrese la preferencia del usuario (“frío”, “templado” o “caliente”.): ")
    val pref: String = readln()

    when{
        pref === "frio" && temp > 22 -> println("encender el aire")
    }
}
fun main(){

    println("Ejercicio 1")
    ejercicio()

}