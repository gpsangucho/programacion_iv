/**
BOTON:

ElevatedButton(
  onPressed: () {},
  child: Text("Botón"),  
)

Atributos:

ElevatedButton(
  onPressed: () {},             <-- Función que se ejecuta al presionar el botón: onPressed: () { print("click"); },
  onLongPress: () {},           <-- Acción que ocurre al mantener presionado: onLongPress: () { print("click largo"); },
  child: Text("Botón"),         <-- El contenido del botón: texto, ícono, fila, etc: child: Text("Aceptar"),
  style: ElevatedButton.styleFrom(  <--Estilo
    backgroundColor: Colors.blue,   <-- Color de fondo
    foregroundColor: Colors.white,  <-- Color del texto/ícono
    elevation: 4,                   <-- Sombra del botón
    padding: EdgeInsets.all(12),    <-- Tamaño interno                       
    minimumSize: Size(150, 40),     <-- Tamaño mínimo
    maximumSize:    ,               <-- Tamaño máximo
    shape: RoundedRectangleBorder(  <-- Forma del botón
      borderRadius: BorderRadius.circular(12),  <--
    ),
    side: ,                         <-- Borde
    textStyle: ,                    <-- Estilo del texto
    alignment: ,                    <-- Alineación del contenido  
    autofocus: true,                <-- Enfoca al botón autpmáticamente al cargar la pantalla
  ),
)

EJEMPLO DE BOTON:
FilledButton.tonal(
    onPressed: () => setState(() => count1 = (count1 - 1).clamp(0, 999999)),
    child: Icon(Icons.remove),//const Text('-1'),
),
 */

/**
// TEXTO
Text('$count1', style: const TextStyle(fontSize: 56, fontWeight: FontWeight.w800)),

// ESPACIO
const SizedBox(height: 16),

// COMBO BOX

String valor = "op1";
                    DropdownButton<String>(
                      value: valor1,  // Valor seleccionado

                      items: const [
                        DropdownMenuItem(value: "op1", child: Text("op1")),
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
                            
 */