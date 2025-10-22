void main(){
  // Datos de una sola cita
  String mascota = 'Tarzan';
  String dueno = 'Juan Péralta';
  String fecha = '2025-10-21';
  String motivo = 'Vacunación';
  String estado = 'pendiente';

  // Mostrar cita inicial
  mostrarCita(mascota, dueno, fecha, motivo, estado);

  // Cambiar estado
  estado = actualizarEstado(estado);

  // Mostrar cita actualizada
  print('\n=== CITA ACTUALIZADA ===');
  mostrarCita(mascota, dueno, fecha, motivo, estado);

  
}

// Función para mostrar los datos de la cita
void mostrarCita(String mascota, String propietario, String fecha, String motivo, String estado) {
  print('=== CITA VETERINARIA ===');
  print('Mascota: $mascota');
  print('Propietario: $propietario');
  print('Fecha: $fecha');
  print('Motivo: $motivo');
  print('Estado: $estado');
}

// Función para cambiar el estado de la cita
String actualizarEstado(String estadoActual) {
  print('\n Actualizando estado...');
  if (estadoActual == 'pendiente') {
    return 'completada';
  } else {
    return 'pendiente';
  }
}