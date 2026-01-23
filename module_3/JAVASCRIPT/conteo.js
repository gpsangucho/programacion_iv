// Dado un arreglo de string en formato ""
// Instalación: winget install OpenJS.NodeJS.LTS ,// node -v
// OP2: nvm install lts, // nvm use lts, // nvm -v
// run: node file.js + enter
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
        console.log("Estado",fecha, estado);

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

console.log(resumirLogs(logs))