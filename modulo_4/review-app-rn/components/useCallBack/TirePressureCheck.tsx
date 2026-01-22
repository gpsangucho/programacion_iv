import { useState, useMemo, useCallback } from "react";
import {View, Text,TextInput} from "react-native";
import { Button } from "react-native";

export default function TirePressureCheck(){
    const [currentPsi,setCurrentPsi]=useState(0);
    const [tire, setTire] = useState('delantera');
    const [needPsi,setNeedPsi] = useState(0);
    const IDEAL=32;

    // Callback: almacena una funciòn
    const calculate = useCallback(()=>{
        const missing = Math.max(0,IDEAL-currentPsi);
        setNeedPsi(missing);
    },[currentPsi,tire])

    return(
        <View style={{padding:16, borderWidth: 1, borderRadius: 8, marginBottom:14}}>
            <Text>
                Presión de la llanta
            </Text>
            <TextInput
                placeholder="delantera/trasera"
                onChangeText={setTire}
                style={{
                    borderWidth:1,
                    padding:10,
                    marginTop:10,
                }}
            />

            <TextInput
                    keyboardType="numeric"
                    placeholder="Presiòn actuañ"
                    onChangeText={(v) => setCurrentPsi(Number(v)||0)}
                    style={{
                        borderWidth:1,
                        padding:10,
                        marginTop:10,
                }}
            />

            <View>
                <Button title="Calcular faltante" onPress={calculate}/> 
            </View>
            <Text>
                PSI faltante para {tire}: {" "}
                 <Text style={{fontWeight:"700"}}>{needPsi||"------"}</Text>
            </Text>
        </View>
    )
}