package com.mycompany.proyectoconcesionario;

/**
 * clase que hereda del padre Vehiculo y contiene los atibutos de los vehiculos deportivos
 * @author Julian Bustos
 */
public class Deportivo extends Vehiculo{
    /**
     * atributo que contiene el codigo de Deportivo
     */
    private int codDeportivo;
    /**
     * atributo que contiene el cilindraje de deportivo 
     */
    private String cilindrje;
    /**
     * atributo que contiene el peso de depoertivo
     */
    private int peso;
    /**
     * atributo que contiene la fuerza del deportivo
     */
    private String fuerza;
/**
 * constructor que incializa las variables
 * @param codDeportivo
 * @param cilindrje
 * @param peso
 * @param fuerza
 * @param codVehiculo
 * @param marca
 * @param modelo
 * @param color
 * @param precio 
 */
    public Deportivo(int codDeportivo, String cilindrje, int peso, String fuerza, int codVehiculo, String marca, String modelo, String color, String precio) {
        super(codVehiculo, marca, modelo, color, precio);
        this.codDeportivo = codDeportivo;
        this.cilindrje = cilindrje;
        this.peso = peso;
        this.fuerza = fuerza;
    }
    /**
     * constructor que incializa las variables
     */
    public Deportivo(){
        
    }
    /**
     * retorna el codigo del deportivo
     * @return codDeportivo
     */
    public int getCodDeportivo() {
        return codDeportivo;
    }
    /**
     * modifica el codigo de deportivo
     * @param codDeportivo 
     */
    public void setCodDeportivo(int codDeportivo) {
        this.codDeportivo = codDeportivo;
    }
    /**
     * retorna el cilindraje del deportivo
     * @return cilindraje
     */
    public String getCilindrje() {
        return cilindrje;
    }
    /**
     * modifica el valor del cilindraje
     * @param cilindrje 
     */
    public void setCilindrje(String cilindrje) {
        this.cilindrje = cilindrje;
    }
    /**
     * retorna el peso del vehiculo
     * @return 
     */
    public int getPeso() {
        return peso;
    }
    /**
     * modifica el valor del peso
     * @param peso 
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    /**
     * retorna el valor de fuerza 
     * @return fuerza
     */
    public String getFuerza() {
        return fuerza;
    }
    /**
     * modifica el valor de fuerza
     * @param fuerza 
     */
    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }    
}
