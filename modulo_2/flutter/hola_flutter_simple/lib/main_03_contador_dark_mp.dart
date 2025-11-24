import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    const bg = Color(0xFF0d1117);
    const card = Color(0xFF161b22);
    const text = Color(0xFFc9d1d9);
    const primary = Color(0xFF58a6ff);
    const accent = Color(0xFF2ea043);
    const border = Color(0xFF30363d);

    final theme = ThemeData(
      useMaterial3: true,
      brightness: Brightness.dark,
      scaffoldBackgroundColor: bg,
      colorScheme: ColorScheme.fromSeed(
        seedColor: primary,
        brightness: Brightness.dark,
        primary: primary,
        secondary: accent,
        surface: card,
        outline: border,
      ),
      cardColor: card,
      textTheme: const TextTheme(bodyMedium: TextStyle(color: text)),
      appBarTheme: const AppBarTheme(
        backgroundColor: Color(0xFF161b22),
        foregroundColor: Color(0xFF58a6ff),
        elevation: 0,
      ),
    );

    return MaterialApp(
      title: 'Flutter Dark Counter',
      debugShowCheckedModeBanner: false,
      theme: theme,
      home: const CounterPage(),
    );
  }
}

class CounterPage extends StatefulWidget {
  const CounterPage({super.key});
  @override
  State<CounterPage> createState() => _CounterPageState();
}

class _CounterPageState extends State<CounterPage> {
  int count1 = 0;
  int count2 = 0;
  int count3 = 0;
  String valor1 = "mg/ml";
  String valor2 = "mg/ml";
  String valor3 = "mg/ml";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      
      appBar: AppBar(title: const Text('Dosificación de medicina veterinaria'),
      centerTitle: true,
      ),

      body: Center(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [

            /* TARJETA:
              Card(...) es un contenedor con estilo de tarjeta
              Padding(...) agrega espacio interno alrededor del contenido.
              Row(...) coloca widgets horizontales (uno al lado del otro).
              "mainAxisSize: MainAxisSize.min" 
                  hace que Row ocupará solo el ancho necesario.
                  NO se expandirá a todo el ancho de la pantalla.

                ┌──────────────────────────┐   ← Card
                │   (-1)  (+1)  (Reset)    │   ← Row con Padding
                └──────────────────────────┘
              
              child: _widgets.-  Usado cuando un widgets puede contener un widgets
              children: [] .- Usado cuando un widgets puede contener varios widgets
                              Siempre recibe una lista de widgets
              WIDGETS:
                Icon(Icons.star)
                Text("Hola")
            */

            Card(
              child: Padding(
                padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 12),
                child: Row(
                  mainAxisSize: MainAxisSize.min,
                  children: [
                    // TEXTO
                    const Text('Desparasitante: ', style: TextStyle(fontSize: 18)),
                    // ESPACIO
                    const SizedBox(height: 8),
                    // TEXTO
                    Text('$count1', style: const TextStyle(fontSize: 56, fontWeight: FontWeight.w800)),
                    // ESPACIO
                    const SizedBox(height: 16),

                    // COMBO BOX
                    DropdownButton<String>(
                      value: valor1,  // Valor seleccionado

                      items: const [
                        DropdownMenuItem(value: "mg/ml", child: Text("mg/ml")),
                        DropdownMenuItem(value: "mg/l", child: Text("mg/l")),
                        DropdownMenuItem(value: "ml", child: Text("ml")),
                        DropdownMenuItem(value: "cm", child: Text("cm")),
                      ],

                      onChanged: (valorNuevo) {
                        setState(() {
                        valor1 = valorNuevo!;
                        });
                      },
                    ),
                            
                    // ESPACIO
                    const SizedBox(height: 16),

                    //BOTON
                    FilledButton.tonal(
                      onPressed: () => setState(() => count1 = (count1 - 1).clamp(0, 999999)),
                      child: Icon(Icons.remove),//const Text('-1'),
                    ),

                    // ESPACIO
                    const SizedBox(width: 12),

                    // BOTON
                    FilledButton(
                      onPressed: () => setState(() => count1++),
                      child: Icon(Icons.add), //const Text('+1'),
                    ),

                    //ESPACIO
                    const SizedBox(width: 12),

                    // BOTON
                    OutlinedButton(
                      onPressed: () => setState(() => count1 = 0),
                      child: const Text('Reset'),
                    ),

                  ],
                ),
              ),
            ),

            Card(
              child: Padding(
                padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 12),
                child: Row(
                  mainAxisSize: MainAxisSize.min,
                  children: [
                    // TEXTO
                    const Text(' Anastecia: ', style: TextStyle(fontSize: 18)),
                    // ESPACIO
                    const SizedBox(width: 12),
                    Text('$count2', style: const TextStyle(fontSize: 56, fontWeight: FontWeight.w800)),
                    // ESPACIO
                    const SizedBox(width: 12),
                                        // COMBO BOX
                    DropdownButton<String>(
                      value: valor2,  // Valor seleccionado

                      items: const [
                        DropdownMenuItem(value: "mg/ml", child: Text("mg/ml")),
                        DropdownMenuItem(value: "mg/l", child: Text("mg/l")),
                        DropdownMenuItem(value: "ml", child: Text("ml")),
                        DropdownMenuItem(value: "cm", child: Text("cm")),
                      ],

                      onChanged: (valorNuevo) {
                        setState(() {
                          valor2 = valorNuevo!;
                        });
                      },
                    ),

                    // ESPACIO
                    const SizedBox(width: 12),

                    Row(
                      children:[
                         //BOTON
                          FilledButton.tonal(
                            onPressed: () => setState(() => count2 = (count2 - 1).clamp(0, 999999)),
                            child: Icon(Icons.remove),//const Text('-1'),
                          ),

                          // ESPACIO
                          const SizedBox(width: 12),

                          // BOTON
                          FilledButton(
                            onPressed: () => setState(() => count2++),
                            child: Icon(Icons.add), //const Text('+1'),
                          ),

                          //ESPACIO
                          const SizedBox(width: 12),

                          // BOTON
                          OutlinedButton(
                            onPressed: () => setState(() => count2 = 0),
                            child: const Text('Reset'),
                          ),
                      ],
                    ),
                               
                  ],
                ),
              ),
            ),
            
