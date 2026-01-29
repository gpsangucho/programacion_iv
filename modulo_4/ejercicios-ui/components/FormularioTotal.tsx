import { useState } from "react";

function FormularioTotal() {
  const [data, setData] = useState({
    nombre: "",
    email: "",
    edad: 18,
    mensaje: "",
    pais: "",
    acepta: false,
    genero: "",
    color: "#000000",
    nivel: 50
  });

  const handleChange = (e) => {
    const { name, value, type, checked } = e.target;
    setData({
      ...data,
      [name]: type === "checkbox" ? checked : value
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(data);
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Formulario completo</h2>

      <input name="nombre" placeholder="Nombre" onChange={handleChange} />
      <input name="email" type="email" placeholder="Email" onChange={handleChange} />
      <input name="edad" type="number" onChange={handleChange} />

      <textarea name="mensaje" placeholder="Mensaje" onChange={handleChange} />

      <select name="pais" onChange={handleChange}>
        <option value="">País</option>
        <option value="mx">México</option>
        <option value="ar">Argentina</option>
      </select>

      <label>
        <input
          type="checkbox"
          name="acepta"
          checked={data.acepta}
          onChange={handleChange}
        />
        Acepto términos
      </label>

      <fieldset>
        <legend>Género</legend>
        <input type="radio" name="genero" value="M" onChange={handleChange} /> M
        <input type="radio" name="genero" value="F" onChange={handleChange} /> F
      </fieldset>

      <input type="color" name="color" onChange={handleChange} />
      <input type="range" name="nivel" min="0" max="100" onChange={handleChange} />

      <progress value={data.nivel} max="100" />

      <button type="submit">Enviar</button>
    </form>
  );
}

export default FormularioTotal;
