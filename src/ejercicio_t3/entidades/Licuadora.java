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
public class Licuadora implements Electrodomesticos {
    private String modelo;
    private String marca;
    private String velocidades;
    private String voltaje;
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

    public String getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(String velocidades) {
        this.velocidades = velocidades;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public void encender(){
        JOptionPane.showMessageDialog(null, "Licuadora encendida",
                    "Licuadora", JOptionPane.INFORMATION_MESSAGE); 
    }
    
    @Override
    public void apagar(){
        JOptionPane.showMessageDialog(null, "Licuadora apagada",
                    "Licuadora", JOptionPane.INFORMATION_MESSAGE); 
    }
    
    @Override
    public String getDatosLista(){
        return "Licuadora " + this.marca + " | " + this.modelo;
    }
    
    @Override
    public String getDatosInfo(){
        return "\nLicuadora" +
                "\nMarca: " + this.marca + 
                "\nModelo: " + this.modelo + 
                "\nPrecio: " + this.precio +
                "\nVelocidades: " + this.velocidades + 
                "\nVoltaje: " + this.voltaje;
    }
}
