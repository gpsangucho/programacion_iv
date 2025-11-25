package com.example.basic

fun main(){
    println("CALCULO DE COSTOS POR NUMERO DE MASCOTAS EN CONSULTA BÁSICA")
    println("Ingresa el costo de la consulta básica: ")
    val valor = readln()
    val valor_consulta = valor.toDoubleOrNull()?:0.0

    println("mascotas Operacion Valor")
    for (mascotas in 1 ..12 step 1){
        println("$mascotas       $valor_consulta * $mascotas =  ${valor_consulta*mascotas}")
    }


}
