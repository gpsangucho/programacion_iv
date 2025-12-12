const estudiantes = [
    {nombre: "Ana", notas: [10,8,9]},
    {nombre: "Luis", notas: [7,6,8,9]},
    {nombre: "María", notas: [9,9,10]}
];

function calcularPromedio(estudiantes){
    return estudiantes.map(est => {
        const suma =est.notas.reduce((acc,n) => acc+ n , 0);
        const promedio = suma/ est.notas.length;
        return {nombre:est.nombre,promedio};
    });
}

console.log(calcularPromedio(estudiantes));