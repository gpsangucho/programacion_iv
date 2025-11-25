package com.example.basic.Practica

fun main(){
    /*Promedio y aprobación
    Pide 3 notas (0–20). Promedia y dice “Aprobado” si ≥ 14, si no “Reprobado”.*/
    println("Promedio y aprobaciòn")
    var op = 1
    var op1 = "si"
    var nota1: Double
    var nota2: Double
    var nota3: Double
    var promedio: Double

    while(op==1){
        println("Ingrese la nota 1: ")
        nota1 = readLine()?.toDoubleOrNull()?:0.0
        println("Ingrese la nota 2: ")
        nota2 = readLine()?.toDoubleOrNull()?:0.0
        println("Ingrese la nota 3: ")
        nota3 = readLine()?.toDoubleOrNull()?:0.0

        promedio = (nota1 + nota2 + nota3)/3
        if(promedio >= 14){
            println("Curso aprobado")
        }else{
            println("Curso reprobado")
        }
        println("Desea continuar? (si/no): ")
        op1 = readln()
        if(op1 == "no"){
            println("Gracias por visitarnos")
            op = 0
        }

    }

}