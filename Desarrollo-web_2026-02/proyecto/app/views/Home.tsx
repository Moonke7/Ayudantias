import { useState } from "react";
import "./Home.css";

const data = [
  {
    nombre: "aabbccdd",
    desc: "desc 1",
    precio: 1000,
  },
  {
    nombre: "aaaabb",
    desc: "desc 2",
    precio: 2000,
  },
  {
    nombre: "aaaaa 3",
    desc: "desc 3",
    precio: 3000,
  },
  {
    nombre: "producto 4",
    desc: "desc 4",
    precio: 4000,
  },
  {
    nombre: "producto 5",
    desc: "desc 5",
    precio: 5000,
  },
];

export default function Home() {
  const [dataFiltrada, setDataFiltrada] = useState(data);
  const [filter, setFilter] = useState("");

  const handleFilter = (filtro: string) => {
    const newData = data.filter((item) => {
      return item.nombre.includes(filtro);
    });

    setFilter(filtro);
    setDataFiltrada(newData);
  };

  return (
    <>
      <h1>hola mundo pagina main</h1>
      <h2>hola subtitulo</h2>

      <input
        type="text"
        placeholder="Ingresa el producto buscado"
        value={filter}
        onChange={(e) => handleFilter(e.target.value)}
      />

      <div className="item-container">
        {dataFiltrada.map((item) => {
          return (
            <>
              <div>
                <h5>{item.nombre}</h5>
                <h6>{item.desc}</h6>
                <p>{item.precio}</p>
              </div>
            </>
          );
        })}
      </div>
    </>
  );
}
