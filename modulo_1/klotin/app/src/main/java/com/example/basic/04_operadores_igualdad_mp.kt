package com.example.basic

fun main(){

    println("Operadores de Igualdad")
    val nombre_mascota1: String = "Pipa"
    val nombre_mascota2: String = "Pipa"
    val nombre_mascota3: String = String("Pipa".toCharArray()) //un string es un arreglo de caracteres.

    println("Igualdad estructural (evalua el contenido)")
    println(nombre_mascota1==nombre_mascota2)
    println(nombre_mascota1==nombre_mascota3)

    println("Igualdad referencial (misma instancia)") // la instancia es el objeto instanciado
    println(nombre_mascota1===nombre_mascota2)
    println(nombre_mascota1===nombre_mascota3)


}