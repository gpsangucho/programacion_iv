import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';

import Saludo from "./src/components/Saludo";
import SaludoProps from "./src/components/SaludoProps";
import Contador from "./src/components/contador";
import Caja from "./src/components/Caja";
import Perfil from "./src/components/Perfil";

export default function App() {
  return (
    <View style={{ flex: 1, justifyContent: "center", alignItems: "center", backgroundColor: "#0d1117" }}>
      <Saludo />
    
      <SaludoProps nombre="Francisco" />
      <Contador/>
      <Caja/>
      <Perfil/>
    </View>
    
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
