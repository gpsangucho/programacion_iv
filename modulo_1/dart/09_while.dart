void main() {
  int n = 10;
  int tabla = 3;
  int i = 0;
  while (i<=n){
    //i++;
    print("$i * $tabla = ${i*tabla}");
    i++;
  }
  print("\n");
  i=0;
   while (i<n){
    //i++;
    print("$i * $tabla = ${i*tabla}");
    i++;
  }
  print("\n");
  i=0;
  while (i<n){
    i++;
    print("$i * $tabla = ${i*tabla}");
  }
  print("\n");
  i=1;
  do{
    print("$i * $tabla = ${i*tabla}");
    i++;
  }while(1<n);
}
