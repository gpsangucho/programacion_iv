export type Product = {
    id: string;
    name: string;
    price: number;
    marca: string;
    descripcion: string;
  };
  
  export const PRODUCTS: Product[] = [
    { id: "p1", name: "Mouse", price: 12, marca:"1", descripcion: "d1" },
    { id: "p2", name: "Keyboard", price: 25, marca:"2", descripcion: "d1" },
    { id: "p3", name: "Monitor", price: 180, marca:"3", descripcion: "d1" },
    { id: "p4", name: "Laptop Stand", price: 30, marca:"4", descripcion: "d1" },
    { id: "p5", name: "Headset", price: 45, marca:"5", descripcion: "d1" },
  ];