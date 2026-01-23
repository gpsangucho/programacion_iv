import { View, Text, StyleSheet, SafeAreaView } from "react-native";

type Props = {
  children: React.ReactNode;
};

export function MainLayout({ children }: Props) {
  return (
    <SafeAreaView style={styles.safe}>
      <View style={styles.container}>
        {/* Header fijo */}
        <View style={styles.header}>
          <Text style={styles.title}>Mi App</Text>
        </View>

        {/* Contenido dinámico */}
        <View style={styles.content}>{children}</View>

        {/* Footer fijo */}
        <View style={styles.footer}>
          <Text>© 2026</Text>
        </View>
      </View>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  safe: {
    flex: 1,
    backgroundColor: "#0d1117",
  },
  container: {
    flex: 1,
  },
  header: {
    height: 60,
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "#161b22",
  },
  title: {
    color: "#58a6ff",
    fontWeight: "bold",
  },
  content: {
    flex: 1,
    padding: 16,
  },
  footer: {
    height: 40,
    alignItems: "center",
    justifyContent: "center",
    backgroundColor: "#161b22",
  },
});
