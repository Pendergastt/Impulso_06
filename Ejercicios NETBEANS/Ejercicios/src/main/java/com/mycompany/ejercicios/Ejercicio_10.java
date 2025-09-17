/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Ejercicio_10 {

    public static int nCifras(int n) {
        int contador = 0;

        while (n != 0) {
            n = n / 10;
            contador++;
        }
        return contador;
    }

    public static void nuevoNumero(int num, int cifras) {
        int resultado = 0;

        for (int n = cifras - 1; n >= 0; n--) {
            double unidades = 0;

            unidades = (num % 10) * Math.pow(10, n);
            num /= 10;

            resultado += unidades;
            System.out.println(resultado);
        }
        System.out.println("El resultado es " + resultado);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un número positivo cualquiera");

        int n = s.nextInt();
        int cifras = nCifras(n);
        nuevoNumero(n, cifras);

    }
}
