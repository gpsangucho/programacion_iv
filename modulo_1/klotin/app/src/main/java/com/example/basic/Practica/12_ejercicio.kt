package com.example.basic.Practica

fun main(){
    /*Sistema de vuelto
    Ingrese la cantidad de un billete y devolver el numero de monedas de 0.5, 0.25 y 0.10
    que debe entregar
    * */
    print("Ingrese el valor del billete: ")
    var billete = readLine()?.toDoubleOrNull()?:0.0
    var count1 : Int = 0
    var count2 : Int = 0
    var count3 : Int = 0
    var count4 : Int = 0
    var count5 : Int = 0
    var resto : Double = 0.0

    count1 = (billete/0.5).toInt()  // Cálculo del # de monedas de 0.5 contenidas en el valor del billete
    resto = billete%0.5             // Cálculo del resto o lo que sobra del billete
    count2 = (resto/0.25).toInt()
    resto = resto%0.25
    count3 = (resto/0.1).toInt()
    resto = resto % 0.1
    count4 = (resto/0.05).toInt()
    resto = resto%0.05
    count5 = (resto/0.01).toInt()

    println("Cambio a monedas a entregar:")
    println("$count1 modedas de 0.5 centavos")
    println("$count2 modedas de 0.25 centavos")
    println("$count3 modedas de 0.10 centavos")
    println("$count4 modedas de 0.05 centavos")
    println("$count5 modedas de 0.01 centavos")

}