import React, { useState } from "react";
import { StyleSheet, Text, TextInput, View } from "react-native";

import { Switch } from 'react-native';


export default function calcular(){

    const [monto,setMonto]=useState("");
    const [atraso,setAtraso]=useState("");
    //const [clienteFrecuente,setClienteFrencuente]=useState("SI");
    const [switchValue, setSwitchValue] = useState(false);

    const [metodoPago, setMetodoPago] = useState("")


    const montoNumber = Number(monto);
    const atrasoNumber = Number(atraso);

    const toggleSwitch = (value:boolean) => {
        //To handle switch toggle
        setSwitchValue(value);
        //State changes according to switch
      };

    return(
        <view>
            
            <View style={styles.card}>
                <Text style={styles.label}>Monto base</Text>
                <TextInput value={monto} onChangeText={setMonto} keyboardType="numeric" style={styles.input} />
            
                <Text style={styles.label}>Retraso (meses)</Text>
                <TextInput value={atraso} onChangeText={setAtraso} keyboardType="numeric" style={styles.input} />
            
                <Switch
                style={{marginTop: 30}}
                onValueChange={toggleSwitch}
                value={switchValue}
                />
            
                <Text style={styles.label}>Descuento (%)</Text>
                <TextInput value={metodoPago} onChangeText={setMetodoPago} keyboardType="numeric" style={styles.input} />
            </View>

        </view>
    );
}



const styles = StyleSheet.create({
    container: { flex: 1, padding: 16, backgroundColor: "#f6f7fb" },
    title: { fontSize: 22, fontWeight: "900" },
    subtitle: { marginTop: 4, color: "#555", fontWeight: "700" },
    card: {
      backgroundColor: "white",
      padding: 14,
      borderRadius: 14,
      borderWidth: 1,
      borderColor: "rgba(0,0,0,.10)",
      marginTop: 12,
    },
    label: { marginTop: 8, color: "#666", fontWeight: "800" },
    input: {
      marginTop: 6,
      backgroundColor: "#fff",
      paddingHorizontal: 12,
      paddingVertical: 10,
      borderRadius: 12,
      borderWidth: 1,
      borderColor: "rgba(0,0,0,.10)",
    },
    rline: { fontWeight: "800", marginTop: 6 },
    total: { fontWeight: "900", marginTop: 10, fontSize: 18 },
  });