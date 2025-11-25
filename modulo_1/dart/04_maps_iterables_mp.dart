void main() {

  print("MAPS Iterables \n");

  final temperaturas = [1,2,3,3,5,5,5,7,7,8,9,10]; //Arreglo va de 0 a n
  print("Lista de temperatura de mascotas: $temperaturas"); // $variable: permite acceder solo al valor de la variable
  print(" # Mascota medidas: ${temperaturas.length}"); // ${variable}: permite hacer operaciones
  print("Valor T° mascota 4: ${temperaturas[4]}");
  print("Primera mascota: ${temperaturas.first}");
  print("Valores de T° reversados: ${temperaturas.reversed}\n");
  
  final reversedNumbers = temperaturas.reversed;
  print("Reverso de numbers: ${reversedNumbers}");
  print("Lista: ${reversedNumbers.toList()}"); // Es mas usado. Se recibe del backend y se transforma a list
  print("Set: ${reversedNumbers.toSet()}");
  

}
