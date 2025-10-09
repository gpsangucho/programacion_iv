package com.example.basic



fun main(){

    //val valor: Int = 100

    for (valor in 100 downTo 0 step 10){
        when(valor){
            100 -> println("cargado")
            50 -> println("mitad de bateria")
            10 -> println("Conecte cargador")
            0 -> println("Apagado")
            else -> println("Pass: ${valor}")
        }
    }
}