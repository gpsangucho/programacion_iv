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