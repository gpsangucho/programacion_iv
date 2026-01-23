// Declaración de variables

let dato = "carga";
let dato2 = 345.6;
const pi = 3.25;
let estado = true;
let estado2 = false;
let estado3= undefined;
let permiso = null;

let array1 = [1,2,4,6,7];
let array2 = ["Caratuu", "pepa", "manzana"]
let objeto1 = {nombre: "Carlos"}
let valor = "123.3"


const arrayObj = [
    {primero: "Uno"},
    {segundo: "Dos"},
    {tercero: "tres"}
]
console.log("Dato String: ", dato);
console.log("Dato float:", dato2);
console.log("Constante: ",pi);
console.log("Arreglo de enteros: ", array1);
console.log("Arreglo de string: ",array2)
console.log("Objeto:", objeto1);

console.log("Objeto segundo: ", arrayObj[1]);
console.log("Nombre de Objeto: ", objeto1.nombre);


// CONVERSION DE TIPOS DE DATOS
let numero = Number(valor);
console.log("Número: ", numero);
console.log(typeof numero);
console.log(typeof valor);

let estadoMayor = String(estado);
console.log("Estado Mayor: ", estadoMayor)
console.log(typeof estadoMayor);
console.log("Estado: ", estado);
console.log(typeof estado);

