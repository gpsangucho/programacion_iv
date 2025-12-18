import { StatusBar } from "expo-status-bar";
import { StyleSheet, Text, View } from "react-native";
import TypeScriptDemo from "./src/screens/TypeScripDemo";
import AppButton from "./src/components/AppButton";

export default function App() {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>React Native + TypeScript</Text>
      <Text style={styles.subtitle}>Entorno listo</Text>
      <Text style={styles.letter}>Entorno listo</Text>
      <Text>Entorno listo ✅</Text>
      <TypeScriptDemo/>


      <AppButton
    title="Presionar aquí"
    onPress={() => console.log('Botón presionado!')}
    variant="primary"
    />
  
    <View style={{ height: 10 }} />
    
    <AppButton
      title="Cargando..."
      onPress={() => {}}
      loading={true}
      variant="secondary"
    />
    
    <View style={{ height: 10 }} />
    
    <AppButton
      title="Deshabilitado"
      onPress={() => {}}
      disabled={true}
      variant="outline"
    />




      <StatusBar style="light" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#0d1117",
    alignItems: "center",
    justifyContent: "center",
    padding: 16,
  },
  title: {
    fontSize: 20,
    fontWeight: "600",
    marginBottom: 8,
    color: "#c9d1d9",
  },
  subtitle: {
    fontSize: 18,
    fontWeight: "600",
    marginBottom: 8,
    color: "#F54927",
  },

  letter: {
    fontSize: 12,
    fontWeight: "600",
    marginBottom: 2,
    color: "#F54927",
  },

});