package com.example.basic

fun main(){

    println("Operadores de Igualdad")
    val nombre1: String = "Yoda"
    val nombre2: String = "Yoda"
    val nombre3: String = String("Yoda".toCharArray()) //un string es un arreglo de caracteres.

    println("Igualdad estructural (evalua el contenido)")
    println(nombre1==nombre2)
    println(nombre1==nombre3)

    println("Igualdad referencial (misma instancia)") // la instancia es el objeto instanciado
    println(nombre1===nombre2)
    println(nombre1===nombre3)

}