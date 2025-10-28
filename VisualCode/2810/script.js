
    class Rectangulo {
        constructor(alto, ancho) {
        this.alto = alto;
        this.ancho = ancho;
        }
    }

     let Triangulo = class claseRectang {
    constructor(alto, ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    };

    let r = new Rectangulo(3,4);
    let t = new Triangulo(2,3);
    let t2 = new Triangulo(2,4);

    console.log("El cuadrado tiene "+r.alto+" de alto y "+r.ancho+" de ancho");
    console.log(r);
    console.log(t);
    console.log(t2);
