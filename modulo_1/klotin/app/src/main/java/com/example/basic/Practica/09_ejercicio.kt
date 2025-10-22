package com.example.basic.Practica

fun main(){
    /*Tabla de multiplicar (1..10)
    Pide un número y muestra su tabla hasta 10.*/
    println("Tabla de multiplicar del 1 al 10")
    var op = 1
    var op1: String
    var num = 0
    while(op==1){
        println("ingrese un número entero del 1 al 10")
        num = readLine()?.toIntOrNull()?:0
        println("tabla de multiplicar de $num")
        for( i in 1..10){
            print("$num * $i = ${num*i} \n")
        }
        println("desea continuar? (si/no): ")
        op1 = readln()
        if(op1 == "no"){
            println("gracias por visitarnos")
            op = 0
        }
    }
}