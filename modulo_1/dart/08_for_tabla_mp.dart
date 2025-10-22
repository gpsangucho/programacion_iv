void main(){
  
  final List<Map<String, dynamic>> preciosServicio = [
    {
      'id':1,
      'servicio': 'Consulta general',
      'valor': 25.0,
      'tiempo': 30,
      'descripcion': 'Revisión médica básica de la mascota'
    },
    {
      'id':2,
      'servicio': 'Vacunación',
      'valor': 18.5,
      'tiempo': 15,
      'descripcion': 'Aplicación de vacunas según plan anual de vacunas'
    },
    {
      'id':3,
      'servicio': 'Desparasitación',
      'valor': 12.0,
      'tiempo': 10,
      'descripcion': 'Tratamiento antiparasitario interno o externo de la mascota'
    },
    {
      'id':4,
      'servicio': 'Control postoperatorio',
      'valor': 20.0,
      'tiempo': 20,
      'descripcion': 'Revisión tras cirugía para verificar recuperación'
    },
  ];
  
  print("Tabla de servicios");
  print("ID \t Valor \t Descripción");
  for(int i=0;i <= preciosServicio.length - 1;i++){
    print("N°: ${preciosServicio[i]['id']} \t ${preciosServicio[i]['valor']} \t ${preciosServicio[i]['descripcion']}");
  }
}