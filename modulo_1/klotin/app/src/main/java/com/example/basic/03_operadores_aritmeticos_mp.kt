package com.example.basic

fun main(){
    println("Operadores Aritmeticos")
    val costo_revision_fisica: Double = 25.8
    val costo_especialidad: Double = 30.0
    val numero_mascota: Double = 4.0
    val subtotal: Double = costo_revision_fisica + costo_especialidad
    println("costo total: ${costo_revision_fisica + costo_especialidad}")
    println("Descuento: ${subtotal - costo_revision_fisica*0.1 }")
    println(": ${subtotal * numero_mascota}")
    println("Cuotas diferidas: ${subtotal / numero_mascota}")



}