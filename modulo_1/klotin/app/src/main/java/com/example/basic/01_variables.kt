package com.example.basic

fun main(){
    println("VARIABLES")
    val planeta = "Tatooine"
    var jedi = "Anakin"

    jedi = "Obiwan"

    println("Tipos de variables")
    println("Tipos numéricos")

    println("Tipos Entero")
    val edad: Int = 25
    println(edad)

    println("Tipo Double")
    val altura: Double = 25.5
    println(altura)

    println("Tipo Float")
    val peso: Float = 25.5f
    println(peso)

    println("Tipo Long (entero muy largo)")
    val poblacion: Long = 2_000_000_000L
    println(poblacion)

    println("Tipo Texto (cadena de caracteres)")
    val nombre: String = "Obi-WAn Kenobi"
    println(nombre)

    println("Tipo Char (almacena 1 solo dígito)")
    val inicial: Char = 'O'
    println(inicial)

    println("Tipo lógico")
    val esJedi: Boolean = true
    println(esJedi)

    println("Nulidad")
    println("No acepta nulos. Debe declararse para que lo acepte. use ?")
    val apellido: String = "Lopez"
    println(apellido)
    val apellido1: String? = null
    println(apellido1)
    val ciudad: String? = ""
    println(ciudad?.length)

    println("Operacion de aserciòn no null. es una manera de buscar excepciones (Si no tiene nada devuelve una excepciòn)")
    val longitudSegura =  apellido!!.length

    println("\n Interpolacion de strings")
    println("sirve para concatenar cadenas y las que no son cadena de caracteres")
    val nombre1: String = "Leia"
    val edad1: Int = 15
    val planeta1: String = "Alderan"
    println("${nombre1.uppercase()} nacio en ${planeta1}")
    println("En 10 años tendrá: ${edad1+10} anios")

    println("Variable String Multilinea")
    val message = """
        Querido $nombre
        Tu mision en $planeta
        ha sido completada exitosamente
        Que la fuerza te acompañe
        """
    println(message)

    println("\n CONVERSIONES")
    val textoEdad: String = "25"
    val edad2: Int = textoEdad.toInt()
    println(edad2)
    println("Edad en texto: ${textoEdad} a edad en entero ${edad2}")

    val numeroDouble: Double = 50.8
    val numeroConvertido: String = numeroDouble.toString()
    println(numeroConvertido)
    println("Double: ${numeroDouble} a string: ${numeroConvertido}")




}