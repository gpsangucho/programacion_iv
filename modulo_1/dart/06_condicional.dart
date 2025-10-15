void main() {

  print("Condicionales \n");
  
  int a = 5;
  
  print("Condicional sencilla \n");
  
  if (a>2){
    print('a > 2 is true');
  }

    if (a<2){
    print('a < 2 is true');
  }
  if (a==2){
    print('a == 2 is true');
  }
    /////////////////////////////////////////////
    print("Condicional completa\n");
      
   if (a > 2){
     print('a > 2 is true');
   }else{
     print('a <= 2 is true');
   }


   if (a == 2){
     print('a ==  2 is true');
   }else{
     print('a != 2 is true');
   }
  
      print("Condicional anidado \n");
  
  int b = 2;
  
  if (b > 2){
    print('b > 2 is true');
  }else if (b < 2){
    print('b < 2 is true');
  }else {
    print('b == 2 is true');
  }
 
  
  print("Condicionales ternarios: similar a type Script");
  int age = 18;
  
  String  ageDescription = age >= 18 ? 'adult' : 'child';
  print(ageDescription);
  
}