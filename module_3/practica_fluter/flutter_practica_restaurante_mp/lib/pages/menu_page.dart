import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';

class MenuPage extends StatefulWidget {
  const MenuPage({super.key});

  @override
  State<MenuPage> createState() => _MenuPageState();
}

class _MenuPageState extends State<MenuPage> {
  String tipo_cliente = 'Nuevo';
  String amountText1 = '';
  String cantidad_menu1 = '';
    String amountText2 = '';
  String cantidad_menu2 = '';
  String resultText = '';

  void calculateTip() {
    final amount1 = double.tryParse(amountText1.replaceAll(',', '.')) ?? 0.0;
    final cantidad1 = int.tryParse(cantidad_menu1) ?? 0;

    final amount2 = double.tryParse(amountText2.replaceAll(',', '.')) ?? 0.0;
    final cantidad2 = int.tryParse(cantidad_menu2) ?? 0;

    if (amount1 <= 0 || cantidad1 <=0 ||amount2 <= 0 || cantidad2 <=0) {
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

    final subtotal = amount1*cantidad1 + amount2*cantidad2;
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
        title: const Text('Calcular costo de servicios'),
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

//***************************COMBO BOX********************** */
            DropdownButton<String>(
              value: tipo_cliente, //Aqui selecciono el tipo de cliente
              isExpanded: true,
              items: const [
                DropdownMenuItem(
                  value: 'Nuevo',
                  child: Text('Cliente nuevo'),
                ),
                DropdownMenuItem(
                  value: 'Frecuente',
                  child: Text('Cliente Frecuente'),
                ),
                DropdownMenuItem(
                  value: 'Corporativo',
                  child: Text('Cliente corporativo'),
                ),
              ],
              onChanged: (value) {
                if (value == null) return;
                setState(() {
                  tipo_cliente = value;
                });
              },
            ),
//*************************INPUT TEXT************************ */

            const SizedBox(height: 16),
            TextField(
              decoration: const InputDecoration(
                labelText: 'Precio base de servicio veterinario (\$)',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {     // Capturo un valor
                amountText1 = value;    // Asigno el valor capturado en la variable
              },
            ),


            const SizedBox(height: 16),
            TextField(
              decoration: const InputDecoration(
                labelText: 'Cantidad de servicio veterinario básico (\$)',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {      // Capturo un valor
                cantidad_menu1 = value;  // Asigno el valor capturado en la variable
              },
            ),


//*************************INPUT TEXT************************ */

            const SizedBox(height: 16),
            TextField(
              decoration: const InputDecoration(
                labelText: 'Precio base servicio especialista (sin insumos) (\$)',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {     // Capturo un valor
                amountText2 = value;    // Asigno el valor capturado en la variable
              },
            ),


            const SizedBox(height: 16),
            TextField(
              decoration: const InputDecoration(
                labelText: 'Cantidad de servicio especialista (\$)',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {      // Capturo un valor
                cantidad_menu2 = value;  // Asigno el valor capturado en la variable
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
