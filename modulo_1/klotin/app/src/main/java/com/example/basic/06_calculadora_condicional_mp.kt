package com.example.basic

fun main(){
    println("Ingrese el numero de mascotas: \n")
    val value1: Int = readLine()?.toIntOrNull()?:0
    println("Ingrese el valor de la consulta: \n")
    val value2: Int = readLine()?.toIntOrNull()?:0
    println("Ingrese el porcentaje de IVA: \n")
    val value3: Int = readLine()?.toIntOrNull()?:0

    println("\n Ingrese la operacion: \n")
    println("(+): Factura")
    println("(-): Descuentos")
    println("(*): Cálculo de costo total")
    println("(/): Cálculo de costo unitario")
    val operacion: String = readln()

    when(operacion){
        "+" -> println("(+) Factura: ${value1*value2*(0.8 + value3)}")
        "-" -> println("(-) Descuento: ${value1*value2*0.8}")
        "*" -> println("(*) Costo total: ${value1 * value2}")
        "/" -> println("(/): Valor unitario: ${value1*value2*0.8/value1}")

    }



}