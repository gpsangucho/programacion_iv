package com.example.basic

import java.time.LocalDate
import java.time.LocalTime
import kotlin.io.readLine

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

fun ejercicio2() {
    println("2.- Costo de envío express")
    println("Ingrese la distancia: ")
    val dist: Int = readLine()?.toIntOrNull() ?: 0
    println("¿Llueve en el sitio? (SI/NO) :")
    val clima: String = readln().lowercase()
    var base: Double = 0.0

    if (dist <= 5) {
        base = 2.5
    }else if(dist in 6..15){
        base = 5.0
    }else if(dist > 15){
        base = 8.0
    }else{
        print("seleccione un valor correcto de la distancia")
    }

    if (clima == "si"){
        println(base)
        base = base + 1.5
        println( "Total final con lluvia: ${base}")
    }else{ println("Total final: ${base}")}

}

fun ejercicio3(){

    println("Control de acceso por horario")
    println("Entrada: hora (0–23) y rol (“admin”, “invitado”, “empleado”).")
    println("Ingrese el rol: ")
    val rol: String = readln().lowercase()
    println("Ingrese la hora de entrada (0-23):")
    val hora: Int = readln().toInt()

    if (rol == "admin"){
        println("Acceso permitido")
    }else if(rol == "invitado"){
        if(hora in 9..17){
            println("Acceso permitido")
        }else{
            println("Acceso Denegado. Acceso para $rol solo entre 9:00am y 17:00pm")
        }
    }else if(rol == "empleado") {
        if (hora in 6..20) {
            println("Acceso permitido")
        } else {
            println("Acceso denegado. Acceso para $rol solo entre 6:00 am y 20:00 pm")
        }
    }else{
        println("Rol no permitido")
    }
}

fun ejercicio4(){
    /* Simulador de ahorro semanal
Entrada: meta y ahorro inicial. Cada semana sumas +10 a la cantidad semanal
que depositas (empieza en 5). Imprime semana a semana hasta alcanzar meta.
    * */
    println("Simulador de ahorro semanal")
    println("Ingresa la meta:")
    val meta: Int = readLine()?.toIntOrNull()?:0
    println("Ingresa el ahorro inicial: ")
    val ahorroInicial: Int = readLine()?.toIntOrNull()?:0
    val deposito

    for (i in ){
        ahorro += 10
        if (ahorro = meta){
            println("Alcanzaste tu meta... Felicidades!!")
            break
        }
        println("Meta alcanzada: $ahorro")
    }
}

fun main(){

    println("Ejercicio 1")
    //ejercicio1()
    //ejercicio2()
    //ejercicio3()

}