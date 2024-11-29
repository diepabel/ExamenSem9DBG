/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

/**
 *
 * @author AUTORIZADO
 */
public class Hoja4 {
    private int NumHijos;
    private double Sueldo;
    
    public int getNumHijos(){
        return NumHijos;
    }
    public void setNumHijos(int NumHijos){
        this.NumHijos = NumHijos;   
    }
    public double getSueldo(){
        return Sueldo;
    }
    public void setSueldo(double Sueldo){
        this.Sueldo = Sueldo;
    }
    public double CalcularBonificacion(){
        double bonificacion = 0;
        switch (NumHijos){
            case 1:
                bonificacion = 50;
                break;
            case 2:
                bonificacion = 100;
                break;
            default:
                if (NumHijos > 2) {
                    bonificacion = 200;
                    
                }
                break;
        }
        return Sueldo + bonificacion;
    }
    
}
