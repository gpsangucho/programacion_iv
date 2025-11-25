package com.example.basic.Practica

fun main(){
    /*Contador de pares hasta N
    Pide N y cuenta cuántos números pares hay entre 1 y N.
     */
    print("contador de pares hasta N")
    println("ingrese un numero entero: ")
    var num : Int = readLine()?.toIntOrNull()?:0
    var count: Int = 0
    for( i in 1..num step 1){
        if(i%2 == 0){
            count+=1
        }
    }
    print("La cantidad de numeros pares es: $count")
}