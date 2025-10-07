package com.example.basic

fun saludar(){
    println("\n Funciòn Saludar:Hola desde una funciòn de Kotlin")
}

// funciòn con parámetros y retorno

fun sumar(a: Int, b: Int): Int{
    return a + b
}

// Función con expresion single-expresion function
fun cuadrado(numero: Int) = numero * numero

// funciòn con retorno múltiple
fun retornoMultiple(a: Int, b: Int): Pair<Int,Int>{
    val suma = a+b
    val resta = a-b
    return  Pair(suma, resta)
}
// operaciones
fun suma(a: Int, b: Int): Int{
    return a + b
}

fun resta(a: Int, b: Int): Int{
    return a - b
}
fun multiplicacion(a: Int, b: Int): Int{
    return a * b
}
fun division(a: Int, b: Int): Int{
    return a / b
}

fun operaciones(aa: Int, bb: Int, c: String){
    when(c){
        "+" -> println(suma(a=aa,b=bb))
        "-" -> println(resta(a=aa,b=bb))
        "*" -> println(multiplicacion(a=aa,b=bb))
        "/" -> println(division(a=aa,b=bb))

    }
}


fun main(){
    // función básica
    println("Funciones")
    saludar()
    // función con parámetros y retorno
    val resultado =  sumar(a=5, b=6)
    println(resultado)
    // función con expresión single-expresion funtion
    println(cuadrado(numero=5))
    // función con retorno múltiple
    println(retornoMultiple(a=15, b=5))
    // funsión Lambda: son cortas de una sola línea. Recibe el parámetro y ejecuta/devuelve lo requerido
    val cuadradoLambda = {x: Int -> x*x}
    val saludoLamdba = {nombre: String-> "Good morning, $nombre"}
    println(cuadradoLambda(4))
    println(saludoLamdba("Juan Luis Guerra"))

    // funciones de la calculadora
    // condicional que reciba 2 numeros y cual operacion va hacer

    println("Ingrese primer valor: \n")
    val value1: Int = readLine()?.toIntOrNull()?:0
    println("Ingrese segundo valor: \n")
    val value2: Int = readLine()?.toIntOrNull()?:0
    println("Ingrese la operacion: \n")
    val operacion: String = readln()
    operaciones(aa=value1,bb=value2,c=operacion)




}