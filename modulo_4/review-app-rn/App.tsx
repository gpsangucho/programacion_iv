import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import ServiceCostMemo from './components/usememo/ServiceCostMemo';
import OilCostCalculator from './components/OilCostCalculator';
import FuelConsumptionMemo from './components/usememo/FuelConsumptionMemo';
import TirePressureCheck from './components/useCallBack/TirePressureCheck';
import ServiceHourReducer from './components/useReducer/ServiceHourReducer';
import ServiceNote from './components/ServiceNote';

export default function App() {
  return (
    <View style={styles.container}>
      
      <ServiceNote/>
      <ServiceCostMemo/>
      <FuelConsumptionMemo/>
      <TirePressureCheck/>
      <ServiceHourReducer/>
      
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
