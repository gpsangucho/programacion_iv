package com.example.basic

fun main(){

    println("LISTAS\n")

    // Aqui la lista es constante y no se puede modificar en tiempo de ejecuciòn
    val inmutableLista: List<Int> =  listOf(1,2,3)
    println("Lista inmutable ${inmutableLista}")

    // Aqui la lista puede modificar en tiempo de ejecuciòn
    val mutableLista: MutableList<Int> = mutableListOf(4,5,6)
    println("Lista mutable ${mutableLista}")

    mutableLista.add(7)
    println("Lista mutable ${mutableLista}")
    mutableLista.removeAt(index = 0)
    println("Lista mutable ${mutableLista}")

    // se puede recorrer con un for
    println("Con For sin llave")
    for(mutable in mutableLista) println(mutable)
    //
    println("Con For con llave")
    for(mutable in mutableLista){ println(mutable)}

    println("Operaciones con Mutable List")

    val colores = mutableListOf("rojo","verde")
    colores.add("azul")
    colores+="amarillo"
    colores.add( index=1,element= "blanco")
    println(colores)
    colores.remove( element="verde")
    println("colores")
    colores.removeAt(index=0)
    println(colores)
    colores[0]="negro"
    println(colores)
    colores.clear()
    println(colores.isEmpty())

    println("Busqueda")
    val nombres = mutableListOf("juan","luis","pedro")
    println(nombres.find {it.startsWith(prefix = "l")})
    println(nombres.firstOrNull {it.length>4})
    println(nombres.any {it.contains(char = 'j')})
    println(nombres.none {it == "X"})

    println("Ordenamiento con Mutable")
    val numerosDesordenados = mutableListOf(8,3,2,4,0,6,7,2,7)
    println(numerosDesordenados.sorted()) // numeros ordenados
    println(numerosDesordenados.sortDescending()) // numeros descendientes
    println(numerosDesordenados.distinct()) //numeros distintos (imprime los que no se repitan)
    println(numerosDesordenados)

    // el tipo de dato contenido en la LISTA MUTABLE pueden ser objetos
    // se llena una Lista con la info que envìa el backend (objetos)

}