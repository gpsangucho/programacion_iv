import { useState, useMemo, useCallback, useReducer } from "react";
import {View, Text,TextInput} from "react-native";
import { Button } from "react-native";



//Objeto estado:

type State = {
    hours: number;
}
// use reduce, permite realizar varias cosas a la vez
//Objetos donde se lista las diferentes acciones que se va a ejecutar
type Action = 
    |{type:"ADD_HOUR"}
    |{type:"REMOVE_HOUR"}

const initialState : State = {
    hours:0,
}

function reducer(state:State, action: Action){
    switch (action.type){
        case "ADD_HOUR":
            return {hours: state.hours+1};
        case "REMOVE_HOUR":
            return {hours: Math.max(0,state.hours-1)}
    }
}

export default function ServiceHourReducer(){
    const [state,distpach] = useReducer(reducer,initialState);

    return(
        <View style={{padding:16, borderWidth: 1, borderRadius: 8, marginBottom:14}}>
            <Text>
                Horas de trabajo
            </Text>
            <Text>
                Horas actualizadas: {state?.hours}
            </Text>

            <View>
                <Button title="+1 hora" onPress={()=>distpach({type:"ADD_HOUR"})}/>
                <Button title="-1 hora" onPress={()=>distpach({type:"REMOVE_HOUR"})}/> 
            </View>

        </View>
    )
}