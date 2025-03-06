/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.entidades;

/**
 *
 * @author alumnog
 */
//Clase: Llamado Carro
public class Carro {

    /**
     * @return the kilometraje
     */
    public double getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //Antes estaba en publica y cuando lo encapsule paso a private por lo que utilizare ahora los pulic set si los quiero tomar 
    //Atributos: De la Clase Carro
    private String color;
    private int anio;
    private String marca;
    private double kilometraje;
    
    /**
     * Calcular el tiempo que tarda el carro en recorrer una distancia.
     * @param distancia: La Distancia que va a recorrer.
     * @param velocidad: La Velocidad que viaja el carro.
     * @return: : Tiempo en el que llega el carro.
     */
    public double calcularTiempo(double distancia, double velocidad){
        this.kilometraje += distancia;
        //La línea de arriba es lo mismo que esta de abajo
        //this.kilometraje = this.kilometraje + distancia;
        
        return distancia / velocidad;
    }
}