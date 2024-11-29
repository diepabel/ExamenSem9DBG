/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

/**
 *
 * @author AUTORIZADO
 */
public class Hoja1 {
     private int numero;
    public Hoja1(){}
    public Hoja1(int numero){
        this.numero=numero;
        
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public String mensaje (){
        String n="";
        if (numero%2==0) {
            n= numero + " ES par";
            
        } else { 
            n= numero + " Es impar";
        }
        return n;
    }
    
}
