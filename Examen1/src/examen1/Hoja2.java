/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

/**
 *
 * @author AUTORIZADO
 */
public class Hoja2 {
    private int hTrabajadas;
    private String clase;
    
    public int getHtrabajadas(){
        return hTrabajadas;
    }
    public void setHTrabajadas(int hTrabajadas){
        this.hTrabajadas = hTrabajadas;
    }
    public String getClase(){
        return clase;
    }
    public void setClase(String clase){
        this.clase = clase;
    }
    public double calcularSueldo(){
        double SueldoPorHora;
        switch (clase){
         case "A":
                SueldoPorHora = 25;
                break;
         case "B" :
                SueldoPorHora = 20;
                break;
         case "C" :
                SueldoPorHora = 15;
                break;
         case "D" :
                SueldoPorHora = 10;
                break;
         default:
                SueldoPorHora = 0;
                break;
        }
        return SueldoPorHora * hTrabajadas;
    }
    
}
