package com.mycompany.proyectoconcesionario;

/**
 * clase que contiene los atributos del vehiculo y los metodos propios del mismo
 * @author Julian Bustos Mojica
 */
public class Vehiculo {
    private int codVehiculo;
    private String marca;
    private String modelo;
    private String color;
    private String precio;
/**
 * constructor que inicialliza los atributos 
 * @param codVehiculo
 * @param marca
 * @param modelo
 * @param color
 * @param precio 
 */
    public Vehiculo(int codVehiculo, String marca, String modelo, String color, String precio) {
        this.codVehiculo = codVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }
    /**
     * constructor que inicialliza los atributos
     */
    public Vehiculo(){
        
    }           
    /**
     * metodo que retorna el codigo del vehiculo
     * @return codVehiulo
     */
    public int getCodVehiculo() {
        return codVehiculo;
    }
    /**
     * modifica el codigo del vehiculo
     * @param codVehiculo 
     */
    public void setCodVehiculo(int codVehiculo) {
        this.codVehiculo = codVehiculo;
    }
    /**
     *  * metodo que retorna la marca del vehiculo
     * @return marca
     */
    public String getMarca() {
        return marca;
    }
    /**
     * modifica la marca del vehiculo
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * metodo que retorna el modelo del vehiculo
     * @return modelo
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * modifica el modelo del vehiculo
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     *  * metodo que retorna el color del vehiculo
     * @return color
     */
    public String getColor() {
        return color;
    }
    /**
     * modifica el color del vehiculo
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     *  * metodo que retorna el precio del vehiculo
     * @return precio
     */
    public String getPrecio() {
        return precio;
    }
    /**
     * modifica el precio del vehiculo
     * @param precio 
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
}


