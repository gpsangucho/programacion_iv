import { router } from "expo-router";
import { View, Text, Pressable, StyleSheet } from "react-native";
import { useAuth } from "../../src/features/auth/presentation/authContext";

export default function HomeScreen() {
  const { logout } = useAuth();

  const onLogout = async () => {
    await logout();
    router.replace("/public/login");
  };

  return (
    <View style={styles.container}>
      <Text style={styles.title}>Home</Text>
      <Text style={styles.subtitle}>
        Si llegaste aquí, ya estás autenticado con JWT (token guardado).
      </Text>

      <Pressable style={styles.btn} onPress={onLogout}>
        <Text style={styles.btnText}>Cerrar sesión</Text>
      </Pressable>
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, padding: 20, justifyContent: "center", gap: 12 },
  title: { fontSize: 22, fontWeight: "800" },
  subtitle: { fontSize: 14, opacity: 0.85 },
  btn: {
    marginTop: 10,
    backgroundColor: "#111827",
    borderWidth: 1,
    borderColor: "#30363d",
    padding: 14,
    borderRadius: 10,
    alignItems: "center",
  },
  btnText: { color: "white", fontWeight: "700" },
});
