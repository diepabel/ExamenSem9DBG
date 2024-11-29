/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

/**
 *
 * @author AUTORIZADO
 */
public class Hoja3 {
    private int Cantidad;
    private String tipo;
    
    public int getCantidad(){
        return Cantidad;
    }
    
    public void setCantidad(int Cantidad){
        this.Cantidad = Cantidad;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public double calcularPrecio(){
        double precio;
        switch (tipo){
            case "A":
                precio = 20;
                if (Cantidad >= 5) {
                    precio -= precio *0.05;
                }
                break;
            case "B":
                precio = 35;
                if (Cantidad >= 5) {
                    precio -= precio * 0.08;
                }
                break;
            case "C":
                precio = 50;
                if (Cantidad >=5) {
                    precio -= precio * 0.15;
                }
                break;
            default:
                precio = 0;
                break;
        }
        return precio * Cantidad;
    }
    
}
