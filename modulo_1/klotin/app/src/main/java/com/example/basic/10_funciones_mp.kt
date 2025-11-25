package com.example.basic

fun saludo(){
    println("\n BIENVENIDO AL SISTEMA DE CITAS VETERINARIAS")
}

// funciòn con parámetros y retorno

fun costo_cita(subtotal: Double, iva: Double): Double{
    return subtotal + iva
}

// Función con expresion single-expresion function
fun costo_total(numero: Double) = numero * 1.15

// funciòn con retorno múltiple
fun calcular_costo(a: Double, b: Double): Pair<Double,Double>{
    val subtotal = a+b
    val total = subtotal*1.15
    return  Pair(subtotal, total)
}
// operaciones
fun subtotal(a: Int, b: Int): Int{
    return a + b
}

fun descuento(a: Int, b: Int): Int{
    return a - b
}
fun total_unidades(a: Int, b: Int): Int{
    return a * b
}
fun valor_unitario(a: Int, b: Int): Int{
    return a / b
}



fun main(){
    // función básica
    println("Funciones")
    saludo()
    // función con parámetros y retorno
    val resultado =  costo_cita(subtotal=5.0, iva=1.15)
    println(resultado)
    // función con expresión single-expresion funtion
    println(costo_total(numero=5.0))
    // función con retorno múltiple
    println(calcular_costo(a=15.0, b=5.0))

    // función Lambda: son cortas de una sola línea. Recibe el parámetro y ejecuta/devuelve lo requerido
    val costoTotalLambda = {x: Int -> x*1.15}
    val saludoLamdba = {nombre: String-> "Good morning, $nombre"}
    println(costoTotalLambda(4))
    println(saludoLamdba("Juan Luis Guerra"))

}