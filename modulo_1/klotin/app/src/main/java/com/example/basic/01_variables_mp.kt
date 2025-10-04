package com.example.basic

fun main(){
    println("VARIABLES")
    val nombre_mascota = "Lupe"
    var tipo_mascota = "perro"

    //nombre_mascota = "Obiwan"

    println("CONSULTAS VETERINARIAS: TIPOS DE VARIABLES")
    println("Tipos numéricos")

    println("Tipos Entero")
    val edad_mascota1: Int = 4
    println("Edad de la mascota: $edad_mascota1")

    println("Tipo Double")
    val valor_total: Double = 25.5
    println("Valor total: $valor_total")

    println("Tipo Float")
    val peso: Float = 25.5f
    println(peso)

    println("Tipo Long (entero muy largo)")
    val consultas: Long = 2_000_000_000L
    println("consultas del mes: $consultas")

    println("Tipo Texto (cadena de caracteres)")
    val nombre_cliente1: String = "Obrazil"
    println("Cliente: $nombre_cliente1")

    println("Tipo Char (almacena 1 solo dígito)")
    val sexo_mascota: Char = 'M'
    println(sexo_mascota)

    println("Tipo lógico")
    val estado_atencion: Boolean = true
    println("Estado de la atención médica: $estado_atencion")

    println("------- Nulidad -------")
    println("No acepta nulos. Debe declararse para que lo acepte. use ?")
    val apellido_cliente: String = "Lopez"
    println(apellido_cliente)
    val apellido_cliente1: String? = null
    println(apellido_cliente1)
    val direccion: String? = ""
    println(direccion?.length)

    println("Operacion de aserciòn no null. es una manera de buscar excepciones (Si no tiene nada devuelve una excepciòn)")
    val longitudSegura =  apellido_cliente!!.length

    println("\n Interpolacion de strings")
    println("sirve para concatenar cadenas y las que no son cadena de caracteres")
    val nombre_cliente: String = "Leiva"
    val edad_mascota: Int = 5
    val direccion_cliente: String = "Conocoto"
    println("${nombre_cliente.uppercase()} vive en ${direccion_cliente}")
    println("Tiene una mascota de ${edad_mascota} anios")

    println("Variable String Multilinea")
    val message = """
        La cliente $nombre_cliente
        tiene una mascota de $edad_mascota anios
        que se encuentra en perfecto estado de salud
        """
    println(message)

    println("\n CONVERSIONES")
    val edad_cliente: String = "25"
    val edad2: Int = edad_cliente.toInt()
    println(edad2)
    println("Edad en texto: ${edad_cliente} a edad en entero ${edad2}")

    val costo_consulta: Double = 50.8
    val costo_string: String = costo_consulta.toString()
    println(costo_string)
    println("Costo en Double: ${costo_consulta} a costo en string: ${costo_string}")


}