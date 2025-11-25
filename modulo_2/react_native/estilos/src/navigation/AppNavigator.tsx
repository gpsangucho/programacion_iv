import React from "react";
import { NavigationContainer } from "@react-navigation/native";
import { createNativeStackNavigator } from "@react-navigation/native-stack";
import TaskListScreen from "../features/tasks/screens/TaskListScreen";
import TaskDetailScreen from "../features/tasks/screens/TaskDetailScreen";
import { RootStackParamList } from "./types";
import colors from "../theme/colors";
import UsersListScreen from "../features/users/screens/UsersListScreen";
import UserDetailScreen from "../features/users/screens/UsersDetailScreen";

const Stack = createNativeStackNavigator<RootStackParamList>();

export default function AppNavigator() {
  return (
    <NavigationContainer>
      <Stack.Navigator
        screenOptions={{
          headerStyle: { backgroundColor: "#161b22" },
          headerTintColor: colors.primary,
          contentStyle: { backgroundColor: colors.background },
        }}
      >
        <Stack.Screen name="Users" component={UsersListScreen} options={{ title: "Usuarios" }} />
        <Stack.Screen name="UserDetail" component={UserDetailScreen} options={{ title: "Detalle" }} />

      </Stack.Navigator>
    </NavigationContainer>
  );
}