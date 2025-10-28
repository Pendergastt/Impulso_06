
    console.log(JSON.parse('{}'));              // {}
    console.log(JSON.parse('true'));            // true
    console.log(JSON.parse('"foo"'));           // "foo"
    console.log(JSON.parse('[1, 5, "false"]')); // [1, 5, "false"]
    console.log(JSON.parse('null'));            // null
    console.log(JSON.parse('{"nombre": "Davinia", "apellido": "de la Rosa"}')); //{nombre: "Davinia", apellidos: "de la Rosa"}
    console.log(JSON.parse('{"nombre": "Davinia", "apellido": "de la Rosa"}').nombre); //Davinia
    let objeto = JSON.parse('{"nombre": "Davinia", "apellido": "de la Rosa"}');
    //Formas de acceso equivalentes
    console.log(objeto.apellido);
    console.log(objeto["apellido"]);

    console.log(JSON.parse('[1,2,3,4]'));

    let a = 
    [
    {
      "nombre": "Francisco Ramirez",
      "edad": 29,
      "puesto": "Contable",
      "Emails": [
        "francisco@gmail.com",
        "francisco@hotmail.es",
        "francisco@thebridgeschool.es"
      ]
    },
    {
        "nombre": "Isabel Pérez",
        "edad": 31,
        "puesto": "Profesora",
        "Emails": [
          "isabel@gmail.com",
          "isabel@hotmail.es",
          "isabel@thebridgeschool.es"
        ]
      }
  ]

  console.log(a[1].Emails[2]);


  

