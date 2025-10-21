void main() {

  print("Citas veterinarias: Operaciones aritmeticas \n");

  final double consulta = 12.5;
  final double  vacuna = 5;
  double descuento = 0.1; //10%
  
  print("SubTotal $consulta + $vacuna = ${consulta + vacuna}");
  print("Descuento: = ${(consulta - vacuna)*(1-descuento)}");
  print("Promoción:  $consulta * 0.6 = ${consulta*0.6}");
  print(" Valor unitario: ${consulta + vacuna} / 4 = ${(consulta+vacuna) / 4}");
  
}
