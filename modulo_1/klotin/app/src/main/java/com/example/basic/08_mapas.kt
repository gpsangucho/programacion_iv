package com.example.basic

fun main(){
    println("Mapas")
    // Map es como un objeto JSON: CLAVE=VALOR
    // Estructura de declaración
    println("Mapa inmutable")
    val fuerzaJedis = mapOf(
        "luke" to 85,
        "Leia" to 80,
        "obi-Wan" to 95,
        "Yoda" to 100
    )

    println("Fuerza de los Jedis:  ${fuerzaJedis}")
    // estruturas pueden ser mutables o inmutables
    // MAP es inmutable: no se puede modificar (es como una constante)

    println("\n Mapa mutable")

    val misionesCompletadas = mutableMapOf<String, Int>() //declara que su clave es String y su clave es entero
    misionesCompletadas ["luke"] = 15
    misionesCompletadas ["Leia"] = 12
    misionesCompletadas.put("Han",20)

    print("Misiones: ${misionesCompletadas}")

    for((jedi,fuerza) in fuerzaJedis){
        println("\n $jedi tiene nivel de fuerza $fuerza")
    }

    val planetasVisitados = setOf("a", "b", "c")
    println("Planetas visitados: ${planetasVisitados}")

    val planetasPeligrosos = setOf("d","b","f")
    println("Planetas peligros: ${planetasPeligrosos}")

    println("Operaciones de conjuntos")
    val interseccion = planetasPeligrosos intersect planetasVisitados
    val union = planetasPeligrosos union planetasVisitados
    val diferencia = planetasPeligrosos - planetasVisitados
    println("plantenas visitados y peligrosos: ${interseccion}")
    println("Todos los planetas: ${union}")
    println("Planetas seguros visitados: ${diferencia}")

/*
* */

}