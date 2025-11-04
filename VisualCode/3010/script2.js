const insertarTexto = (etiqueta,texto)=>{
    let nElemento = document.createElement(etiqueta);
    let nTexto = document.createTextNode(texto);
    nElemento.appendChild(nTexto);
    document.body.appendChild(nElemento);
}

const insertarImg = (url) => {
    let nElemento = document.createElement("img");
    nElemento.src()=(url);
    document.body.appendChild(nElemento);
}


function buscarUsuario(){
    let a = document.getElementById("usuario").value;
    console.log(a);
    fetch((`https://api.github.com/users/${a}`))
    .then(res=>res.json())
    .then(json=> {
        console.log(json.avatar_url);
        insertarTexto("h3", json.name);
        insertarTexto("p", json.public_repos);
        insertarImg(json.avatar_url);
    })
    

    //console.log(infoUsuario.catch);

}