// Dado un arreglo de string en formato ""
// 
const logs = [
    "2025-01-01 error",
    "2025-01-01 ok",
    "2025-01-01 error",
    "2025-01-02 ok",
    "2025-01-02 ok",
];

function resumirLogs(logs) {
    const resumen = {}; // objeto

    for (const linea of logs) {
        const [fecha,estado] = linea.split(" ");

        if(!resumen[fecha]) {
            resumen[fecha] = {ok:0, error: 0};
        }

        if(estado === "ok"){
            resumen[fecha].ok++;
        }else if (estado === "error"){
            resumen[fecha].error++;
        }
    }
    return resumen;
}