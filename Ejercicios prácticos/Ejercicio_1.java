/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.ejercicios;

import java.util.Scanner;

/**--
 *
 * @author Imp_06 - Mañana
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        /*
        int n1=0;
        int n2=0;
        int n3=0;
        int menor=0;
        
        System.out.println("Hola. Te voy a pedir tres números");
        System.out.println("Dime el primer número");
        n1=s.nextInt();
        menor=n1;
        System.out.println("Dime el segundo número");
        n2=s.nextInt();
        if (n2<menor) menor=n2;
        System.out.println("Dime el tercer número");
        n3=s.nextInt();
        if(n3<menor) menor=n3;
*/
        int n=0;
        int menor=0;
        do {
            System.out.println("Dime un número");
            int a=s.nextInt();
            if (a<menor || n==0) menor=a;
            n++;
        }while(n<3);
        
        System.out.println("El número menor es el "+menor);
        
                    
    }
        
}
    
