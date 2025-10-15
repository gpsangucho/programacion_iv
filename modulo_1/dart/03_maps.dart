void main() {

  print("MAPS: clave-valor. Similar a un JSON");
  //Dynamic: uso de cualquie tipo de valor como ANY en typescrip
  final Map <String, dynamic> pokemon = {
    'name':'Ditto',
    'hp':'100',
    'abilities':<String>['impostor','gato','cura'],
    'sprites': {
      1:'scr/ditto1.jpg',
      2: 'scr/ditto2.jpg',
      3: 'Zucaritas'
    },
    'isAlive':true
  };
  
  print(pokemon);
  
  // Acceder al valor de un elemento
  print("\n");
  print(pokemon['name']);
  print(pokemon['sprites']);
  print(pokemon['isAlive']);
  
}
