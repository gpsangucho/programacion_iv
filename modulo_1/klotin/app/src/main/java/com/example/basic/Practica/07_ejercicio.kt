package com.example.basic.Practica

fun main(){
    /*
    * Validador simple de contraseña
    Pide contraseña. Válida si tiene ≥8 caracteres y contiene al menos un dígito.*/
    println("Validador simple de contraseña")

    var pass: String
    var count = 0 // cantidad de caracteres
    var dig = 0 // cantidad de dígitos
    var op = 1

    while(op==1){
        println("Ingrese su contraseña")
        pass = readln()
        var pass1 = pass.toCharArray()
        for(i in 0..pass.length -1){
            if(pass1[i].isDigit() ) dig+=1
            count +=1
        }
        if(count < 8 || dig < 1){
            println("Su contraseña tiene $dig dígitos y $count caracteres")
            println("Contraseña no válida. ingrese al menos 8 caracteres y 1 dígito")
        }else{
            println("Su contraseña tiene $dig dígitos y $count caracteres")
            println("contraseña válida")
            op = 0
        }
    }


}