package com.example.basic
//archivo tipo class
fun main(){
    try{
        val resultados: Double = 0.0
        var resultado = 8/0//resultados
        println("Resultado: $resultado")
    }catch (e:Exception){
        println(e)
        println("Error en division por zero")
    }
}