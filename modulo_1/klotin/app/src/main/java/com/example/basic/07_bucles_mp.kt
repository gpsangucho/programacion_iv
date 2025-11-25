package com.example.basic

fun main(){
    println("!Bucles: Servicios de la clínica veterinaria")
    val servicios =  listOf("Corte completo","Peinado","Vacunacion básica","Desparatizacion","Odontología")
    //
    for((index,servicios) in servicios.withIndex()){
        println("${index+1}.$servicios")
    }
    // Por rango de paso
    val factura: Double = 500.3
    val base: Double = 100.0
    for (i in 0 ..20 step 5){
        if(factura > base && i > 0){
            println("Valor de la factura: $factura. Descuentos: $i%. Valor final del descuento: ${factura*i/100})")
        }
    }

    //rangos descendentes
    println("Rangos descendente")
    for(countdown in 10 downTo 1){
        println("Su cita finaliza en  : $countdown")
    }

    // control de flujo
    println("\n CONTROL DE FLUJO \n")
    for(jedi in servicios){
        if(jedi == "Peinado") continue //saltar esta iteracion
        if(jedi == "Desparatizacion") continue //saltar esta iteracion
        println("Servicios aceptados: $jedi" )
    }

    for((index,jedi) in servicios.withIndex()){
        if(jedi == "Peinado") continue //saltar esta iteracion
        if(jedi == "Desparatizacion") continue //saltar esta iteracion
        println("Servicios aceptados: ${index+1}. $jedi" )
    }
}