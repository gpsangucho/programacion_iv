import { createNativeStackNavigator } from "@react-navigation/native-stack";
import type { RootStackParamList } from "@/navigation/types";
import { HomeScreen } from "@/screens/HomeScreen";
import { DetailsScreen } from "@/screens/DetailsScreen";

import { Displayname } from "@/screens/Displayname";
import { LoginFormScreen } from "@/screens/LoginFormScreen";
import { ProductsListScreen } from "@/screens/ProductsListScreen";
import { ProfileScreen } from "@/screens/ProfileScreen";
import { SettingsScreen } from "@/screens/SettingsScreen";
//import { AreaFormScreen } from "@/screens/AreaFormScreen";

const Stack = createNativeStackNavigator<RootStackParamList>();

export function AppNavigator() {
  return (
    <Stack.Navigator
      screenOptions={{
        headerStyle: { backgroundColor: "#0d1117" },
        headerTintColor: "#58a6ff",
        headerTitleStyle: { fontWeight: "900" },
        contentStyle: { backgroundColor: "#0d1117" },
      }}
    >
      <Stack.Screen name="Home" component={HomeScreen} options={{ title: "Inicio" }} />
      <Stack.Screen name="Details" component={DetailsScreen} options={{ title: "Detalles" }} />

      <Stack.Screen name="Settings" component={SettingsScreen} options={{ title: "Settings" }} />
      <Stack.Screen name="LoginForm" component={LoginFormScreen} options={{ title: "Login Form" }} />

      <Stack.Screen name="Products" component={ProductsListScreen} options={{ title: "Productos" }} />
      
      <Stack.Screen
      name="Profile"
      component={ProfileScreen}
      options={{ title: "Perfil" }}
      />

    <Stack.Screen
      name="Displayname"
      component={Displayname}
      options={{ title: "Displayname" }}
    />

    </Stack.Navigator>
  );
}