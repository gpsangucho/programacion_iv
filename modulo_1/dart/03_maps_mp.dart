void main() {

  print("MAPS: clave-valor. Similar a un JSON");
  //Dynamic: uso de cualquie tipo de valor como ANY en typescrip
  final Map <String, dynamic> mascota = {
    'name':'Dinky',
    'edad':'5',
    'abilities':<String>['impostor','gato','cura'],
    'imágenes': {
      1:'scr/ditto1.jpg',
      2: 'scr/ditto2.jpg',
      3: 'Zucaritas'
    },
    'isDomestic':true
  };
  
  print(pokemon);
  
  // Acceder al valor de un elemento
  print("\n Valores del MAP mascota");
  print(pokemon['name']);
  print(pokemon['imagenes']);
  print(pokemon['isDOmestic']);
  
}
