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
public class Waflera implements Electrodomesticos {
    private String modelo;
    private String marca;
    private String tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public void encender(){
        JOptionPane.showMessageDialog(null, "Waflera encendida",
                    "Licuadora", JOptionPane.INFORMATION_MESSAGE); 
    }
    
    @Override
    public void apagar(){
        JOptionPane.showMessageDialog(null, "Waflera apagada",
                    "Licuadora", JOptionPane.INFORMATION_MESSAGE); 
    }
    
    @Override
    public String getDatosLista(){
        return "Waflera " + this.marca + " | " + this.modelo;
    }
    
    @Override
    public String getDatosInfo(){
        return "\nWaflera" +
                "\nMarca: " + this.marca + 
                "\nModelo: " + this.modelo + 
                "\nPrecio: " + this.precio +
                "\nTipo: " + this.tipo;
    }
}
