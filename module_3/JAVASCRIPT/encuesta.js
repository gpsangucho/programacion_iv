const clientes = ["Ana","Luis","María","Juan","Pedro"];

function asignarVentanas(clientes, numVentanas = 3){
    const ventanas = Array.from({length: numVentanas}, () => []);

    for (let i = 0; i < clientes.length;i++){
        const indiceVentana = i % numVentanas;
        ventanas[indiceVentana].push(clientes[i]);
    }
    return ventanas;
}

const resultado = asignarVentanas(clientes);
console.log("Ventana1: ", resultado[0]);
console.log("Ventana2: ", resultado[1]);
console.log("Ventana3: ", resultado[2])
