package com.mycompany.proyectoconcesionario;

/**
 * clase que hereda del padre Vehiculo y contiene los atibutos de los vehiculos estandar
 * @author Juilian Bustos
 */
public class Estandar extends Vehiculo{
    
    /**
     * atributo que contiene el codEstandar;
     */
    private int codEstandar;
    /**
     * atributo que contiene el numero de pasajeros
     */
    private int numPasajeros;
    /**
     * atributo que contiene el tipo de transmision
     */
    private String transmision;

    /**
     * constructor que incializa las variables
     * @param codEstandar
     * @param numPasajeros
     * @param transmision
     * @param codVehiculo
     * @param marca
     * @param modelo
     * @param color
     * @param precio 
     */
    public Estandar(int codEstandar, int numPasajeros, String transmision, int codVehiculo, String marca, String modelo, String color, String precio) {
        super(codVehiculo, marca, modelo, color, precio);
        this.codEstandar = codEstandar;
        this.numPasajeros = numPasajeros;
        this.transmision = transmision;
    }
    /**
     * constructor que incializa las variables
     */
    public Estandar(){
        
    }
    /**
     * retorna el codigo del estandar
     * @return codEstandar
     */
    public int getCodEstandar() {
        return codEstandar;
    }
    /**
     *  modifica el codigo del Estandar
     * @param codEstandar 
     */
    public void setCodEstandar(int codEstandar) {
        this.codEstandar = codEstandar;
    }
    /**
     * retorna el numero de pasajeros del vehiculo estandar
     * @return numPasajeros
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }
    /**
     * modifica el numero de pasajeros pra vehiculo estandar
     * @param numPasajeros 
     */
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    /**
     * retorna el tipo de transmision del vehiculo estandar
     * @return 
     */
    public String getTransmision() {
        return transmision;
    }
    /**
     * modifica el tipo de transmision para el vehiculo estandar
     * @param transmision 
     */
    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    
    
    
}
