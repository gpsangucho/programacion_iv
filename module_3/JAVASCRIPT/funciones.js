// FUNCION
function tabla(m,n=12){
    for(let i = 1;i<=n;i++){
        console.log(`${m}*${i}=${m*i}`)
    };
}

tabla(3)
tabla(4,5)

//FUNCION FLECHA
let tab = (n,m=12)=> {for(i=1;i<=m;i++){console.log(`${n}x${i}=${n*i}`);}}
tab(6)

let chat = () => console.log("Hola");
chat();

// Creacion dinámica de funciones
let age = 25;
let welcome = (age < 18) ?
  () => console.log('¡Hola!',age) :
  () => console.log("¡Saludos!",age);

welcome();