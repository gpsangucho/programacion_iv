package com.example.basic.tarea
import java.lang.StringBuilder
import kotlin.io.readLine
import kotlin.random.Random
import kotlin.text.toIntOrNull
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
fun main(){

    println("Ejercicio 2")
    ejercicio2()
}