//===========================================================
let cadena = "La sombra de mi beneficio";
cadena1 = cadena.split(""); //Dividir en array de caracteres
console.log(cadena1);

//===========================================================

function cadenaf(age){
    let message = (age < 3) ? '¡Hola, bebé!' :
    (age < 18) ? '¡Hola!' :
    (age < 100) ? '¡Felicidades!' :
    '¡Qué edad tan inusual!';
    return message;
}

console.log(cadenaf(1))
console.log(cadenaf(12))
console.log(cadenaf(20))
console.log(cadenaf(200))

//===========================================================


