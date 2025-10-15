package com.example.basic.tarea

import kotlin.random.Random

fun ejercicio10(){
    /*
    Rally de resistencia
    Empiezas con 100 de “energía”. En cada etapa (1..N), un número aleatorio 1–3
    indica el terreno:
    o 1 asfalto: −5
    o 2 tierra: −10
    o 3 barro: −15
    Si energía ≤ 0 → “Abandona en etapa X”. Si termina, “Rally completado
    con energía Y”.
     */
    var energia: Int = 100
    var etapa: Int = 0
    var tipo: Int = 0
    var terreno: String = ""
    var perdida: Int = 0
    while(etapa <= 7){
        etapa += 1
        print("Etapa $etapa")
        tipo= Random.nextInt(1,4)
        if(energia >0){
            when(tipo){
                1 -> {
                    energia -=5
                    terreno = "asfalto"
                    perdida = 5
                }
                2 -> {
                    energia -=10
                    terreno = "tierra"
                    perdida = 10
                }
                3 -> {
                    energia -=15
                    terreno = "barro"
                    perdida = 15
                }
            }
            println(" Energia al final de la etapa: $energia. Camino cruzado: $terreno. Energía perdida: $perdida")
        }else{
            println("Abandona en etapa $etapa")
            etapa +=10
        }
    }
    if(etapa>7){
        println("Rally completado con energía $energia")
    }

}

fun main(){

    println("Ejercicio 10")
    ejercicio10()
}