package com.example.basic

fun main(){
    val lista: List<String> = listOf("uno","dos","tres")
    val lista2: List<Char> = listOf('q','b')
    var lista4: MutableList<Int> = mutableListOf(1,6,3,56)
    val lista3: MutableList<String> = mutableListOf("uno","dos","tres")

    print(lista3)
    lista3.add("cuatro")
    print(lista3)
    lista3.add(index=1,element = "pera")
    print(lista3)
    lista3.remove(element = "uno")
    print(lista3)
    lista3.removeAt(index = 1)
    print(lista3)
    lista3.clear()
    print("hola: ${lista3}")



    for (dia in 1..7) {
        when (dia) {
            1 -> println("Lunes")
            2 -> println("Martes")
            // ... otros días
            else -> println("Fin de semana")
        }
    }


}