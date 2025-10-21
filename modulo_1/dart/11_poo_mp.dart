void main() {
  final Cita wolverine = Cita(name: 'logan',mascota:'gato');
  print(wolverine);
  print("Nombre de la mascota: $wolverine.name");
  print("Tipo de mascota: $wolverine.mascota");
}

// Crear una clase
class Cita{
  String name="";
  String mascota="";
  
  Cita({required this.name,this.mascota="sin poder"});
  /*
  @override //sobreescribe la clase por lo que tiene definido
  String toString()
  {
    return "$name - $power";
  }
  */
}
