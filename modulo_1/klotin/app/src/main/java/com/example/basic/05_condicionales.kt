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

    var tipoDroide: String = "R2-D2"
    when(tipoDroide){
        "R2-D2", "R2-Q5"->println("Droide astromecánico")
        "C-3PO", "C-3PA"->println("Droide de protocolo")
        "BB-8", "BB-9E"->println("Droide de nueva generación")
    }

    var peligro: Int = 5
    var recompensa: Int = 5
    when{
        peligro > 8 && recompensa < 1000->println("Misión Rechazada")
        peligro <= 3->println("Misión Aceptada")
        else->println("Requiere Evaluación Adicional")
    }

    val mes: String = "junio"
    when(mes){
        "enero","febrero","marzo" -> println("Fuego")
        "Abril","mayo","junio" -> println("Tierra")
        "julio","agosto","Septiembre" -> println("Aire")
        "oct","nov","dic" -> println("Agua")
    }


}

