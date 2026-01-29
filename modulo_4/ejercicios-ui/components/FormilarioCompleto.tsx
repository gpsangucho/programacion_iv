//Ejemplo simple con form, input, select, checkbox y lista:

import { useState } from "react";

function FormularioCompleto() {
  const [nombre, setNombre] = useState("");
  const [pais, setPais] = useState("");
  const [acepta, setAcepta] = useState(false);

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log({ nombre, pais, acepta });
  };

  return (
    <form onSubmit={handleSubmit}>
      <h3>Formulario</h3>

      <input
        type="text"
        placeholder="Nombre"
        value={nombre}
        onChange={(e) => setNombre(e.target.value)}
      />

      <br /><br />

      <select value={pais} onChange={(e) => setPais(e.target.value)}>
        <option value="">Selecciona país</option>
        <option value="mx">México</option>
        <option value="ar">Argentina</option>
        <option value="es">España</option>
      </select>

      <br /><br />

      <label>
        <input
          type="checkbox"
          checked={acepta}
          onChange={() => setAcepta(!acepta)}
        />
        Acepto términos
      </label>

      <br /><br />

      <button type="submit">Enviar</button>

      <hr />

      <ul>
        <li>Nombre: {nombre}</li>
        <li>País: {pais}</li>
        <li>Acepta términos: {acepta ? "Sí" : "No"}</li>
      </ul>
    </form>
  );
}

export default FormularioCompleto;
