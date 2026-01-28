import { useState } from "react";

function CheckBox() {
  const [activo, setActivo] = useState(false);

  return (
    <label>
      <input
        type="checkbox"
        checked={activo}
        onChange={() => setActivo(!activo)}
      />
      Aceptar términos
    </label>
  );
}
