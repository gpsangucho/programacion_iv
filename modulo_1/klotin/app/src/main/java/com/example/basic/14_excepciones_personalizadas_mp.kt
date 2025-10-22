package com.example.basic

import java.time.LocalDate

class fechaInvalidaException(msg: String): Exception(msg)
class DatosCitaIncompletosException(msg:String): Exception(msg)
class pacienteNoEncontradoException(msg:String): Exception(msg)
/*
class cita(
    val mascota: String?,
    val fecha: LocalDate,
    val motivo: String?
) {

    init {
        if (mascota.isNullOrBlank()) {
            throw pacienteNoEncontradoException("El nombre de la mascota es obligatorio")
        }

        if (fecha == null) {
            throw fechaInvalidaException("Debe especificar una fecha")
        }

        if (fecha.isBefore(LocalDate.now())) {
            throw fechaInvalidaException("La fecha de la cita no puede ser en el pasado")
        }

        if (motivo.isNullOrBlank()) {
            throw DatosCitaIncompletosException("Debe indicar el motivo de la cita")
        }
    }
}
*/
fun agendarCita(mascota: String?,fecha: LocalDate?, motivo: String?): String{
    return try {
        when {
            mascota.isNullOrBlank() ->  throw pacienteNoEncontradoException("El nombre de la mascota es obligatorio")
            fecha == null ->  throw fechaInvalidaException("Debe especificar una fecha")
            fecha.isBefore(LocalDate.now())-> throw fechaInvalidaException("La fecha de la cita no puede ser en el pasado")
            motivo.isNullOrBlank() -> throw DatosCitaIncompletosException("Debe indicar el motivo de la cita")
            else -> {"Error: Valor inesperado: $fecha"}
        }
    }catch (e: pacienteNoEncontradoException){
        "error: ${e.message}. Se requiere completar datos del áciente"
    }catch (e: fechaInvalidaException){
       "error: ${e.message}. Se requiere fecha actual o superior"
    }catch (e: fechaInvalidaException){
        "error: ${e.message}. Se requiere "
    }catch (e:DatosCitaIncompletosException){
       "error: ${e.message}. Se requiere colocar el motivo de la cita"
    }finally {
        "reporte enviado"
    }
}

fun main(){
    println(agendarCita(mascota =null, fecha = LocalDate.of(2025, 10, 20), motivo="Dolor de panza"))

}