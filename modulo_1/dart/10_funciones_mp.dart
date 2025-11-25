// Lista para simular consultas
List<String> consultas = [];

// Función para registrar una consulta (sin pedir datos)
void registrarConsulta(String mascota, String motivo) {
  consultas.add("$mascota - $motivo");
  print("Consulta registrada: $mascota ($motivo)");
}

// Función para listar todas las consultas
void listarConsultas() {
  print("\n=== CONSULTAS REGISTRADAS ===");

  if (consultas.isEmpty) {
    print("No hay consultas.\n");
    return;
  }

  for (int i = 0; i < consultas.length; i++) {
    print("${i + 1}. ${consultas[i]}");
  }

  print("");
}

void main() {
  // Simulación sin dart:io: valores ya definidos
  registrarConsulta("Firulais", "Dolor de estómago");
  registrarConsulta("Michi", "Vacunación");
  registrarConsulta("Conejo Peludo", "Revisión general");

  listarConsultas();

  // Si quieres, puedes llamar más funciones
  registrarConsulta("Toby", "Chequeo dental");

  listarConsultas();
}
