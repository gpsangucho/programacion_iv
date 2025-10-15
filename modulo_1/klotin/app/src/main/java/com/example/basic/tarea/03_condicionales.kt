package com.example.basic.tarea

fun ejercicio3(){

    println("Control de acceso por horario")
    println("Entrada: hora (0–23) y rol (“admin”, “invitado”, “empleado”).")
    println("Ingrese el rol: ")
    val rol: String = readln().lowercase()
    println("Ingrese la hora de entrada (0-23):")
    val hora: Int = readln().toInt()

    if (rol == "admin"){
        println("Acceso permitido")
    }else if(rol == "invitado"){
        if(hora in 9..17){
            println("Acceso permitido")
        }else{
            println("Acceso Denegado. Acceso para $rol solo entre 9:00am y 17:00pm")
        }
    }else if(rol == "empleado") {
        if (hora in 6..20) {
            println("Acceso permitido")
        } else {
            println("Acceso denegado. Acceso para $rol solo entre 6:00 am y 20:00 pm")
        }
    }else{
        println("Rol no permitido")
    }
}
fun main(){

    println("Ejercicio 3")
    ejercicio3()
}