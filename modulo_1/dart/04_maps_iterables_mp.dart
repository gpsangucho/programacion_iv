void main() {

  print("MAPS Iterables \n");
  
  final Map<String, dynamic> citaVeterinaria = {
  'id': 1,
  'fecha': '2025-10-21',
  'hora': '10:30',
  'mascota': {
    'nombre': 'Firulais',
    'especie': 'Perro',
    'raza': 'Labrador',
    'edad': 5,
    'sexo': 'Macho'
  },
  'propietario': {
    'nombre': 'Juan Pérez',
    'telefono': '0991234567',
    'correo': 'juanperez@mail.com'
  },
  'motivoConsulta': 'Vacunación anual',
  'diagnostico': null,
  'tratamiento': null,
  'veterinario': {
    'nombre': 'Dra. María Torres',
    'especialidad': 'Medicina General',
    'codigoProfesional': 'VET-2023-015'
  },
  'estado': 'pendiente', // puede ser pendiente, completada, cancelada
  'observaciones': []
};

  print(citaVeterinaria);
  print("Tamaño de campos: ${citaVeterinaria.length}");

  print("Elemento de índice \"estado\": ${citaVeterinaria['estado']}");
  print("Llaves: ${citaVeterinaria.keys}");
  print("Mapa: ${citaVeterinaria.map}\n");
   

}
