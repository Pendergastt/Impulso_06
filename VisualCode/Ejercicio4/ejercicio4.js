//1.- creo una etiqueta p
let textito= prompt("inserta algo");

let etiqueta = document.createElement("p");

//2.- creamos el NODO de texto con hola
let contenido = document.createTextNode(textito);

//3.- añadimos "hola" a "p"
etiqueta.appendChild(contenido);

document.getElementById("div1").appendChild(etiqueta);