            Card(
              child: Padding(
                padding: const EdgeInsets.symmetric(horizontal: 16, vertical: 12),
                child: Row(
                  mainAxisSize: MainAxisSize.min,
                  children: [
                    const Text(' Paracetamol: ', style: TextStyle(fontSize: 18)),
                    // ESPACIO
                    const SizedBox(width: 12),
                    Text('$count3', style: const TextStyle(fontSize: 56, fontWeight: FontWeight.w800)),
                    // ESPACIO
                    const SizedBox(width: 12),

                    // COMBO BOX
                    DropdownButton<String>(
                      value: valor3,  // Valor seleccionado

                      items: const [
                        DropdownMenuItem(value: "mg/ml", child: Text("mg/ml")),
                        DropdownMenuItem(value: "mg/l", child: Text("mg/l")),
                        DropdownMenuItem(value: "ml", child: Text("ml")),
                        DropdownMenuItem(value: "cm", child: Text("cm")),
                      ],

                      onChanged: (valorNuevo) {
                        setState(() {
                          valor3 = valorNuevo!;
                        });
                      },
                    ),

                    const SizedBox(width: 12),

                    //BOTON
                    FilledButton.tonal(
                      onPressed: () => setState(() => count3 = (count3 - 1).clamp(0, 999999)),
                      child: Icon(Icons.remove),//const Text('-1'),
                    ),

                    // ESPACIO
                    const SizedBox(width: 12),

                    // BOTON
                    FilledButton(
                      onPressed: () => setState(() => count3++),
                      child: Icon(Icons.add), //const Text('+1'),
                    ),

                    //ESPACIO
                    const SizedBox(width: 12),

                    // BOTON
                    OutlinedButton(
                      onPressed: () => setState(() => count3 = 0),
                      child: const Text('Reset'),
                    ),

                  ],
                ),
              ),
            ),


          ],
        ),
      ),
    );
  }
}

/**
Scaffold			  	   → Scaffold: estructura principal de la pantalla.
│
├── AppBar							→ AppBar: barra superior con el título "Contador".							
│     └── Text('Contador')
│
└── Body → Center						→ Center: centra todo el contenido
        │
        └── Column (mainAxisSize: min)	→ Column: organiza los widgets verticalmente
              │
              ├── Text('Has presionado:', fontSize: 18)
              ├── SizedBox(height: 8)
              ├── Text('$count', fontSize: 56, fontWeight: w800)
              ├── SizedBox(height: 16)
              │
              └── Card					→ Tarjetas donde están los botones horizontalmente.
                     │
                     └── Padding (16 horizontal, 12 vertical)
                           │
                           └── Row (mainAxisSize: min)		→ organiza los botones horizontalmente.
                                 │
                                 ├── FilledButton.tonal
                                 │      └── Text('-1')
                                 │
                                 ├── SizedBox(width: 12)
                                 │
                                 ├── FilledButton
                                 │      └── Text('+1')
                                 │
                                 ├── SizedBox(width: 12)
                                 │
                                 └── OutlinedButton
                                        └── Text('Reset')
 */