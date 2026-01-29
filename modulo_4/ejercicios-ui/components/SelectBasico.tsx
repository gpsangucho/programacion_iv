//Select / Lista desplegable (select)

import { useState } from "react";

function SelectBasico() {
  const [pais, setPais] = useState("");

  return (
    <select value={pais} onChange={(e) => setPais(e.target.value)}>
      <option value="">Selecciona un país</option>
      <option value="mx">México</option>
      <option value="ar">Argentina</option>
      <option value="es">España</option>
    </select>
  );
}
