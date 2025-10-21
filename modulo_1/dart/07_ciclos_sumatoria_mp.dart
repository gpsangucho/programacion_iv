void main() {
  int n = 10;
  double suma = 0;

  for (int i = 1; i <= n; i++) {
    suma += i;
    print(suma);
    if (suma == i) {
      print("Descuento: 10%");
    }
  }
  print("El descuento en $n consultas es $suma");

  
  final List<Map<String, dynamic>> citasVeterinarias = [
  {
    'id': 1,
    'mascota': 'Firulais',
    'propietario': 'Juan Pérez',
    'fecha': '2025-10-21',
    'motivo': 'Vacunación',
    'estado': 'pendiente'
  },
    {
    'id': 2,
    'mascota': 'Michi',
    'propietario': 'Ana Gómez',
    'fecha': '2025-10-22',
    'motivo': 'Consulta general',
    'estado': 'completada'
  }
  ];
  for(int i=0; i <= citasVeterinarias.length-1; i++){
    print("Cita N° ${citasVeterinarias[i]['id']} - ${citasVeterinarias[i]['mascota']}");
    
  }
}