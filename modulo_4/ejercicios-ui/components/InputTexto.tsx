//Input de texto (input)

import { useState } from "react";

function InputTexto() {
  const [nombre, setNombre] = useState("");

  return (
    <input
      type="text"
      value={nombre}
      onChange={(e) => setNombre(e.target.value)}
      placeholder="Escribe tu nombre"
    />
  );
}