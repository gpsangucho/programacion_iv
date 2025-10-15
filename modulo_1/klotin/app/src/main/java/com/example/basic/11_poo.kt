package com.example.basic

// Qué es una clase?

data class Jedi(
    val nombre: String,
    val edad: Int,
    val nivelFuerza: Int,
    val maestro: String?=null

){
    val rango: String
        get() = when {
            nivelFuerza >= 90 -> "Maestro"
            nivelFuerza >= 70 -> "caballero"
            nivelFuerza >= 50 -> "Padawan"
            else -> {
                "Iniciado"
            }
        }

    fun puedeEnseniar(): Boolean = nivelFuerza >= 70

    fun entrenar(): Boolean = edad <= 5

}
        // Instanciamos el objeto
 fun main(){
     val luke = Jedi(nombre="Anakin_Skywalker",
         edad = 25,
         nivelFuerza = 75,
         maestro = "Obiwan Kenoki")
     println(luke)
    // descentralizacion de un objeto, extraccion del objeto
     val(nombre,edad,nivelFuerza) = luke
     println("nombre del Jedi: ${nombre}, edad: ${edad}, nivel de la fuerza: ${nivelFuerza}")

    // Copiar objetos: forma correcta de copiar objetos
    val ashoka = luke.copy(nombre = "ashoka", nivelFuerza=80)
    println(ashoka)
    //propiedades calculada
    println("Rango de ashoka ${ashoka.rango}")
    println("Ashoka puede enseñar ${ashoka.puedeEnseniar()}")

 }