function ejercicio1(){

let n=0 // numero de veces que se repite a
let ntotal=0;
let cadenaUsuario = prompt("Introduce una frase un poco larga");

let separada = cadenaUsuario.split(" ");
let aes = "";
let circun="";
let resultado = "Este es el resultado: " ;
console.log(separada.length)
let numeroDePalabras;
if(separada.length%2==0) numeroDePalabras=(separada.length-1);
else numeroDePalabras = separada.length;
///// Cuenta las "a" en las palabras impares
for (i=0;i<=numeroDePalabras;i+=2){
    for (j=0;j<=separada[i].length;j++){
        if (separada[i].charAt(j)=="a") n++;
    }
    ntotal+=n;
    console.log(n);
    console.log(`En la palabra ${separada[i]} hay ${n} "aes".`);
    n=0;
}
/////////

for (ch of cadenaUsuario){
    if (ch!="a") aes+=" ";
    else aes+="^";
    console.log("esto es aes" + aes)
}

for (ch of cadenaUsuario){
    if (ch!="a") circun+=" ";
    else circun+="v";
    console.log("esto es aes" + aes)
}


console.log(`Tu frase escrita era: ${cadenaUsuario}`);
console.log("este seria resultado" +resultado);
console.log(`El total de letras "a" es ${ntotal}`);

console.log(circun);
console.log(`${cadenaUsuario}`);
console.log(aes);


let a = document.getElementById(ejercicio1);

let texto=`Tu frase escrita era: ${cadenaUsuario}.\n El total de letras "a" es ${ntotal}`


let etiqueta=document.createElement("p");

let contenido= document.createTextNode(texto);
let lineaAes= document.createTextNode(aes);
etiqueta.appendChild(contenido);
//document.getElementById("ejercicio1").appendChild(etiqueta);
document.getElementById("ejercicio1").appendChild(contenido);
document.getElementById("ejercicio1").appendChild(lineaAes);

}

function ejercicio2(){



    

}