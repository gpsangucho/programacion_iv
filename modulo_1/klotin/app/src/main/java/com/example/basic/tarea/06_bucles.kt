package com.example.basic.tarea

fun ejercicio6(){
    /*
    * Cuenta regresiva con eventos
    Desde 30 hasta 0:
    o 20 → “Chequeo de sistemas”
    o 10 → “Últimos ajustes”
    o 0 → “Despegue”
    En los demás números solo imprime el número. */

    println("Cuenta regresiva")
    for(i in 30 downTo 0){
        when(i){
            20 -> println("$i Chequeo de sistema")
            10 -> println("$i Últimos ajuste")
            0 -> println("$i Despegue")
            else -> println(i)
        }
    }
}
fun main(){

    println("Ejercicio 6")
    ejercicio6()
}