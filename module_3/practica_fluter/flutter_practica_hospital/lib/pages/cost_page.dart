import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';

class CostPage extends StatefulWidget {
  const CostPage({super.key});

  @override
  State<CostPage> createState() => _CostPageState();
}
//************************************************** */
class _CostPageState extends State<CostPage> {
     String tipo_hab = 'general';
     String seguro_medico = 'publico';

     String weightText = '';
  String dosePerKgText = '';
  String resultText = '';

  void calculateDose() {
    final weight = double.tryParse(weightText.replaceAll(',', '.')) ?? 0.0;
    final dosePerKg = double.tryParse(dosePerKgText.replaceAll(',', '.')) ?? 0.0;

    if (weight <= 0 || dosePerKg <= 0) {
      setState(() {
        resultText = 'Ingrese valores válidos';
      });
      return;
    }

    final totalDose = weight * dosePerKg;

    setState(() {
      resultText =
        'Peso: ${weight.toStringAsFixed(2)} kg\n'
        'Dosis por kg: ${dosePerKg.toStringAsFixed(2)} mg/kg\n'
        'Dosis total: ${totalDose.toStringAsFixed(2)} mg';
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Dosis por peso'),
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

//*********************TITULO************************
            const Text(
              'Cálculo de costo de hospitalizacion',
              style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 16),
            
//*********************COMBO************************ */
            DropdownButton<String>(
              value: tipo_hab, //Aqui selecciono el tipo de cliente
              isExpanded: true,
              items: const [
                DropdownMenuItem(
                  value: 'general',
                  child: Text('GENERAL'),
                ),
                DropdownMenuItem(
                  value: 'semi',
                  child: Text('SEMI-PRIVADA'),
                ),
                DropdownMenuItem(
                  value: 'privada',
                  child: Text('PRIVADA'),
                ),
              ],
              onChanged: (value) {
                if (value == null) return;
                setState(() {
                  tipo_hab = value;
                });
              },
            ),
//*********************COMBO************************ */
            DropdownButton<String>(
              value: seguro_medico, //Aqui selecciono el tipo de cliente
              isExpanded: true,
              items: const [
                DropdownMenuItem(
                  value: 'publico',
                  child: Text('SEGURO PUBLICO'),
                ),
                DropdownMenuItem(
                  value: 'privado',
                  child: Text('SEGURO PRIVADO'),
                ),
                DropdownMenuItem(
                  value: 'sin',
                  child: Text('SIN SEGURO'),
                ),
              ],
              onChanged: (value) {
                if (value == null) return;
                setState(() {
                  seguro_medico = value;
                });
              },
            ),
//*************************************************** */
            TextField(
              decoration: const InputDecoration(
                labelText: 'Peso (kg)',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {
                weightText = value;
              },
            ),

            const SizedBox(height: 16),

            TextField(
              decoration: const InputDecoration(
                labelText: 'Dosis (mg/kg)',
                border: OutlineInputBorder(),
              ),
              keyboardType: TextInputType.number,
              onChanged: (value) {
                dosePerKgText = value;
              },
            ),

            const SizedBox(height: 16),
            ElevatedButton(
              onPressed: calculateDose,
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
