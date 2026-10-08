import { useState } from "react";

interface Data {
  nombre: string;
  desc: string;
  precio: number;
}

const data: Data[] = [
  {
    nombre: "nombre1",
    desc: "descripcion 1",
    precio: 10000,
  },
  {
    nombre: "nombre2",
    desc: "descripcion 2",
    precio: 20000,
  },
  {
    nombre: "nombre3",
    desc: "descripcion 3",
    precio: 30000,
  },
];

export default function () {
  const [dataFiltrada, setDataFiltrada] = useState<Data[]>(data);
  const [filter, setFilter] = useState<string>();

  const handleFilter = (filtro: string) => {
    setFilter(filtro);

    const newData = data.filter((item) => {
      return item.nombre.includes(filtro);
    });

    console.log("Data filtrada:", dataFiltrada);

    setDataFiltrada(newData);
  };

  return (
    <div>
      <h1>hola vista 1</h1>
      <h2>hola vista 2</h2>

      <input
        type="text"
        placeholder="ingresa filtro"
        value={filter}
        onChange={(e) => handleFilter(e.target.value)}
      />

      {dataFiltrada.length >= 1 &&
        dataFiltrada.map((item: Data, index) => {
          return (
            <>
              <div key={index}>
                <h4>{item.nombre}</h4>
                <h5>{item.desc}</h5>
                <p>{item.precio}</p>
              </div>
            </>
          );
        })}
    </div>
  );
}
