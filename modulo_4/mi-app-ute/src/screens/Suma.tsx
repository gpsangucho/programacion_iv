import React, { useState, useMemo } from 'react';
import { View, Text, TextInput, Button, StyleSheet } from 'react-native';
import { NativeStackScreenProps } from '@react-navigation/native-stack';
import { RootStackParamList } from '@/navigation/types';

type Props = NativeStackScreenProps<RootStackParamList, 'Suma'>;

export function Suma({ route }: Props) {
  const initialCount: number = route.params?.initialCount || 0;
  const [count, setCount] = useState<number>(initialCount);
  const [text, setText] = useState<string>('');

  const resultado = useMemo(() => {
    console.log('Calculando suma...');
    let total = 0;
    for (let i = 0; i <= count; i++) {
      total += i;
    }
    return total;
  }, [count]);

  return (
    <View style={styles.container}>
      <TextInput
        style={styles.input}
        value={text}
        onChangeText={setText}
        placeholder="Escribe algo..."
      />
      <Button title="Incrementar" onPress={() => setCount(count + 1)} />
      <Text style={styles.text}>Suma: {resultado}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, justifyContent: 'center', alignItems: 'center', padding: 16 },
  input: { width: '80%', borderColor: 'gray', borderWidth: 1, padding: 8, marginBottom: 16 },
  text: { marginTop: 16, fontSize: 18 },
});
