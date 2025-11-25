import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';

class RestaurantHomePage extends StatelessWidget {
  const RestaurantHomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Menú consultas veterinarias')),
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            const Text(
              'Seleccione una opción:',
              style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 24),

            ElevatedButton(
              onPressed: () => context.go('/order'),
              child: const Text('Calculo de costo del servicio con IVA'),
            ),
            const SizedBox(height: 12),

            ElevatedButton(
              onPressed: () => context.go('/tip'),
              child: const Text('Calificación del servicio'),
            ),
            const SizedBox(height: 12),

            ElevatedButton(
              onPressed: () => context.go('/split'),
              child: const Text('Financiamiento a plazos'),
            ),

            const SizedBox(height: 12),

            ElevatedButton(
             onPressed: () => context.go('/menu'),
              child: const Text('Calcular costo de servicios'),
            ),
          ],
        ),
      ),
    );
  }
}
