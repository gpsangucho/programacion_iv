package com.example.basic.Practica

fun main(){
    /*Contar vocales en una palabra
    Pide texto y cuenta vocales (a,e,i,o,u) sin tildes.*/
    println("Contador de vocales por palabra")
    var count: Int = 0
    var count1: Int = 0
    println("Ingrese una palabra")
    var word:String = readln()
    val vocales: String = "aeiou"
    val vocalesT: String = "áéíóú"

    for(i in 0..word.length-1){
        if(word[i]in vocales){
            count+=1
        }else if(word[i] in vocalesT){
            count1 +=1
        }
    }
    println("Tu palabra tiene $count vocales y $count1 vocales tildadas")
}