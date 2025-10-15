package com.example.basic

// Que son los enum? Es un objeto donde podemos incluir una clasificacion. Ej. medio, alto, bajo
// hacemos un enum colocando esa característica

enum class Triaje(val color:String, val gravedad: String){

    AZUL(color= "azul", gravedad="leve"){
        override fun descripcion()="Mascota con atención de 2 a 3 horas"
    },
    VERDE(color ="verde", gravedad="moderado"){
        override fun descripcion()="Mascota con atención 1 a 2 horas"
    },
    ROJO(color="rojo", gravedad="emergencia"){
        override fun descripcion()="Mascota atención inmediata"
    };

    abstract fun descripcion(): String

    companion object{
        fun porColor(color: String) = values().find {it.color===color }
    }
}
class Atencion(val tipo: Triaje, val mascota: String){
    fun activar() = "El triaje de color ${tipo.color} del \" ${mascota}\" se activa"
    fun info()= "${tipo.descripcion()} - tipo gravedad ${tipo.gravedad}"
}

fun main(){
    val sableWindoo = Atencion(Triaje.ROJO, mascota="Gato")
    println(sableWindoo)
    println(sableWindoo.activar())
    println(sableWindoo.info())

    val sableLuke = Atencion(Triaje.VERDE, mascota="Loro")
    println(sableLuke)
    println(sableLuke.activar())
    println(sableLuke.info())

}
