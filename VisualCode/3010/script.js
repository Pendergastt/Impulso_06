
    let miArray = [2, 5, 7, 1, 9];
    let minimo = Math.min(...miArray);
    console.log(minimo);

    let misConocimientos = ['variables', 'operadores', 'estructuras de control', 'funciones'];
    let aprendido = ['spread', 'local storage'];
    let misConocimientosAmpliados = [...misConocimientos, ...aprendido, 'otra cosa más'];
    console.log(misConocimientosAmpliados);

    const user1 = { 
        name: 'Jen', 
        age: 22, 
    }; 
    
    const user2 = { 
        name: "Andrew", 
        location: "Philadelphia" 
    }; 

    const mergedUsers = {...user1, ...user2}; 
    console.log(mergedUsers) 


        fetch('https://api.github.com/users/daviniathebridge')
            .then(res=>res.json())
            .then(json=>console.log(json));


            
