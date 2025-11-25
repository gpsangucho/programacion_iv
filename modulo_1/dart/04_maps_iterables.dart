void main() {

  print("MAPS Iterables \n");

  final numbers = [1,2,3,3,5,5,5,7,7,8,9,10]; //Arreglo va de 0 a n
  print("Lista Original: $numbers"); // $variable: permite acceder solo al valor de la variable
  print("Tamaño: ${numbers.length}"); // ${variable}: permite hacer operaciones
  print("Elemento de índice 4: ${numbers[4]}");
  print("Primer elemento: ${numbers.first}");
  print("Reverso de numbers: ${numbers.reversed}\n");
  
  final reversedNumbers = numbers.reversed;
  print("Reverso de numbers: ${reversedNumbers}");
  print("List: ${reversedNumbers.toList()}"); // Es mas usado. Se recibe del backend y se transforma a list
  print("Set: ${reversedNumbers.toSet()}");
  

}
