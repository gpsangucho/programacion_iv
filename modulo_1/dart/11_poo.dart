void main() {
  final Hero wolverine = Hero(name: 'logan',power:'Regeneracion');
  print(wolverine);
  print(wolverine.name);
  print(wolverine.power);
}

// Crear una clase
class Hero{
  String name="";
  String power="";
  
  Hero({required this.name,this.power="sin poder"});
  /*
  @override //sobreescribe la clase por lo que tiene definido
  String toString()
  {
    return "$name - $power";
  }
  */
}
