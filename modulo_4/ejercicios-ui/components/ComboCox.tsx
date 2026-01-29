//Combobox (input + datalist)

function ComboBox() {
  return (
    <>
      <input list="lenguajes" placeholder="Elige un lenguaje" />
      <datalist id="lenguajes">
        <option value="JavaScript" />
        <option value="Python" />
        <option value="Java" />
        <option value="C#" />
      </datalist>
    </>
  );
}