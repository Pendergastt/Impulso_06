// 1 | | se pinche sobre el primer enlace se oculta su sección
// 2 | | se pincha en el mismo enlace y vuelven los contenidos
// 3 | | el resto de enlaces hace lo mismo que el primero
// 4 | | cuando se oculte cambia el mensaje asociado


// 1
window.onload = function() {
console.log("todo cargado")
document.getElementById("enlace_1").onclick = ocultarSeccion;

}

function visible(objeto){
    
    let a = objeto.style.visibility;
    console.log(a);
        if(a == "hidden") objeto.style.visibility="visible";
        if(a == "visible") objeto.style.visibility="hidden";
}

function ocultarSeccion() {
    console.log("entra en funcion");
    let ocultar = document.getElementById("contenidos_1");
    visible(ocultar);  
}

let parrafos = document.getElementsByTagName("p");
console.log("estos son los parrafos" +parrafos);

 parrafos.forEach(element => {
    //pero tenemos que cambiar lo del contenidos_[i]
    //el indice de cada elemento +1 es si contenido_numero.
    visible(element);
    
 });




