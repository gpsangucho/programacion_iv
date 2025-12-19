
const facturas = [
    {
        id: 1,
        items: [
            {precio: 10, cantidad: 2},
            {precio: 5, cantidad: 4}
        ]
    },
    {    id: 2,
        items: [
            {precio: 100, cantidad: 1},
            {precio: 20, cantidad: 3}
        ]
    }
]



function facturar(facts){
    let total = 0;

    for (let i = 0; i < facts.length;i++){
        ide = facts[i].id
        for(let j = 0;j < facts[i].items.length;j++){
            total += facts[i].items[j].precio*facts[i].items[j].cantidad;
        }

    }
}

console.log(facturar(facturas))
