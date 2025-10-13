package com.example.basic

import java.time.LocalDate

// CLASE

data class Cita(
    val id: Int,
    var fecha: LocalDate,
    val mascota: String,
    var veterinario: String?=null
){
    val estado: String
        get() = when {
             agendada()-> "Agendada"
             vencida()-> "No asistió"
             eshoy() -> "Es hoy"
            else -> {
                "Por tomar cita"
            }
        }
    // Estado de las citas
    fun agendada(): Boolean = fecha.isAfter(LocalDate.now())
    fun vencida(): Boolean = fecha.isBefore(LocalDate.now())
    fun eshoy(): Boolean = fecha.isEqual(LocalDate.now())


    fun mostrarCita(){
        println("La cita $id de la $mascota programada para el $fecha con el tratante $veterinario, está en estado \"$estado\"")
    }

}
        // Instanciamos el objeto
 fun main(){
     val fechaCita = LocalDate.of(2025, 10, 20)
     val cita = Cita(1,fechaCita,"Gato")
     cita.mostrarCita()
     println(cita)

     // Copiar cita
            val fechaCita2 = LocalDate.of(2025, 10, 20)
            val cita2 = cita.copy(2,fechaCita2,"Perro")
            println(cita2)

            //propiedades calculada
            println("Estado de cita 1: ${cita.estado}")
            println("la Cita 2 es hoy?: ${cita2.eshoy()}")

 }