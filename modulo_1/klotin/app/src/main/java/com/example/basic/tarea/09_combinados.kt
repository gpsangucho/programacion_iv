package com.example.basic.tarea

import java.lang.StringBuilder

fun ejercicio9(){
    /*
    Generador de usuario
    Pide nombre y apellido. Con un bucle recorre ambos y construye un username
    alternando 2 letras del nombre y 2 del apellido.
    o Si uno se acaba, sigue con el otro.
    o Al final, si longitud < 6, agrega números consecutivos hasta 6.
     */
    print("Generador de Usuario \n")
    var usuario = StringBuilder()
    println("Ingrese el nombre:")
    var nombre: String = readln()
    println("Ingresel a apellido")
    var apellido: String = readln()

    var name: String = nombre+apellido
    var count: Int = 0

    for(i in 0..(name.length-1)){
        count +=1
        if(count == 2){
            usuario.append(name[i])
            usuario.append(name[i-1])
            count = 0
            //print(usuario)
        }
    }
    if(usuario.length < 6){
        while(usuario.length < 6){
            usuario.append(6)
        }
    }
    println("El usuario es:  $usuario, ${usuario.length}")
}

fun main(){

    println("Ejercicio 9")
    ejercicio9()
}