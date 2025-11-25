import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';

class OrderTotalPage extends StatefulWidget {
  const OrderTotalPage({super.key});

  @override
  State<OrderTotalPage> createState() => _OrderTotalPageState();
}

class _OrderTotalPageState extends State<OrderTotalPage> {
  String subtotalText1 = '';
  String subtotalText2 = '';
  String subtotalText3 = '';
  String resultText = '';

  void calculateTotal() {
    final subtotal1 = double.tryParse(subtotalText1.replaceAll(',', '.')) ?? 0.0;
    final subtotal2 = double.tryParse(subtotalText2.replaceAll(',', '.')) ?? 0.0;
    final subtotal3 = double.tryParse(subtotalText3.replaceAll(',', '.')) ?? 0.0;

    if (subtotal1 <= 0 || subtotal2 < 0 || subtotal3 < 0) {
      setState(() {
        resultText = 'Ingrese un subtotal válido';
      });
      return;
    }

    const ivaRate = 0.12;
    final subtotal =  subtotal1 + subtotal2 + subtotal3;
    final iva = subtotal * ivaRate;
    final total = subtotal + iva;

    setState(() {
      resultText =
        'Subtotal: \$${subtotal.toStringAsFixed(2)}\n'
        'IVA (12%): \$${iva.toStringAsFixed(2)}\n'
        'Total a pagar: \$${total.toStringAsFixed(2)}';
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Total con IVA'),
        leading: IconButton(
          icon: const Icon(Icons.arrow_back),
          onPressed: () => context.go('/'),
        ),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.stretch,
          children: [
            const Text(
              'Servicio Veterinario: Cuenta total',
              style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
            ),

            const SizedBox(height: 16),

            TextField(
              decoration: const InputDecoration(
                labelText: 'Honorarios base (\$)',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {
                subtotalText1 = value;
              },
            ),

            TextField(
              decoration: const InputDecoration(
                labelText: ' Horonorario especialista  (\$)',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {
                subtotalText2 = value;
              },
            ),

                        TextField(
              decoration: const InputDecoration(
                labelText: ' Insumos  (\$)',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {
                subtotalText3 = value;
              },
            ),

            const SizedBox(height: 16),
            ElevatedButton(
              onPressed: calculateTotal,
              child: const Text('Calcular'),
            ),

            const SizedBox(height: 16),
            Text(resultText),
          ],
        ),
      ),
    );
  }
}
