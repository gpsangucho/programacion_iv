import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';

//*************CREO LA CLASE************* */
class PromoPage extends StatefulWidget {
  const PromoPage({super.key});

  @override
  State<PromoPage> createState() => _PromoPageState();
}

//**************clase****** */
class _VideoCarouselPageState extends State<VideoCarouselPage> {

//** LOGICA */

//** PANTALLA */

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Paquete de viaje'),
        leading: IconButton(
          icon: const Icon(Icons.arrow_back),
          onPressed: () => context.go('/'),
        ),
      ),

      


    )
  }

}
