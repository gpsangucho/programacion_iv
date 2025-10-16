void main() {
  final Calculadora A = Calculadora(numero1: 1.3 ,numero2: 2.6);
  print(A);
  print(A.suma());
  print(A.restar());
  print(A.product());
  print(A.dividir());
 
}

// Crear una clase
class Calculadora{
  double numero1=0.0;
  double numero2=0.0;
  
  //Constructor: recibe los datos
  Calculadora({required this.numero1,required this.numero2});
  
  double sumar(double numero1, double numero2){
    return this.numero1 + this.numero2;
  }
  double resta(double numero1, double numero2){
    return this.numero1 - this.numero2;
  }
  
  double producto(double numero1, double numero2){
    return this.numero1 * this.numero2;
  }
  
  double division(double numero1, double numero2){
    return this.numero1 / this.numero2;
  }
  
  double suma(){
    return this.numero1 + this.numero2;
  }
  double restar(){
    return this.numero1 - this.numero2;
  }
  
  double product(){
    return this.numero1 * this.numero2;
  }
  
  double dividir(){
    return this.numero1 / this.numero2;
  }
  
  
}
