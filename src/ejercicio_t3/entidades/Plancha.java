/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_t3.entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Plancha implements Electrodomesticos {
    private String modelo;
    private String marca;
    private String temperatura;
    private boolean vapor;
    private double precio;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isVapor() {
        return vapor;
    }

    public void setVapor(boolean vapor) {
        this.vapor = vapor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
   @Override
    public void encender(){
        JOptionPane.showMessageDialog(null, "Plancha encendida",
                    "Licuadora", JOptionPane.INFORMATION_MESSAGE); 
    }
    
    @Override
    public void apagar(){
        JOptionPane.showMessageDialog(null, "Plancha apagada",
                    "Licuadora", JOptionPane.INFORMATION_MESSAGE); 
    }
    
    @Override
    public String getDatosLista(){
        return "Plancha " + this.marca + " | " + this.modelo;
    }
    
    @Override
    public String getDatosInfo(){
        return "\nPlancha" +
                "\nMarca: " + this.marca + 
                "\nModelo: " + this.modelo + 
                "\nPrecio: " + this.precio +
                "\nTemperatura: " + this.temperatura + 
                "\nVapor: " + this.vapor;
    }
}
