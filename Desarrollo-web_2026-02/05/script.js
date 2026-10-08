const boton = document.getElementById("hola");
const container = document.querySelector("section");
const e = document.getElementById("elementoEscondido");

boton.addEventListener("click", () => {
  e.classList.toggle("hidden");
});
