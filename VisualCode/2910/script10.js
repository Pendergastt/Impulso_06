
    const persona = {
        nombre: 'espacio para el nombre',
        apellidos: 'espacio para los apellidos',
        edad: 'espacio para la edad',
        muestraDatos() {
            const menor = this.edad < 18 ? 'es menor de edad' : 'no es menor de edad';

            alert(`Nombre: ${this.nombre}, Apellidos: ${this.apellidos}.\nTiene ${this.edad} años  y ${menor}`);
        }
    };

    // Creamos un objeto persona (equivalente a new)
    let persona1 = Object.create(persona);
    persona1.nombre = "Rafael";
    persona1["apellidos"] = "Pérez Ramírez";
    persona1["edad"] = 15;
    persona1.muestraDatos();

    // Alternativa con new
    let persona2 = new Object(persona);
    persona2["nombre"] = "Ana";
    persona2.apellidos = "Valcárcel Luis";
    persona2.edad = 43;
    console.log(persona2["muestraDatos"]);
    persona2.muestraDatos();

    /////////////////////////////


    //Objeto 1
    const personalInformation = {
        firstName: 'Philip',
        lastName: 'Fry'
    };

    //Objeto 2
    const details = {
        job: 'Delivery Boy',
        employer: 'Planet Express'
    };

    // Objeto resultante de combinar ambos
    var person = Object.assign(personalInformation, details);
    console.log(person);

