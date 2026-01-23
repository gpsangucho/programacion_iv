import { createNativeStackNavigator } from "@react-navigation/native-stack";
import type { RootStackParamList } from "@/navegation/types";
import { HomeScreen } from "@/screens/HomeScreen";
import { DemoScreen } from "@/screens/DemoScreen";
import { MainLayout } from "@/layout/MainLayout";


const Stack = createNativeStackNavigator<RootStackParamList>(); //Enlisto las pantallas y sus parametros requeridos en types

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
      {/*<Stack.Screen name="Demo" component={DemoScreen} options={{ title: "Demo" }} />*/}

      <Stack.Screen name="Demo" options={{ title: "Demo" }}>
        {(props) => (
          <MainLayout>
            <DemoScreen/>
          </MainLayout>
        )}
      </Stack.Screen>

    </Stack.Navigator>
  );
}