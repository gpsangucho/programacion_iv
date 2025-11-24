void main() {

  print("Tipos de variables en Dart");
  
  // Constante 
  final String mascota_especie = "Pez";
  
  print(mascota_especie);

  //
  String mascota_propietario = 'Germán';
  mascota_propietario = "Patricio";
    print(mascota_propietario);
  
  //Declaraciòn de 1 constante
  const String  tipo_mascota = "Perro";
  print(tipo_mascota);
  print("Elemento: $tipo_mascota");

  // Variable booleano
  bool active = false;
  print("Es activo: $active");

  // Variable entera
  int edad = 10;
  print("Edad: $edad");
  
  //De backend se transforma a estas listas, puede ser objetos
  List<String>  abilities =["impostor","correlón"];
  print("Habilidades de la mascota: $abilities");
  
  //  Arreglo de String
  final imagenes = <String>["src/image1.jpg","image2"];
  print("Imagenes $imagenes");
  
  print("\nImpresion en varias lineas");
  print("""
  $tipo_mascota
  $mascota_propietario
  $mascota_especie
  $edad
  """);
  
}
