

let array = [1,4,7,3,5,"cara", "careta"];

// Contado simple: obtener valores de un arreglo
for(let i=0; i<array.length; i++){
    console.log(array[i]);
}

//Multiples contadores
for (i = 0, j = 5; i < 5; i++, j--) {
  console.log("Valor de i y j:", i, j);
};

//Contador simple: inicio/condición(límite)/incremento o decremento
for(let i = 10; i>-3;i--){
    console.log(i);
}

for(let i = -12; i<5;i=i+3){
    console.log("Cuenta en saltos: ", i);
}

//=================================================
// FUNCIONES

function saludar(persona){
    console.log("Hola!! ", persona);
}

function despedir(persona){
    console.log("Nos vemos al rato ",persona);
}

saludar("Henry")
despedir("Daniela")

function tabla(numero){
    for(i=1;i<=12;i++){
        console.log(numero,"*",i,"=",numero*i)
    }
}

tabla(2);

function tabla_limitada(numero, limite){
    for(let i = 1; i <= limite; i++){
        console.log(numero,"*",i," = ", numero*i);
    }
}

tabla_limitada(2,5);
tabla_limitada(3);

// CON VALOR POR DEFECTO

function tabla_limitada2(numero, limite=3){
    for(let i = 1; i <= limite; i++){
        console.log(numero,"*",i," = ", numero*i);
    }
}

tabla_limitada2(3,5);
tabla_limitada2(5); // parámetro límite toma valor por defecto 3.

//==================================================================
//Recorrer un arreglo
let arreglo = [23,45,"Carambita", "Carambolas", null, undefined,90];
// Por índice
for(index = 0; index < arreglo.length;index++){
    console.log("# ", index,"valor",arreglo[index]);
}
// Por valores
for(valor of arreglo){
    console.log(valor);
}

//==================================================================
// Recorrer un objeto

let objt={
    nombre: "Juana",
    DNI: 12345667890,
    estado: "viuda",
    genero: null,
    sexo: "F",
    instruccion: "Primaria",
    donador: false,
    edad: 44
}

let perro = {
    nombre: "Ruffo",
    edad: 14,
    raza: "pastor alemán"
};

console.log("Edad del Perro ",perro.nombre," es ",perro.edad)
console.log("La señora ", objt.nombre," es de Género ",objt.genero," y sexo ",objt.sexo)
console.log("Sra. ",objt["nombre"]," ",objt["estado"]," de ", objt["edad"]," años." )
// Listar los valores de las propiedades
// Acceder a sus propiedades
for(const clave in perro){
    console.log(clave,": ",perro[clave]);
}

for(const key in objt){
    console.log(key,": ",objt[key]);
}

//Objeto con función

const salvaje = {
    especie: "tigre",
    anuciar(){ return `hola soy un ${this.especie}`;}
}
console.log(salvaje.anuciar());

// Funciones básicas para recuperar en arreglos
let claves = Object.keys(salvaje);
let valores = Object.values(salvaje);
let pares = Object.entries(salvaje);

for(i = 0;i<claves.length;i++){
    console.log("clave",i,": ",claves[i]);
    console.log("valor",i,": ",valores[i]);
    console.log("Par",i,": ",pares[i]);
}

// Objetos anidados

const ciudadano = {
    nombre: "Chep",
    direccion:{
        ciudad: "Pichincha",
        calle: "Av. 10 de Agosto"
    },
    telefono: "022345678"
}

console.log("Ciudadano: ",ciudadano.nombre);
console.log("Ciudad: ",ciudadano.direccion.ciudad)
console.log("Calle",ciudadano.direccion.calle)

for(keys in ciudadano){
    console.log("Clave ",keys,": ",ciudadano[keys]);
}

// COPIA
const ciudadano_1 = {...ciudadano};
console.log("Ciudadano COPIA: ", ciudadano_1.nombre);
console.log("Ciudadano COPIA: ",ciudadano_1.direccion);
console.log("Ciudadano COPIA: ",ciudadano_1.direccion.ciudad);

//
let gato = {
    nombre : "Archi",
    edad : "2",
    "sexo felino": "gatuno",
    dni: 234567,
    "direccion domicilio": {ciudad: "Gye",sector:"malvidas"},
}

delete gato.dni;

for(let key in gato){
  
    console.log(`Item `,key,": ",gato[key]);
    
}

console.log(`Sexo del gato: ${gato["sexo felino"]}`)
console.log(gato["direccion domicilio"])
console.log(`Dirección del gato: ${gato["direccion domicilio"].sector}`)

