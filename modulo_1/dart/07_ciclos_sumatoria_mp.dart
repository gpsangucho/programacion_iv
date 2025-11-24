void main() {
  int n = 10;
  double suma = 0;

  for (int i = 1; i <= n; i++) {
    suma += i;
    print(suma);
    if (suma == i) {
      print("terminos iguales");
    }
  }
  print("la suma de 1.... $n es $suma");
  
  for(int i=1; i <=n; i++){
    for(int j=1;i<=n;j++){
      print("$i x $j = ${i*j}");
    }
  }
}