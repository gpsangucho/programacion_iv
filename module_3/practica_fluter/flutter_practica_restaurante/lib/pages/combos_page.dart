import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';

class MenuPage extends StatefulWidget {
  const MenuPage({super.key});

  @override
  State<MenuPage> createState() => _MenuPageState();
}

class _MenuPageState extends State<MenuPage> {
  String tipo_cliente = 'Nuevo';
  String amountText = '';
  String cantidad_menu = '';
  String resultText = '';

  void calculateTip() {
    final amount = double.tryParse(amountText.replaceAll(',', '.')) ?? 0.0;
    final cantidad = int.tryParse(cantidad_menu) ?? 0;

    if (amount <= 0 || cantidad <=0) {
      setState(() {
        resultText = 'Ingrese un monto válido';
      });
      return;
    }

    double percentage = 0.0; // porcentaje de descuento

    if (tipo_cliente == 'Nuevo') {
      percentage = 0.0;
    } else if (tipo_cliente == 'Frecuente') {
      percentage = 0.08;
    } else if (tipo_cliente == 'Corporativo') {
      percentage = 0.12;
    }

    final subtotal = amount*cantidad;
    final descuento = subtotal*percentage;
    final total = subtotal - descuento;

    setState(() {
      resultText =
        'Subtotal: \$${subtotal.toStringAsFixed(0)}\n'
        'Porcentaje de descuento: \$${percentage.toStringAsFixed(0)} %\n'
        'Monto de descuento: \$${descuento.toStringAsFixed(2)}\n'
        'Total: \$${total.toStringAsFixed(2)}';
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Calcular menú del día'),
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
              'Propina según nivel de servicio',
              style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 16),

//***************************COMBO BOX 1 ********************** */
            DropdownButton<String>(
              value: tipo_plato, //Aqui selecciono el tipo de cliente
              isExpanded: true,
              items: const [
                DropdownMenuItem(
                  value: 'Pollo',
                  child: Text('Arroz con pollo'),
                ),
                DropdownMenuItem(
                  value: 'Carne',
                  child: Text('Arroz con carne'),
                ),
                DropdownMenuItem(
                  value: 'Vegetariano',
                  child: Text('Plato vegetariano'),
                ),
              ],
              onChanged: (value) {
                if (value == null) return;
                setState(() {
                  tipo_plato = value;
                });
              },
            ),
//*************************INPUT TEXT************************ */

            const SizedBox(height: 16),
            TextField(
              decoration: const InputDecoration(
                labelText: 'Precio base del menú (\$)',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {     // Capturo un valor
                amountText = value;    // Asigno el valor capturado en la variable
              },
            ),


            const SizedBox(height: 16),
            TextField(
              decoration: const InputDecoration(
                labelText: 'Cantidad de menús (\$)',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {      // Capturo un valor
                cantidad_menu = value;  // Asigno el valor capturado en la variable
              },
            ),

//**********************BOTON*********************************** */
            const SizedBox(height: 16),
            ElevatedButton(
              onPressed: calculateTip,      // Ejecuto la función de carlularTip()
              child: const Text('Calcular'),
            ),
//**********************TEXT DE SALIDA************************** */
            const SizedBox(height: 16),
            Text(resultText),  
          ],
        ),
      ),
    );
  }
}
