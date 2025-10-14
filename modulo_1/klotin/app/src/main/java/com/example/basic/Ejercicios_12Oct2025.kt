package com.example.basic

fun ejercicio1(){
    println("1.- Termostato doméstico")
    println("Ingrese temperatura actual (°C):")
    val temp: Int = readLine()?.toIntOrNull()?:0
    println("Ingrese la preferencia del usuario (“frío”, “templado” o “caliente”.): ")
    val pref: String = readln()

    when{
        pref == "frio" && temp > 22 -> println("encender el aire")
        pref == "caliente" && temp < 18 -> println("encender el aire")
        pref == "frio" && temp in 18.. 22 -> println("encender el aire")
        else -> println("Ventilar")
    }
}

fun ejercicio2(){
    println("2.- Costo de envío express")
    println("Ingrese la distancia: ")
    val dist: Int = readLine()?.toIntOrNull()?:0
    println("¿Llueve en el sitio? (SI/NO) :")
    val clima: String = readln()

    when{
        dist <=5 -> println("Base: 2.5")
        dist in 6..15 -> println("Base: 5")
        dist >15 -> println("Base: 8")
    }

}
fun main(){

    println("Ejercicio 1")
    ejercicio1()
    ejercicio2()

}