package com.example.basic.tarea

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

fun main(){

    println("Ejercicio 8")
    ejercicio8()
}