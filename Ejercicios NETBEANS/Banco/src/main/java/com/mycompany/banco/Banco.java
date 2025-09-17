/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.banco;

import java.util.Scanner;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Banco {

    /*
    //añadir cantidad
    public void ingresar(double cantidad) {
        if (cantidad < 0) {
            System.out.println("No puede ser una cantidad negativa");
        }else{
        c1.ingresar(cantidad);
        }
      
    }

    public void retirar(double cantidad) {
        if(cantidad>c1.getCantidad()){
            c1.setCantidad(0);
        }
            c1.retirar(cantidad);
        
    }
        
     */
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("Luis", 1000);
        Cuenta c2 = new Cuenta("Juan", 2000);
        Scanner s = new Scanner(System.in);
        
        Cuenta[] cuentas= {
            new Cuenta("Luis",1000),
            new Cuenta("Juan",2000),
            new Cuenta("Maria",5000),
            new Cuenta("Esteban",4000)
        };
        
        int opcion;
        String nombre;

        Cuenta c = new Cuenta("", 0);

        System.out.println("Hola. Dime tu nombre, por favor");
        nombre = s.nextLine();
        
        for (int i=0;i<cuentas.length;i++){
            if (cuentas[i].getTitular().equals(nombre)){
                c=cuentas[i];
            }
        }
          

        do {
            System.out.println("Bienvenido al Banco \n Elige una opcion");
            System.out.println("1.- Consultar dinero\n 2.- Ingresar dinero\n 3.- Retirar dinero\n 4.- Ver titularidad\n 5.- Salir");
            opcion = s.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println(c.getCantidad());
                    break;
                }
                case 2 -> {
                    System.out.println("Introduce una cantidad");
                    double cantidad = s.nextDouble();
                    if (cantidad < 0) {
                        do {
                            System.out.println("No puede ser dinero negativo\nVuelve a introducir una cantidad");
                            cantidad = s.nextDouble();
                        } while (cantidad < 0);
                    }

                    c.ingresar(cantidad);
                    break;
                }
                case 3 -> {
                    System.out.println("Introduce una cantidad");
                    double cantidad = s.nextDouble();
                    if (cantidad < 0) {
                        do {
                            System.out.println("No puede ser dinero negativo\nVuelve a introducir una cantidad");
                            cantidad = s.nextDouble();
                        } while (cantidad < 0);
                    }
                    if (cantidad > c.getCantidad()) {
                        System.out.println("Te faltaban " + (cantidad - c.getCantidad()) + " euros");
                        System.out.println("Tenías menos dinero del que querías retirar\nHemos dejado tu cuenta a 0");
                        c.setCantidad(0);

                    } else {
                        c.retirar(cantidad);
                    }
                    break;

                }
                case 4 -> {
                    System.out.println(c.toString());
                    break;
                }
                case 5 -> {
                    System.out.println("Gracias. Adios");
                    break;
                }
            }
        } while (opcion != 5);
    }

}
