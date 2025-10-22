void main() {

  print("MAPS: CITA");
  //Dynamic: uso de cualquie tipo de valor como ANY en typescrip
  final Map <String, dynamic> cita = {
    'cliente':'Ditto',
    'mascota':'100',
    'features':<String>['perro','Paston Alemán','café'],
    'Imágenes': {
      1:'scr/ditto1.jpg',
      2: 'scr/ditto2.jpg',
      3: 'Zucaritas'
    },
    'isHealthy':false
  };
  print(cita);
}