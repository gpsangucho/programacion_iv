package com.example.basic.Practica

fun suma(a:Int, b:Int):Int{
    return  a+b
}

fun resta(c:Int,d:Int): Int{
    return c-d
}

fun main(){
    /*Calculadora mínima (+ / −)
    Bucle de menú: 1) Sumar 2) Restar 3) Salir. Tras cada operación, mostrar resultado.*/

    println("ingrese un numero entero: ")
    val num1 = readLine()?.toIntOrNull()?:0
    println("ingrese un segundo numero entero: ")
    val num2 = readLine()?.toIntOrNull()?:0
    var operacion = 0
    var op = 1
    while(op == 1 ){
        println("Selecciones una opciòn: ")
        println("1.- Suma ")
        println("2.- Resta ")
        println("3.- Salir")
        operacion = readLine()?.toIntOrNull()?:0
        when(operacion){
            1 -> println("La suma es: ${suma(num1,num2)}")
            2 -> println("La suma es: ${resta(num1,num2)}")
            3 -> {
                println("Gracias por visitarnos")
                op = 0
            }
        }
    }

}