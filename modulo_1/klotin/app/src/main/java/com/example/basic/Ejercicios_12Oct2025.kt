package com.example.basic

import java.lang.StringBuilder
import java.time.LocalDate
import java.time.LocalTime
import kotlin.io.readLine
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.text.toIntOrNull

fun ejercicio1(){
    println("1.- Termostato doméstico")
    println("Ingrese temperatura actual (°C):")
    val temp: Int = readLine()?.toIntOrNull()?:0
    println("Ingrese la preferencia del usuario (“frío”, “templado” o “caliente”.): ")
    val pref: String = readln().lowercase()

    when{
        pref == "frio" && temp > 22 -> println("encender el aire")
        pref == "caliente" && temp < 18 -> println("encender el aire")
        pref == "frio" && temp in 18.. 22 -> println("encender el aire")
        else -> println("Ventilar")
    }
}

fun ejercicio2() {
    println("2.- Costo de envío express")
    println("Ingrese la distancia: ")
    val dist: Int = readLine()?.toIntOrNull() ?: 0
    println("¿Llueve en el sitio? (SI/NO) :")
    val clima: String = readln().lowercase()
    var base: Double = 0.0

    if (dist <= 5) {
        base = 2.5
    }else if(dist in 6..15){
        base = 5.0
    }else if(dist > 15){
        base = 8.0
    }else{
        print("seleccione un valor correcto de la distancia")
    }

    if (clima == "si"){
        println(base)
        base = base + 1.5
        println( "Total final con lluvia: ${base}")
    }else{ println("Total final: ${base}")}

}

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

fun ejercicio4(){
    /* Simulador de ahorro semanal
Entrada: meta y ahorro inicial. Cada semana sumas +10 a la cantidad semanal
que depositas (empieza en 5). Imprime semana a semana hasta alcanzar meta.
    * */
    println("Simulador de ahorro semanal")
    println("Ingresa la meta:")
    val meta: Int = readLine()?.toIntOrNull()?:0
    println("Ingresa el ahorro inicial: ")
    var ahorro: Int = readLine()?.toIntOrNull()?:0
    var semana = 1
    var depositosemanal = 5


    for (i in 1..60){
        if (semana > 1){
            depositosemanal += 10
            if((ahorro+depositosemanal) >= meta){
                ahorro +=depositosemanal
                println("Alcanzaste tu meta ... Felicidades: $ahorro")
                break
            }
            println("Meta alcanzada: ${ahorro+depositosemanal}")
        }else{
            ahorro += depositosemanal
        }
        semana +=1
    }
}
fun ejercicio_4() {
    /* Simulador de ahorro semanal
Entrada: meta y ahorro inicial. Cada semana sumas +10 a la cantidad semanal
que depositas (empieza en 5). Imprime semana a semana hasta alcanzar meta.
    * */
    println("Simulador de ahorro semanal")
    println("Ingresa la meta:")
    val meta: Int = readLine()?.toIntOrNull() ?: 0
    println("Ingresa el ahorro inicial: ")
    var ahorroInicial: Int = readLine()?.toIntOrNull() ?: 0
    var semana = 1
    var depositosemanal = 5
    var ahorro = ahorroInicial + depositosemanal

    while (ahorro < meta) {
        if (semana > 1) {
            ahorro += 10
            semana +=1
            println("Ahorro alcanzado en la semana $semana: $ahorro")
        } else {
            println("Ahorro en la semana 1: ${ahorro}")
            semana += 1
        }
    }
    println("Meta cumplida: $ahorro")
}

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

fun ejercicio6(){
    /*
    * Cuenta regresiva con eventos
    Desde 30 hasta 0:
    o 20 → “Chequeo de sistemas”
    o 10 → “Últimos ajustes”
    o 0 → “Despegue”
    En los demás números solo imprime el número. */

    println("Cuenta regresiva")
    for(i in 30 downTo 0){
        when(i){
            20 -> println("$i Chequeo de sistema")
            10 -> println("$i Últimos ajuste")
            0 -> println("$i Despegue")
            else -> println(i)
        }
    }
}

fun ejercicio7(){
    /*1. Cola de supermercado
    En un while pide “nuevo cliente (total) o fin”. Si total > 100 aplica 5% desc.; si
    lleva más de 10 ítems, mensaje “Caja rápida no disponible”. Acumula venta del
    día y al final muestra total y cantidad de clientes.
    * */
    var total: Double = 0.0
    var items: Int = 0
    var estado: String = "total"
    var ventadiaria: Double = 0.0
    var clientes: Int = 0
    while (estado == "total"){
        println("Nuevo cliente? (total/fin): ")
        estado = readln().lowercase()
        if(estado == "total"){
            println("Ingrese el total de la compra: ")
            total = readln().toDouble()
            println("Ingrese el número de Items: ")
            items = readln().toInt()
            if(total > 100){
                ventadiaria +=total*0.95
            }
            if(items >10) {
                println("Caja rápida no disponible")
            }
            clientes += 1
        }else if(estado == "fin") {
            println("Ventas del día: $ventadiaria")
            println("Número de clientes: $clientes")
        }
    }
}

