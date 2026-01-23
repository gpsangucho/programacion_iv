function if_(num1,num2 = 10){
    let plan = (num1 > num2); // Defino valor booleano tras comparación
    if(plan){
        console.log(`Valor #1 "${num1}",es mayor a valor #2 "${num2}}"`)
    } else{
        console.log(`Valor #1 "${num1}",es MENOR a valor #2 "${num2}}"`)
    }
}


if_(2)
if_(5)
if_(20)
if_(4,3)


