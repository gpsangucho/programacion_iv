package com.example.basic.tarea


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
fun main(){

    println("Ejercicio 7")
    ejercicio7()
}