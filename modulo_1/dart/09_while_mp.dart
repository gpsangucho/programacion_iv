void main() {
  List<String> pendientes = [
    "Vacunación de Firulais",
    "Control Gato Mishi",
    "Desparasitación Conejo"
  ];

  while (pendientes.isNotEmpty) {
    print("Atendiendo: ${pendientes.first}");
    pendientes.removeAt(0); // se atiende y se elimina
  }
  
  int dosis = 0;

  do {
    print("Administrando dosis #${dosis + 1}");
    dosis++;
  } while (dosis < 3);
}
