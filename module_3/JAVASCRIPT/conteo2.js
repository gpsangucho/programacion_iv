const productos = [
    {nombre: "Laptop", categoria:"tech"},
    {nombre: "Maouse", categoria:"tech"},
    {nombre: "Camisa", categoria:"ropa"},
    {nombre: "Pantalón", categoria:"ropa"}
];

function agruparPorCategoria(productos){
    return productos.reduce((acc,prod) => {
        const cat = prod.categoria;
        if (!acc[cat]){
            acc[cat]=[];
        }
        acc[cat].push(prod.nombre);
        return acc;
        }, {});
}

console.log(agruparPorCategoria(productos));

// otra opción con for: creo un objeto y recorro uno a uno el arreglo, recupero la categoria
// y voy armando un objeto de clave:[] . categoria: array_de_productos
function agruparPorCategoria(productos) {
    let acc = {};

    for (let prod of productos) {
        const cat = prod.categoria;

        if (!acc[cat]) {
            acc[cat] = [];
        }

        acc[cat].push(prod.nombre);
    }

    return acc;
}