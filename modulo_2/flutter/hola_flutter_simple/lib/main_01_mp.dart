import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        
        appBar: AppBar(title: const Text('Sistema de consultas veterinarias'),
        centerTitle: true, backgroundColor: Colors.blue, elevation: 4,
        leading: Icon(Icons.menu), actions: [ IconButton(icon: Icon(Icons.search), onPressed: () {}) ],
        ),

        body: const Center(
          child: Text( '¡Bienvenido al sistema de agendamiento de citas! 😊', style: TextStyle(fontSize: 30),
          ),
        ),
      ),
    ),
  );
}

/**
MaterialApp.- Es el contenedor principal de una app flutter. controla rutas, temas, animaciones, etc
home: _funcion() .- Indica qué pantalla aparece primero al abrir la app
Scaffold(...).- Plantilla visual para pantallas típicas. Aporta estructura tipo "app estándar" de Android/iOS.
    Incluye:
        appBar (barra superior).- Ejemplo: AppBar(title: Text('Hola Flutter'))
        body (contenido).- Es el contenido principal de la pantalla.
        drawer
        bottomNavigationBar
        etc.
Center(...).- Centra su hijo tanto horizontal como verticalmente
Text("cadena", style = ...).- Muestra un texto en pantalla con estilo


 */


