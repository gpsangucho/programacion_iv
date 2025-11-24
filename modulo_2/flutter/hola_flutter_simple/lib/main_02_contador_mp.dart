import 'package:flutter/material.dart';

void main() {
  int contador = 0;
  int contador1 = 0;
  int contador2 = 0;

    void reset() {
    contador = 0;
    contador1 = 0;
    contador2 = 0;
  }

  runApp(
    MaterialApp(
      home: Scaffold(

        appBar: AppBar(title: const Text('Consultas veterinaria: contador de atención')),
        
        body: StatefulBuilder(
          builder: (context, setState) {

            return Center(
              child: Column(
                mainAxisSize: MainAxisSize.min,
                children: [

                //CUADRO DE TEXTO
                  Text('Cita atendida : $contador', style: const TextStyle(fontSize: 28)),
                                  // WIDGETZ de espacio. Atrobutos: width:... , height:...
                  const SizedBox(height: 16),

                //BOTON
                  ElevatedButton(
                    onPressed: () => setState(() => contador++),
                    child: const Text('+1'),
                 ),
                  Text('Cita cancelada : $contador1', style: const TextStyle(fontSize: 28)),
                                  // WIDGETZ de espacio. Atrobutos: width:... , height:...
                  const SizedBox(height: 16),

                //BOTON
                  ElevatedButton(
                    onPressed: () => setState(() => contador1++),
                    child: const Text('+1'),
                 ),
                  Text('Cita pendiente : $contador2', style: const TextStyle(fontSize: 28)),
                
                // WIDGETZ de espacio. Atrobutos: width:... , height:...
                  const SizedBox(height: 16),

                //BOTON
                  ElevatedButton(
                    onPressed: () => setState(() => contador2++),
                    child: const Text('+1'),
                 ),

                //BOTON RESET
                  const SizedBox(height: 16),

                  ElevatedButton(
                    onPressed: () => setState(() => reset() ),
                    child: const Text('Reset contadores'),
                 ),

                ],
              ),
            );
          },
        ),
      ),
    ),
  );
}


/* StatefulBuilder.- Permite que una parte específica de la UI tenga un estado interno propio sin convertir todo el widget en un StatefulWidget
                    Cambia cuando llamas setState()
Builder.- Es un StatefulWidget pero local.
*/
/**
La UI es un árbol de widgets. Todo es un widgetz: Texto, botones, espacios, pantallas, etc

MaterialApp
 └── Scaffold
      ├── AppBar
      └── Body
           └── Column
                ├── Text
                ├── SizedBox
                └── ElevatedButton
 
 Widgets "Center": “Centrar el contenido que viene dentro.”
 child: Column(): "Column" es hijo de "Center"
 Column: organiza widgets uno debajo del otro (vertical).
    📌 Significado: → “Voy a colocar varios widgets en una columna.”

*Árbol de propiedades de Colum:

Column
│
├── mainAxisAlignment
│     ├── start
│     ├── center
│     ├── end
│     ├── spaceBetween
│     ├── spaceAround
│     └── spaceEvenly
│
├── mainAxisSize
│     ├── max
│     └── min
│
├── crossAxisAlignment
│     ├── start
│     ├── center
│     ├── end
│     ├── stretch
│     └── baseline
│
├── verticalDirection
│     ├── down
│     └── up
│
├── textBaseline
│     ├── alphabetic
│     └── ideographic
│
└── children[]
      ├── widget 1
      ├── widget 2
      └── widget n

 */
 /**
 "=>" significa: Retorna esto directamente
 
 "()" => : es una función anónima abreviada, ejemplo: 
         () {
                return algo;
            }
  
onPressed: () {
  setState(() {
    contador  = 0;
    contador1 = 0;
    contador2 = 0;
  });
},

  */