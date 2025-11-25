void main() {

  final pacientes = {
    "Firulais": ["Antipulgas", "Vacuna Rabia"],
    "Mishi": ["Desparasitación"],
    "Luna": ["Vacuna Triple", "Antibiótico"]
  };

  for (var mascota in pacientes.keys) {
    print("Mascota: $mascota");

    // Aquí el segundo for recorre la lista de medicamentos del paciente
    for (var medicamento in pacientes[mascota]!) {
      print("  - Medicamento: $medicamento");
    }
  }
}