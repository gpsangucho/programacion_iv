package com.example.basic

import android.R

fun main(){

    var a =  arrayOf("a","b","c")
    var b = arrayOf(1,7,44,66,78)
    val c = arrayOf("Cadena 1", 2,3,"cadena 4")
    a[2] = "z"
    println(a[2])
    println(b[2])
    println(c[1])
    println(c[3])
    println(a.size)
    println(b.size)
    println(c.size)

    //Ver si existe
    if("3" in a) println("Existe") else println("No existe")
    // Imprimir
    for(elemento in c){
        println(elemento)
    }

}