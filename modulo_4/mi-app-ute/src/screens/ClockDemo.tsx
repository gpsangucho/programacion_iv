import { useEffect, useState } from "react";
import { StyleSheet, Text, View } from "react-native";

export function ClockDemo() {
  const [dateTime, setDataTime] = useState<Date>(new Date());

  useEffect(() => {
    const id = setInterval(() => {
      setDataTime(new Date());
    }, 1000);

    return () => {
      clearInterval(id);
    };
  }, []);

  return (
    <View style={styles.container}>
      <Text style={styles.value}>{dateTime.toISOString()}</Text>
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
  value: {
    color: "#58a6ff",
    fontSize: 28,
    fontWeight: "900",
  },
});