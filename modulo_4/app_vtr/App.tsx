import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

import { NavigationContainer } from "@react-navigation/native";
import { AppNavigator } from "./src/navegation/AppNavigator";

export default function App() {
  return (

    <NavigationContainer>
      <AppNavigator />
      <StatusBar style="auto" />
    </NavigationContainer>

  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});


    /* PLANTILLA DE PRUEBA AL INICIAR EL PROYECTO
    <View style={styles.container}>
      <Text>Esta es una app</Text>
      <StatusBar style="auto" />
    </View>
    */