fun ejercicio8(){
    /*
    2. ATM simplificado
    Saldo inicial. En bucle muestra menú: 1) Depositar 2) Retirar 3) Salir.
    o Retiro no puede dejar saldo negativo.
    o Cada operación imprime saldo actual.
    Finaliza con “Sesión terminada”.
     */
    var saldo: Double = 0.0
    //var saldo: Double = 0.0
    var estado: Int = 1
    var op: Int = 0
    var valor: Double
    while(estado == 1){
        println("Menú ATM:")
        println("1.-Depositar")
        println("2.- Retirar")
        println("3.- Salir")
        op = readln().toInt()
        if(op==1){
            println("Ingrese el valor a depositar: ")
            valor = readLine()?.toDouble()?:0.0
            saldo += valor
            println("Saldo actual:$saldo" )
        }else if(op == 2){
            println("Ingrese el valor a retirar: ")
            valor = readLine()?.toDouble()?:0.0
            if ((saldo-valor)<0){
                println("Error: El valor de retiro supera el saldo actual")
                println("Saldo actual: $saldo")
            }else{
                saldo -= valor
                println("Saldo actual:$saldo" )
            }
        }else if (op == 3){
            println("Sesión terminada")
            estado = 0
        }
    }
}
////
fun ejercicio_8(){
    /*
    2. ATM simplificado
    Saldo inicial. En bucle muestra menú: 1) Depositar 2) Retirar 3) Salir.
    o Retiro no puede dejar saldo negativo.
    o Cada operación imprime saldo actual.
    Finaliza con “Sesión terminada”.
     */
    var saldo: Double = 0.0
    //var saldo: Double = 0.0
    var estado: Int = 1
    var op: Int = 0
    var valor: Double
    while(estado == 1){
        println("Menú ATM:")
        println("1.-Depositar")
        println("2.- Retirar")
        println("3.- Salir")
        op = readln().toInt()

        when(op){
            1 -> {

                println("Ingrese el valor a depositar: ")
                valor = readLine()?.toDouble()?:0.0
                saldo += valor
                println("Saldo actual:$saldo" )
            }
            2 -> {
                println("Ingrese el valor a retirar: ")
                valor = readLine()?.toDouble()?:0.0
                if ((saldo-valor)<0){
                    println("Error: El valor de retiro supera el saldo actual")
                    println("Saldo actual: $saldo")
                }else{
                    saldo -= valor
                    println("Saldo actual:$saldo" )
                }
            }
            3 -> {
                println("Sesión terminada")
                estado = 0
            }
        }

    }
}
///
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

fun ejercicio10(){
    /*
    Rally de resistencia
    Empiezas con 100 de “energía”. En cada etapa (1..N), un número aleatorio 1–3
    indica el terreno:
    o 1 asfalto: −5
    o 2 tierra: −10
    o 3 barro: −15
    Si energía ≤ 0 → “Abandona en etapa X”. Si termina, “Rally completado
    con energía Y”.
     */
    var energia: Int = 100
    var etapa: Int = 0
    var tipo: Int = 0
    var terreno: String = ""
    var perdida: Int = 0
    while(etapa <= 7){
        etapa += 1
        print("Etapa $etapa")
        tipo= Random.nextInt(1,4)
        if(energia >0){
            when(tipo){
                1 -> {
                    energia -=5
                    terreno = "asfalto"
                    perdida = 5
                }
                2 -> {
                    energia -=10
                    terreno = "tierra"
                    perdida = 10
                }
                3 -> {
                    energia -=15
                    terreno = "barro"
                    perdida = 15
                }
            }
            println(" Energia al final de la etapa: $energia. Camino cruzado: $terreno. Energía perdida: $perdida")
        }else{
            println("Abandona en etapa $etapa")
            etapa +=10
        }
    }
    if(etapa>7){
        println("Rally completado con energía $energia")
    }

}

fun main(){

    //println("Ejercicio 1")
    //ejercicio1()
    //ejercicio2()
    //ejercicio3()
    //ejercicio4()
    //ejercicio_4()
    //ejercicio5()
    //ejercicio6()
    //ejercicio7()
    //ejercicio8()
    //ejercicio_8()
    //ejercicio9()
    ejercicio10()
}