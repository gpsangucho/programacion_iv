import { StatusBar } from "expo-status-bar";
import { Parte06Lab } from "./src/screens/Parte06Lab";
import { Parte07Lab } from "@/screens/Parte07Lab";
import { Parte08Lab } from "@/screens/Parte08Lab";
import { Parte09Lab } from "@/screens/Parte09Lab";
import { Parte12Lab } from "@/screens/Parte12Lab";
import { AppNavigator } from "@/navigation/AppNavigator";
import { NavigationContainer } from "@react-navigation/native";

export default function App() {
  return (


    <NavigationContainer>
      <AppNavigator />
      <StatusBar style="light" />
    </NavigationContainer>

  );
}