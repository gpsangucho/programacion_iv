//controlados vs no controlados
import { useState, useRef } from "react";

function FormularioColores() {
  const [nombre, setNombre] = useState("");
  const [email, setEmail] = useState("");
  const [acepta, setAcepta] = useState(false);

  const apellidoRef = useRef();
  const edadRef = useRef();
  const colorRef = useRef();

  const handleSubmit = (e) => {
    e.preventDefault();
    alert(`Controlados: ${nombre}, ${email}, ${acepta}\nNo controlados: ${apellidoRef.current.value}, ${edadRef.current.value}, ${colorRef.current.value}`);
  };

  return (
    <form onSubmit={handleSubmit}>
      <h3 style={{ color: "green" }}>Controlados 🟢</h3>
      <input type="text" value={nombre} onChange={(e) => setNombre(e.target.value)} style={{ backgroundColor: "#d4f7d4", border: "2px solid green" }} />
      <input type="email" value={email} onChange={(e) => setEmail(e.target.value)} style={{ backgroundColor: "#d4f7d4", border: "2px solid green" }} />
      <label style={{ backgroundColor: "#d4f7d4" }}>
        <input type="checkbox" checked={acepta} onChange={() => setAcepta(!acepta)} /> Acepto
      </label>

      <h3 style={{ color: "blue" }}>No Controlados 🔵</h3>
      <input type="text" ref={apellidoRef} style={{ backgroundColor: "#d4e0f7", border: "2px solid blue" }} />
      <input type="number" ref={edadRef} style={{ backgroundColor: "#d4e0f7", border: "2px solid blue" }} />
      <input type="color" ref={colorRef} style={{ backgroundColor: "#d4e0f7", border: "2px solid blue" }} />

      <button type="submit">Enviar</button>
    </form>
  );
}

export default FormularioColores;
