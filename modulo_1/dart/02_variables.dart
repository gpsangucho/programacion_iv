void main() {

  print("Tipos de variables en Dart");
  
  final String pokemon = "Ditto"; //final = constante
  //pokemon = "ute";  <- generamnos un error si queremos cambiar su valor inicial
  print(pokemon);
  //
  String myName = 'Germán';
  myName = "Sangucho";
    print(myName);
  
  //Declaraciòn de 1 constante
  const String elemento = "Fuego";
  print(elemento);
  print("Elemento: $elemento");
  // Variable booleano
  bool active = false;
  print("Es activo: $active");
  // Variable entera
  int hp = 1000;
  print("Caballos de fuerza: $hp");
  
  //De backend se transforma a estas listas, puede ser objetos
  List<String>  abilities=["impostor","correlón"];
  print("habilidades $abilities");
  //  Arreglo de String
  final sprites = <String>["src/image1.jpg","image2"];
  print("Imagenes $sprites");
  
  print("\nImpresion en varias lineas");
  print("""
  $pokemon
  $hp
  $sprites
  $abilities
  """);
  
}
