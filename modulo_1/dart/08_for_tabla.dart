void main() {
  int n = 10;
  int tabla = 3;
  
  for(int i=1; i <=n; i++){
    print("Tabla del $i");
    for(int j=1;i<=n;j++){
      print("$i x $j = ${i*j}");
    }
  }
  
  for(int i=1;i <n;i++){
    print("$i * $tabla = ${i*tabla}");
  }
}