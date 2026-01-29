// Lista (map)

function Lista() {
  const frutas = ["Manzana", "Banana", "Naranja"];

  return (
    <ul>
      {frutas.map((fruta, index) => (
        <li key={index}>{fruta}</li>
      ))}
    </ul>
  );
}
