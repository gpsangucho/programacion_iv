package com.example.basic.Practica

fun main(){
/*Estado del agua por temperatura
Pide °C.
≤0 → “Sólido”
1..99 → “Líquido”
≥100 → “Gas”
*/
    println("estado del agua por temperatura")
    print("ingrese la temperatura: ")
    val temp: Double = readLine()?.toDoubleOrNull()?:0.0

    when{
        temp <= 0 -> println("solido")
        temp >1 && temp <99 -> println("Líquido")
        temp >=100 -> println("Gas")
    }

}