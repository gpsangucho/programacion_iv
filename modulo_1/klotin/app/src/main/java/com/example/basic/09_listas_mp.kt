package com.example.basic

fun main(){

    println("LISTAS PROYECT CONSULTAS VETERINARIAS\n")

    // Listar detalle de una cita
    val inmutableListarDetalleCita: List<String> =  listOf("id","mascota","fecha","veretinario")
    println("Lista Inmutable: Campos de Cita ${inmutableListarDetalleCita}")

    //*************************************************************/
    // Listar detalle de una mascota
    val mutableListarDetalleMascota: MutableList<String> = mutableListOf("id: 1","nombre: Jous","edad: 2 años")
    println("\n Lista mutable de detalle de mascota: ${mutableListarDetalleMascota}")
    // Modificar lista
    mutableListarDetalleMascota.add("especie: sarigueya")
    println("\nLista mutable de detalle de mascota: ${mutableListarDetalleMascota}")
    mutableListarDetalleMascota.removeAt(index = 0)
    println("\nLista mutable de detalle de mascota: ${mutableListarDetalleMascota}")

    //*************************************************************/
    //Recorrer lista
    println("\n Con For sin llave")
    for(lista in mutableListarDetalleMascota) println(lista)
    //
    println("\n Con For con llave")
    for(mutable in mutableListarDetalleMascota){ println(mutable)}

    //*************************************************************/
    println("\n Operaciones con Mutable List")
    val mascotas = mutableListOf("Frank","Spoony","Scooby")
    println(mascotas)
    // Agregar
    println("\n\t Agregar \"mascotas\"")
    mascotas.add("Dinky")
    mascotas+="Tashiko"
    mascotas.add( index=1,element= "Franko")
    println(mascotas)

    //Eliminar
    println("\n\t Eliminar \'mascotas\'")
    mascotas.remove( element="Snoopy")
    println(mascotas)
    mascotas.removeAt(index=0)
    println(mascotas)
    mascotas[0]="Xuxy"
    println(mascotas)
    mascotas.clear()
    println("\n\t Mascota$: ")
    println(mascotas.isEmpty())

    //*************************************************************/
    // BUSQUEDAS
    println("\nBusqueda en listas\n")
    val duenios = mutableListOf("juan","luis","pedro")
    println(duenios .find {it.startsWith(prefix = "l")})
    println(duenios .firstOrNull {it.length>4})
    println(duenios .any {it.contains(char = 'j')})
    println(duenios .none {it == "X"})

    println("\n Ordenamiento con Mutable\n")
    val edadesMascotas = mutableListOf(8,3,2,4,0,6,7,2,7)
    println(edadesMascotas.sorted()) // numeros ordenados
    println(edadesMascotas.sortDescending()) // numeros descendientes
    println(edadesMascotas.distinct()) //numeros distintos (imprime los que no se repitan)
    println(edadesMascotas)

    // el tipo de dato contenido en la LISTA MUTABLE pueden ser objetos
    // se llena una Lista con la info que envìa el backend (objetos)

}