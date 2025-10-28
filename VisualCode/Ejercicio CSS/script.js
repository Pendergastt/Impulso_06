function numeroEnlacesPagina(){

let numeroEnlaces = document.getElementsByTagName("a");
alert(`El número de enlaces a la página es ${numeroEnlaces.length}`);

}

function direccionPenultimoEnlace(){
    let enlaces = document.getElementsByTagName("a");
let penultimo = (document.getElementsByTagName("a").length-2);
alert(enlaces[penultimo]);

}

function enlacesAPrueba(){

    
    let enlaces = document.getElementsByTagName("a");
    /*
    let numEnlaces = enlaces.filter((a) => a.href=="http://prueba/");

    console.log("enlaces con httpbla "+ numEnlaces)
    */


    let n=0;
       

    for (i=0; i<enlaces.length; i++){
        if (enlaces[i].href == "http://prueba/"){
            console.log(enlaces[i]);
            n++
        }
    }

    alert(`El número de enlaces que llevan a prueba es ${n}`);

}

function numeroEnlacesTercerParrafo(){


let nParrafos = document.getElementsByTagName("p");
let ultimoParrafo = nParrafos[nParrafos.length-1];
let numeroEnlaces = ultimoParrafo.getElementsByTagName("a").length;
alert(`En el tercer párrafo hay ${numeroEnlaces} enlaces`);




}