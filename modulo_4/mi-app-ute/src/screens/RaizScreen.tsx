import { useMemo, useState } from "react";
import {
  KeyboardAvoidingView,
  Platform,
  Pressable,
  StyleSheet,
  Text,
  TextInput,
  View,
} from "react-native";

type Form = {
  numero: string;
};

type Errors = {
  numero?: string;
};

export function RaizScreen() {
  const [form, setForm] = useState<Form>({ numero: "" });
  const [errors, setErrors] = useState<Errors>({});
  const [raiz, setRaiz] = useState<number | null>(null);
  const [cuadrado, setCuadrado] = useState<number | null>(null);
  const [submitted, setSubmitted] = useState(false);

  const bg = "#0d1117";
  const card = "#161b22";
  const border = "#30363d";
  const text = "#c9d1d9";
  const primary = "#58a6ff";
  const danger = "#f85149";

  function validate(value: string): Errors {
    const e: Errors = {};
    const n = Number(value);

    if (value.trim() === "") {
      e.numero = "Ingrese un número";
    } else if (isNaN(n)) {
      e.numero = "Debe ser un número válido";
    } else if (n < 0) {
      e.numero = "No se puede calcular raíz de números negativos";
    }

    return e;
  }

  const isOk = useMemo(() => {
    return Object.keys(validate(form.numero)).length === 0;
  }, [form]);

  function onChange(value: string) {
    setForm({ numero: value });
    if (submitted) {
      setErrors(validate(value));
    }
  }

  function clear() {
    setForm({ numero: "" });
    setErrors({});
    setRaiz(null);
    setCuadrado(null);
    setSubmitted(false);
  }

  function submit() {
    setSubmitted(true);
    const e = validate(form.numero);
    setErrors(e);

    if (Object.keys(e).length > 0) return;

    const n = Number(form.numero);
    setRaiz(Math.sqrt(n));
    setCuadrado(n * n);
  }

  return (
    <KeyboardAvoidingView
      style={{ flex: 1, backgroundColor: bg }}
      behavior={Platform.OS === "ios" ? "padding" : undefined}
    >
      <View style={styles.container}>
        <Text style={[styles.title, { color: primary }]}>
          Raíz Cuadrada
        </Text>

        <View style={[styles.card, { backgroundColor: card, borderColor: border }]}>
          <Text style={[styles.label, { color: text }]}>
            Ingrese un número
          </Text>

          <TextInput
            value={form.numero}
            onChangeText={onChange}
            placeholder="Ej: 16"
            placeholderTextColor="#8b949e"
            keyboardType="numeric"
            style={[
              styles.input,
              {
                backgroundColor: card,
                borderColor: errors.numero ? danger : border,
                color: text,
              },
            ]}
          />

          {errors.numero && (
            <Text style={[styles.error, { color: danger }]}>
              {errors.numero}
            </Text>
          )}

          <Pressable
            style={[
              styles.btn,
              { borderColor: primary, opacity: isOk ? 1 : 0.6 },
            ]}
            onPress={submit}
          >
            <Text style={[styles.btnText, { color: primary }]}>
              Calcular
            </Text>
          </Pressable>

          <Pressable
            style={[styles.btnGhost, { borderColor: border }]}
            onPress={clear}
          >
            <Text style={[styles.btnText, { color: text }]}>
              Limpiar
            </Text>
          </Pressable>

          {raiz !== null && cuadrado !== null && (
            <View style={{ marginTop: 16 }}>
              <Text style={[styles.result, { color: text }]}>
                √{form.numero} ={" "}
                <Text style={{ color: primary }}>
                  {raiz}
                </Text>
              </Text>

              <Text style={[styles.result, { color: text }]}>
                {form.numero}² ={" "}
                <Text style={{ color: primary }}>
                  {cuadrado}
                </Text>
              </Text>
            </View>
          )}
        </View>
      </View>
    </KeyboardAvoidingView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 16,
    justifyContent: "center",
  },
  title: {
    fontWeight: "900",
    fontSize: 22,
    marginBottom: 10,
  },
  card: {
    borderWidth: 1,
    borderRadius: 12,
    padding: 14,
  },
  label: {
    fontWeight: "800",
    marginBottom: 6,
  },
  input: {
    borderWidth: 1,
    borderRadius: 10,
    paddingVertical: 10,
    paddingHorizontal: 12,
  },
  error: {
    marginTop: 6,
    fontWeight: "800",
  },
  btn: {
    marginTop: 14,
    backgroundColor: "#21262d",
    borderWidth: 1,
    borderRadius: 10,
    paddingVertical: 10,
    alignItems: "center",
  },
  btnGhost: {
    marginTop: 10,
    borderWidth: 1,
    borderRadius: 10,
    paddingVertical: 10,
    alignItems: "center",
  },
  btnText: {
    fontWeight: "900",
  },
  result: {
    fontSize: 16,
    fontWeight: "800",
    marginTop: 6,
  },
});


/* Estructura de ingreso
KeyboardAvoidingView
 └── View (container)
     ├── Text (título)
     └── View (card)
         ├── Text (label)
         ├── TextInput
         ├── (error condicional)
         ├── Botón Calcular
         ├── Botón Limpiar
         └── (resultados condicionales)
 */