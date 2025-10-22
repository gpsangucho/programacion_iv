void main() {

  print("Condicionales \n");
  
  bool atendido = true;
  
  print("Condicional sencilla \n");
  
  if (atendido){
    print('cita atendida');
  }

    /////////////////////////////////////////////
    print("Condicional completa\n");
      
   if (atendido){
     print(' Cita atendida');
   }else{
     print('cita no atendida');
   }

  /////////////////////////////////////////////
      print("Condicional anidado \n");
  
  int consultas = 5;
  
  if (consultas > 5){
    print('Descuento del 30% en dos consultas');
  }else if (consultas < 5){
    print('Descuento del 10% en todas sus consultas realizadas');
  }else {
    print('50% de descuento\n');
  }
 
  
  print("Condicionales ternarios: similar a type Script\n");
  int ageMascota = 18;
  
  String  ageDescription = ageMascota >= 18 ? 'adult' : 'child';
  print("La mascota es: $ageDescription");
  
}