package com.example.basic.tarea

fun ejercicio5(){
    /*Detector de vocales consecutivas
    Pide un texto y recórrelo. Cuenta cuántas veces aparecen dos vocales seguidas
    (aeiou/AEIOU). Imprime el total.
    * */
    println("\" DETECTOR DE VOCALES CONSECUTIVAS\"")
    println("\n Ingresa un texto")
    var texto: String = readln()
    var count: Int = 0
    var vocalAnterior: Int = 0
    var esvocal: Int = 0
    val vocales = "aeiouAEIOU"
    for(i in 0..(texto.length-1)){
        for(j in 0..(vocales.length-1)){
            if(texto[i] == vocales[j]) {
                esvocal = 1
                if(esvocal == vocalAnterior) {
                    count += 1
                    break
                }
            }
        }
        vocalAnterior = esvocal
        esvocal = 0
    }
    println("Número total de dos vocales seguidas: $count")
}
fun main(){

    println("Ejercicio 5")
    ejercicio5()
}