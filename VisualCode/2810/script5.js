let n=0 // numero de veces que se repite a
let cadenaUsuario = prompt("Introduce una frase un poco larga");

let separada = cadenaUsuario.split(" ");
let resultado ="Aquí está tu respuesta: ";
for (i=0;i<=separada.length;i+2){
    for (a of separada[i]){
        a == "a" ? n++:n
    }

    resultado=resultado+`en la palabra ${separada[i]} hay ${n} aes,`;
    n=0;
} 

console.log(resultado);
