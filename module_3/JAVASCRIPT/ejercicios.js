/* Dado un arreglo de distancias del lado de un hexágono, calcular el diámetro y clasificarlo
# entre grande (>200), mediano(entre 100 y 200), pequeño (menor a 100).
# Presentación [{id:1, diámetro: 82, tamaño: grande}]
*/
let a = [20,15,70,80,9,89];

function registro(aristas){
    const arry = [];
    
    for(i=0;i < aristas.length;i++){
        const reg = {};
        //console.log(reg);
        reg.id = i + 1; 
        reg.perimetro=6*aristas[i];
        if(6*aristas[i]>=200){
            reg.tamano="GRANDE";
        }else if(6*aristas[i]>100 && 6*aristas[i]<200){
            reg.tamano="Mediano";
        }else{
            reg.tamano = "Pequeño";
        }
        arry.push(reg);
        //console.log(reg);
        //No funciona: Object.keys(reg).forEach(key => delete reg[key]); // borra la misma ubicación
        //console.log(arry);
    };

    return arry;
}

console.log(registro(a));

//======================================================
// COn reduce:

function regis(aristas){
    return 
}

