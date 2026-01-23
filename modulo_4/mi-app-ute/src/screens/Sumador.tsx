import React, { useState, useMemo } from 'react';
import { View, Text, TextInput, Button, StyleSheet } from 'react-native';

export function Sumador() {
  const [num1Text, setNum1Text] = useState<string>('');
  const [num2Text, setNum2Text] = useState<string>('');
  const [calcular, setCalcular] = useState<number>(0); // disparador

  const num1 = Number(num1Text);
  const num2 = Number(num2Text);

  const resultado = useMemo(() => {
    console.log('Calculando suma...');
    if (isNaN(num1) || isNaN(num2)) {
      return 0;
    }
    return num1 + num2;
  }, [calcular]); // 👈 SOLO cuando se presiona el botón

  return (
    <View style={styles.container}>
      <TextInput
        style={styles.input}
        placeholder="Número 1"
        keyboardType="numeric"
        value={num1Text}
        onChangeText={setNum1Text}
      />

      <TextInput
        style={styles.input}
        placeholder="Número 2"
        keyboardType="numeric"
        value={num2Text}
        onChangeText={setNum2Text}
      />

      <Button
        title="Calcular"
        onPress={() => setCalcular(c => c + 1)}
      />

      <Text style={styles.text}>Resultado: {resultado}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    padding: 16,
  },
  input: {
    borderWidth: 1,
    borderColor: '#999',
    padding: 8,
    marginBottom: 12,
  },
  text: {
    fontSize: 18,
    marginTop: 16,
  },
});
