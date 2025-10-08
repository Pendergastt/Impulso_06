package org.example;

import com.mysql.cj.util.SaslPrep;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //acciones para probar que funcionan.

        LibroDAO dao = new LibroDAO();

        // Crear libro
        Libro nuevoLibro = new Libro("El Aliento de los Dioses", "Brandon Sanderson", "IS338297324", 600, 24.99);
        dao.crearLibro(nuevoLibro);

/*
        //BUSQUEDA GENERICA LIBRO

        Object busqueda;
        busqueda=9.65;

        if (busqueda instanceof String) {
            System.out.println("Buscas por String");
            String titulo=busqueda.toString();
            Libro l;
           // if(dao.buscarTitulo(titulo)){
           //     l=dao.buscarTitulo(titulo);

           // }else{
           //     l=dao.buscarAutor(titulo);
           // }
           // if (l==null){
           //     String isbn=busqueda.toString();
           //     l=dao.buscarIsbn(isbn);
            //}
        }

        if (busqueda instanceof Double){
            System.out.println("Soy double");
            Libro l;
            Double precio=Double.parseDouble(busqueda.toString());
            l=dao.buscarPrecio(precio);

        }

        if (busqueda instanceof Integer){
            System.out.println("Soy Integer");
            Libro l;
            int paginas=Integer.parseInt(busqueda.toString());
            l=dao.buscarPaginas(paginas);

        }
*/

        //LEER

        for(l : dao.)

        //UPDATE

        Libro l= new Libro("Tituloprueba","PruebaAutor","es12345",600,8.95);
        dao.updateLibro(l);


        }



    }

