package com.example.basic.Practica

fun main(){

    /*
    Suma de múltiplos de 3
    Pide N y suma los múltiplos de 3 desde 1..N.
     */
    print("ingrese un numero: ")
    var num: Int = readLine()?.toIntOrNull()?:0
    var suma = 0

    for(i in 1..num step 1){
        if(i%3 == 0){
            println(i)
            suma +=i
        }
    }
    print("suma total de multiplos: ${suma}")
}