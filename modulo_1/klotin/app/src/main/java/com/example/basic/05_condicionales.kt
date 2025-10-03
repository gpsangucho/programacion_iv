package com.example.basic

fun main(){
    println("Estructuras de control")
    println("condicionales")
    val value1 = 10
    val value2 = 15
    if (value1>value2){
        println("El mayor es ${value1}")
    }else{
        println("El mayor es ${value2}")
    }

    println("rango segun nivel de la fuerza")
    val fuerza: Int = 10
    if (fuerza >10){
        println("Caballo Jedi")
    }else{
        println("Padawan")
    }

    modelo: String = "R2-D2"
    when(modelo: String){

    }

}