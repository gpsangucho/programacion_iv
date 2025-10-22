void main() {
  print(greetEveryone());
  print(suma(3,4));
  print(addTwoNumberOptional(6,8));
  print(addTwoNumberOptional(8));
  print(greetPerson(name:"Ger", message:"Hasta la vista"));
  print(greetPerson(name:"Ger"));
}
// funciòn flecha
String greetEveryone()=>'Hello everyone';
int suma(int a, int b)=> a+b;

//con parámetro opcional
int addTwoNumberOptional(int a, [int b = 0]){
  return a+b;
}

//con mensaje opcional con valor por defecto
String greetPerson({required String name, String message = "Hola"}){
  return '$message $name';
}