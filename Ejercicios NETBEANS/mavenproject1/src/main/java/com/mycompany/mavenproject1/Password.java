/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Password {
    //mirar en casa
    String [] copiaSeguridad;
    private static int longitud=8;
    private String password;
    
// Constructores
    
    private void Password(String password){
        this.password=password;
    }
    
    private void Password(int longitud){
        this.longitud=longitud;
        this.password=passAleatorio(longitud);
    }
    
    private void Password(Password password){
        if (copiaSeguridad[0]){
            copiaSeguridad.append(password);
        }else{
            copiaSeguridad={password};
        }
    }
    
//Métodos
    private String passAleatorio(int longitud){
        StringBuilder password=new StringBuilder(longitud);
        for (int i=0;i<longitud;i++){
            int c = (int)(Math.random()*38+(122-38));
            password.append((char)c);
        }
        return password.toString();
    }
    
    
    
}
