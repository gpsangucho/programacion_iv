void main() {

  print("Condicionales \n");
  
  int edad = 5;
  
  print("Condicional sencilla con edad de la mascota\n");
  
  if (edad>2){
    print('edad > 2 is true');
  }

    if (edad<2){
    print('edad < 2 is true');
  }
  if (edad==2){
    print('edad == 2 is true');
  }
    /////////////////////////////////////////////
    print("Condicional completa\n");
      
   if (edad > 2){
     print('edad > 2 is true');
   }else{
     print('edad <= 2 is true');
   }


   if (edad == 2){
     print('edad ==  2 is true');
   }else{
     print('edad != 2 is true');
   }
  
      print("Condicional anidado \n");
  
  int comidas_diaria = 2;
  
  if (comidas_diaria > 2){
    print('comidas_diaria > 2 is true');
  }else if (comidas_diaria < 2){
    print('comidas_diaria < 2 is true');
  }else {
    print('comidas_diaria == 2 is true');
  }
 
  
  print("Condicionales ternarios: similar edad type Script");
  int age = 18;
  
  String  ageDescription = age >= 18 ? 'adult' : 'child';
  print(ageDescription);
  
}