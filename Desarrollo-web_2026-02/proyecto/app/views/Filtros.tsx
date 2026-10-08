import "styles/filtros.css";

const data = [
  {
    nombre: "producto 1",
    desc: "desc 1",
    precio: 1000,
  },
  {
    nombre: "producto 2",
    desc: "desc 2",
    precio: 2000,
  },
  {
    nombre: "producto 3",
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

export default function Filtros() {
  return (
    <>
      <h1>Filtros</h1>
      <button>filtrar</button>
    </>
  );
}
