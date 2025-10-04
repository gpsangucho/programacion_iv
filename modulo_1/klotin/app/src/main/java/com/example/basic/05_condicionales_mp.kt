package com.example.basic

fun main(){
    println("Estructuras de control")
    println("Condicionales")
    val edad_mascota1 = 10
    val edad_mascota2 = 15
    if (edad_mascota1>edad_mascota2){
        println("La mascota de mayor edad es ${edad_mascota1}")
    }else{
        println("La mascota de mayor edad es ${edad_mascota2}")
    }

    println("rango segun nivel de la fuerza")
    val temperatura: Int = 36
    if (temperatura >36){
        println("Mascota con fiebre")
    }else{
        println("Mascota sin fiebre")
    }

    println("\n Condicional WHEN \n")
    var estado_cita: String = "reservado"
    when(estado_cita){
        "reservado", "online"->println("Cita programada")
        "reprogramado", "pendiente"->println("Cita por reprogramar")
        "checkin", "passed"->println("Cita atendida")
    }

    var costo_consulta: Int = 50
    var numero_mascota: Int = 5
    when{
        costo_consulta > 100 && numero_mascota < 3->println("Factura sin descuento")
        numero_mascota >= 3->println("Factura con descuento")
        else->println("El factura no tiene descuento")
    }

}

