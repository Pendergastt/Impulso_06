
   let x1 = new Boolean(false);
   let x2 = new Boolean(false);
   let x5 = new Object(false);
    console.log("Esto es x1 "+x1);

    if (x1) { //Dirección de memoria
        console.log("Entro en el if");
    }else{
        console.log("No entro en el if");
    }

    console.log("esto es doble igual ");
    console.log(x1==false);
    console.log("=== "+ (x1 === false));
    console.log(x1==true);
    console.log("esto es triple ="+(x5===false));
    console.log(x1==x2); //Direcciones de memoria
    console.log(x1===x2); //Direcciones de memoria
    console.log(JSON.stringify(x1) == JSON.stringify(x2)); //Pasamos el objeto a string y comparamos

    let x3 = false;
    if (x3) { //false
        console.log("Entro en el if");
    }else{
        console.log("No entro en el if");
    }

    console.log(x2.toString());
    let x4 = x2.toString(); //Convierte a cadena de caracteres
    console.log(x4[0] + " " +x4[1] + " " + x4.charAt(2) + " " + x4.charAt(3) + ` ${x4[4]}`);
    console.log(x2.valueOf());
    console.log(typeof(x1));
    console.log(typeof(x3));
    console.log(typeof(x2.valueOf));
    console.log(typeof(x2.valueOf()));

