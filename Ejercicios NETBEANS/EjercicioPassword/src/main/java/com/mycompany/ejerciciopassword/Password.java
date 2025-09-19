/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopassword;

/**
 *
 * @author Imp_06 - Mañana
 */
public class Password {
    //mirar en casa
    private static int longitud=8;
    private String password;
    
// Constructores
    
    public Password(){
        this.longitud=8;
        this.password="LLk85412";
        
    }
    
    public Password(String password){
        this.password=password;
    }
    
    public Password(int longitud){
        this.longitud=longitud;
        this.password=generarPassword(longitud);
    }
    
    public Password(Password CPassword){
        this.password = CPassword.password;
        this.longitud = CPassword.longitud;
    }
    
//Métodos
    
    //metodos para letra mayuscula, minuscula y numero?
    
    public char numero(){ //5 numeros
        int c;
        c = (int)(Math.random()*10+48);
        return (char)c;
    }
    public char letraMay(){ //2 mayusculas
        int c;
        c = (int)(Math.random()*25+65);
        return (char)c;
    }
    public char letraMin(){ //1 minuscula
        int c;
        c = (int)(Math.random()*25+97);
        return (char)c;
    }
    
    public String generarPassword(int longitud){
    StringBuilder password=new StringBuilder(longitud);
        int may=0;
        int min=0;
        int num=0;
        boolean minimo=false;
        
        for (int i=0;i<longitud;i++){
            char a = 0;               
            if (may==2&&min==1&&num==5) minimo=true;            
            do{
            int c= (int)(Math.random()*3+1);
            if (c==1&&may<2){
                a=letraMay();
                may++;}             
            if(c==2&&min<1){
                a=letraMin();
                min++;}             
            if(c==3&&num<5){
                a=numero();
                num++;
            }
            }while(a==0 && minimo==false);
            if(minimo==true){
            int c= (int)(Math.random()*3+1);
            if (c==1)a=letraMay();
                             
            if(c==2)a=letraMin();
                          
            if(c==3)a=numero();                   
            }
            
            password.append(a);
        }
            
            return password.toString();
    }
    
        
    
    
    /*
    public String generarPassword(int longitud){
        StringBuilder password=new StringBuilder(longitud);
        for (int i=0;i<longitud;i++){
            int c;
            do{
                c = (int)(Math.random()*48+(122-38));
                
            }while((c>=58 && c<=64)||(c>=91 && c<=96));
            password.append((char)c);
        }
        return password.toString();
    }
    */
    
    public boolean esFuerte(String password){
        boolean fuerte=false;
            int contMay=0;
            int contMin=0;
            int num=0;
        if (longitud<8){
            System.out.println("El password no es fuerte");
        }else{
            
            for (int i=0; i<longitud;i++){
                int c=(int)password.charAt(i);
                if (c>=(int)'A'&&c<=(int)'Z'){
                    contMay++;
                }
                if (c>=(int)'a'&&c<=(int)'z'){
                    contMin++;
                }
                if (c>=(int)'0'&&c<=(int)'9'){
                    num++;
                }
            }
            
        }
        if (contMay>=2&&contMin>=1&&num>=5){
        fuerte=true;
        }
        return fuerte;
    }
    
    //GETTER
    
    public String getPassword(){
        return this.password;
    }
    
    public int getLongitud(){
        return this.longitud;
        
    }
    
    //SETTER
    
    public void setPassword(String nuevoPassword){
        if(esFuerte(nuevoPassword)){
            System.out.println("La nueva contraseña ES FUERTE");
           
        }else System.out.println("La contraseña NO ES FUERTE");
    }
    
}
