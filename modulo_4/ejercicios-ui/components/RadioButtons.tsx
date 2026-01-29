import { useState } from "react";

function RadioButtons() {
  const [genero, setGenero] = useState("");

  return (
    <>
      <label>
        <input
          type="radio"
          value="M"
          checked={genero === "M"}
          onChange={(e) => setGenero(e.target.value)}
        />
        Masculino
      </label>

      <label>
        <input
          type="radio"
          value="F"
          checked={genero === "F"}
          onChange={(e) => setGenero(e.target.value)}
        />
        Femenino
      </label>
    </>
  );
}
