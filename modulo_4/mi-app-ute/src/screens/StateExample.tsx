// ===== EN TypeScriptDemo.tsx AGREGA ESTE COMPONENTE =====

// Importa los tipos primero
import React from 'react';
import { LoadState, ProductDTO, successState } from '../types';
import { ActivityIndicator, View } from 'react-native';
import AppButton from '../components/AppButton';

// Dentro del componente TypeScriptDemo, agrega:

function StateExample() {
const [state, setState] = React.useState<LoadState<ProductDTO[]>>(successState);

const renderContent = () => {
  // TypeScript INFIERE el tipo exacto basado en 'type'
  switch (state.type) {
    case "idle":
      return <Text style={styles.value}>Presiona cargar para comenzar</Text>;
      
    case "loading":
      return (
        <View style={{ flexDirection: 'row', alignItems: 'center' }}>
          <ActivityIndicator size="small" color="#58a6ff" />
          <Text style={[styles.value, { marginLeft: 10 }]}>Cargando productos...</Text>
        </View>
      );
      
    case "success":
      return (
        <View>
          <Text style={styles.value}>✓ {state.data.length} productos cargados</Text>
          {state.data.map(product => (
            <View key={product.id} style={styles.productItem}>
              <Text style={styles.value}>{product.name}</Text>
              <Text style={styles.label}>${product.price.toFixed(2)}</Text>
            </View>
          ))}
        </View>
      );
      
    case "error":
      return (
        <View>
          <Text style={[styles.value, styles.error]}>✗ {state.message}</Text>
          {state.code && (
            <Text style={styles.label}>Código: {state.code}</Text>
          )}
        </View>
      );
      
    default:
      // TypeScript asegura que cubrimos todos los casos
      const _exhaustiveCheck: never = state;
      return null;
  }
};

return (
  <View style={styles.section}>
    <Text style={styles.sectionTitle}>5. Union Types para Estado</Text>
    <View style={styles.card}>
      {renderContent()}
    </View>
    
    <View style={{ flexDirection: 'row', justifyContent: 'space-between', marginTop: 10 }}>
      <AppButton
        title="Idle"
        onPress={() => setState({ type: "idle" })}
        variant="outline"
        style={{ flex: 1, marginRight: 5 }}
      />
      <AppButton
        title="Loading"
        onPress={() => setState({ type: "loading" })}
        variant="outline"
        style={{ flex: 1, marginHorizontal: 5 }}
      />
      <AppButton
        title="Success"
        onPress={() => setState(successState)}
        variant="outline"
        style={{ flex: 1, marginLeft: 5 }}
      />
    </View>
  </View>
);
}

// Luego en el return principal:
// <StateExample />

// Agrega estos estilos:
const additionalStyles = {
productItem: {
  flexDirection: 'row',
  justifyContent: 'space-between',
  alignItems: 'center',
  paddingVertical: 8,
  borderBottomWidth: 1,
  borderBottomColor: '#30363d',
}
};


const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#0d1117',
    padding: 20,
  },
  title: {
    fontSize: 24,
    fontWeight: 'bold',
    color: '#58a6ff',
    marginBottom: 20,
    textAlign: 'center',
  },
  section: {
    marginBottom: 30,
  },
  sectionTitle: {
    fontSize: 18,
    fontWeight: '600',
    color: '#c9d1d9',
    marginBottom: 10,
    borderLeftWidth: 3,
    borderLeftColor: '#58a6ff',
    paddingLeft: 10,
  },
  card: {
    backgroundColor: '#161b22',
    borderWidth: 1,
    borderColor: '#30363d',
    borderRadius: 8,
    padding: 16,
  },
  label: {
    color: '#8b949e',
    fontSize: 14,
    marginTop: 8,
  },
  value: {
    color: '#c9d1d9',
    fontSize: 16,
    fontWeight: '500',
  },
  success: {
    color: '#3fb950',
  },
  error: {
    color: '#f85149',
  },
  codeComment: {
    color: '#8b949e',
    fontStyle: 'italic',
    fontSize: 12,
    marginTop: 8,
  },
});

export default StateDemo;