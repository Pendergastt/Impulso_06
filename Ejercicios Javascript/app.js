console.log("Hola Mundo");

/*
// EJERCICIO 1
// Pide un número y muestra el número de cifras que tiene
 
function cifras() {
    let numero = window.prompt("--EJERCICIO 1--\nIntroduce un número");
    console.log("/// EJERCICIO 1 ///")
    console.log(`El número de caracteres de ${numero} es ${numero.length}`);
   
}
cifras();

// EJERCICIO 2
// Cadena de "_" tantas veces como el usuario desee

function patron(){
    let veces= window.prompt("--EJERCICIO 2--\nIndica el número de veces que tengo que repetir el caracter '_'");
    let mensaje="";
    for(i=1;i<=veces;i++){
        mensaje=mensaje+"_"    
    };
    console.log("///EJERCICIO 2///");
    console.log(`Este es tu mensaje: ${mensaje}`);

}

patron();

// EJERCICIO 3
// lo mismo que 2 pero con 3 caracteres

function patrones(){
    let veces= window.prompt("--EJERCICIO 3--\nIndica el número de veces que tengo que repetir los caracteres '*','+','_'");
    let mensaje="*";
    
    for (i=1;i<=veces;i++){
        
        switch(mensaje.charAt(i-1)){
            case "_":
                mensaje=mensaje+"*";
                break;
            case "*":
                mensaje=mensaje+"+";
                break;
            case "+":
                mensaje=mensaje+"_";
                break;
        }
    }

    console.log("///EJERCICIO 3///");
    console.log(`Este es tu mensaje: ${mensaje}`);

}
patrones();

// EJERCICIO 4
//  triangulo 1-2-3-4...

function triangulo(){

    let veces= window.prompt("--EJERCICIO 4--\nIndica de cuanto quieres que sea la base del triángulo");
    let mensaje="";
    for (i=1;i<=veces;i++){
        mensaje=mensaje+"*";
        console.log(mensaje);
    }

}

triangulo();

*/

// EJERCICIO 5
// diferencia de días entre dos fechas

function dias() {

    /*
    let f1=window.prompt("Introduce una fecha dd/mm");
    let f2=window.prompt("Introduce otra fecha dd/mm");
    let dia1=f1.split("/");
    let dia2=f2.split("/");
    */

    //let meses = [1,2,3,4,5,6,7,8,9,10,11,12];
    let dias = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    let diferencia = 0;

    /*
    let f1=parseInt(prompt("Introduce una fecha dd/mm"))//.split("/");
    let f2=parseInt(prompt("Introduce otra fecha dd/mm"))//.split("/"));
    */

    let dia1 = parseInt(prompt(`dd/mm\nIntroduce un día dd`));
    let mes1 = parseInt(prompt(`${dia1}/mm\nIntroduce un mes mm`));
    let dia2 = parseInt(prompt(`dd/mm\nIntroduce otro día dd`));
    let mes2 = parseInt(prompt(`${dia2}/mm\nIntroduce otro mes mm`));

    if (mes1 == mes2) diferencia = dia2 - dia1;
    else {
        if (mes2 > mes1) {
            let mestotal=0;
            for(i=mes1;i<=mes2;i++){
                mestotal+=dias[i];
                console.log(mestotal);
            }
            diferencia = (dias[mes1 - 1] - dia1) + dia2+mestotal;

        } else {
            if (mes1 > mes2) {

            }
        }
    }

    

    console.log(`La diferencia es de ${diferencia} días`);


    
}

dias();