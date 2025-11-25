import 'package:flutter/material.dart';
import '../../core/theme/theme_controller.dart';
import 'package:go_router/go_router.dart';

class HomePage extends StatelessWidget {
  final ThemeController theme;
  const HomePage({super.key, required this.theme});

  @override
  Widget build(BuildContext context) {
    final items = List.generate(5, (i) => i + 1);  //mGenero lista de numeros

    return Scaffold(
      appBar: AppBar(
        title: const Text('Inicio'),
        actions: [
          IconButton(
            tooltip: 'Cambiar el tema',
            onPressed: theme.toggle,
            icon: const Icon(Icons.brightness_6),
          ),
        ],
      ),

      // ***** listView: LISTA DE ITEMS
      body: ListView.separated(
        padding: const EdgeInsets.all(16),
        itemCount: items.length,         // Número de items a contruir
        separatorBuilder: (_, __) => const SizedBox(height: 8),
        itemBuilder: (_, i) {
          final id = items[i];
          return Card(        // Cada item que retorna contendrá un CARD
            child: ListTile(  // Cada CARD tendrá una fila lista para usar
              title: Text('Historial Clínico: #$id'),
              subtitle: const Text('CLic para ver Historial'),
              trailing: const Icon(Icons.chevron_right),
              onTap: () => context.go('/detail/$id'),
            ),
          );
        },
      ),
    );
  }
}

/**
LISTA DE ITEMS SCROLLABLE. Items = Tarjetas, botones, cuadro de textos, ETC
ListView
 ├── item 0 → Card(...)
 ├── item 1 → ListTile(...)
 ├── item 2 → Text(...)
 ├── item 3 → Row(...)
 └── item 4 → Container(...)
 
  */
/** ListTile: FILA LISTA PARA USAR

🔍 Estructura:

[ leading ]   title
              subtitle
        trailing

- leading → icono/avatar a la izquierda
- title → texto principal
- subtitle → texto secundario
- trailing → icono a la derecha
- onTap → función al tocar la fila

ListTile(
  title: Text('Producto'),
  subtitle: Text('Haz tap para más detalles'),
  leading: Icon(Icons.shopping_cart),
  trailing: Icon(Icons.chevron_right),
  onTap: () {
    print('Tocaste el item');
  },
)

ListTile es perfecto cuando quieres:
* mostrar listas de elementos simples
* hacer menús de opciones
* listas con navegación
* listas con iconos izquierda/derecha
* listas con avatar e información
 */