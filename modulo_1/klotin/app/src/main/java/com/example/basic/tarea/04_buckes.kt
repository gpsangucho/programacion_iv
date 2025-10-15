package com.example.basic.tarea

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
fun main(){

    println("Ejercicio 4")
    ejercicio4()
}