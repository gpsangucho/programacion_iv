package com.example.basic.Practica

fun main(){
  /*Sistema: Solicita N numeros o fin si quiere terminar.
  Al final muestra la suma y cantidad de los numeros ingresados
  * */
    print("Conteo simple")
    var suma : Double =0.0
    var count: Int = 0// cuenta cantdidades ingresadas
    var num : String
    var op = 1
    while(op == 1){
        println("Ingrese un numero o fin para salir: ")
        num = readln()

        if(num == "fin"){
            println("Ha ingresado $count cantidades y suma $suma unidades")
            println("Gracias por usar este sistema")
            op = 0
        }else{
            suma += num.toDoubleOrNull()?:0.0
            count+=1
        }
    }
}