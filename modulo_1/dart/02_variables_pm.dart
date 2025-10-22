void main() {

  print("Consultas veterinarias: Tipos de variables en Dart");
  
  final String tipoMedico = "Veterinario"; //final = constante

  print(tipoMedico);
  //Delaración de variable
  String  mascota = 'Dynky';
  mascota = "Tarzán";
    print(mascota);
  
  //Declaraciòn de 1 constante
  const String clinicaveterinaria = "Clinica de Mascota";
  print(clinicaveterinaria);
  print("Elemento: $clinicaveterinaria");
  
  // Variable booleano
  bool cita = false;
  print("Estado de la cita: $cita");
  // Variable entera
  int edad = 10;
  print("Edad de mascota: $edad");
  
  //De backend se transforma a estas listas, puede ser objetos
  List<String>  abilities=["salta","juega", "busca"];
  print("habilidades $abilities");
  //  Arreglo de String
  final sprites = <String>["src/image1.jpg","image2"];
  print("Imagenes $sprites");
  
  print("\nImpresion en varias lineas");
  print("""
  $tipoMedico
  $cita
  $sprites
  $abilities
  """);
  
}