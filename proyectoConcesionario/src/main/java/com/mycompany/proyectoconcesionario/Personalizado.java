package com.mycompany.proyectoconcesionario;

/**
  *  clase que hereda del padre Vehiculo y contiene los atibutos de Personalizados
 * @author Julian Bustos
 */
public class Personalizado extends Vehiculo{
    
    /**
     * atributo que contiene el codigo de personaliados
     */
    private int codPersonalizados;
    /**
     * atributo que contiene el tipo de asientos del vehiculo
     */
    private String asientos;
    /**
     * atributo que contiene el tipo de vidrios del vehiculo
     */
    private String vidrios;
    /**
     * atributo que contiene el numero de rines del vehiculo
     */
    private int rines;
    /**
     * constructor para inicializar las variables
     * @param codPersonalizados
     * @param asientos
     * @param vidrios
     * @param rines
     * @param codVehiculo
     * @param marca
     * @param modelo
     * @param color
     * @param precio 
     */
    public Personalizado(int codPersonalizados, String asientos, String vidrios, int rines, int codVehiculo, String marca, String modelo, String color, String precio) {
        super(codVehiculo, marca, modelo, color, precio);
        this.codPersonalizados = codPersonalizados;
        this.asientos = asientos;
        this.vidrios = vidrios;
        this.rines = rines;
    }
    /**
     * constructor para inicializar las variables
     */
    public Personalizado(){
        
    }
    /**
     * retorna el codigo de personalizaos
     * @return codPersonalizado
     */
    public int getCodPersonalizado() {
        return codPersonalizados;
    }
    /**
     * modifica el codigo de personalizados
     * @param codPersonalizados 
     */
    public void setCodPersonalizado(int codPersonalizados) {
        this.codPersonalizados = codPersonalizados;
    }
    /**
     * retorna el tipo de asientos del vehiculo
     * @return asientos
     */
    public String getAsientos() {
        return asientos;
    }
    /**
     * modifica el tipo de asientos del vehiculo
     * @param asientos 
     */
    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }
    /**
     * retorna el tipo de vidrios del vehiculo
     * @return vidrios
     */
    public String getVidrios() {
        return vidrios;
    }
    /**
     * modifica el tipo de vidrios del vehiculo
     * @param vidrios 
     */
    public void setVidrios(String vidrios) {
        this.vidrios = vidrios;
    }
    /**
     * retorna el numero del rin del vehiculo
     * @return rines
     */
    public int getRines() {
        return rines;
    }
    /**
     * modifica el numero del rin del vehiculo
     * @param rines 
     */
    public void setRines(int rines) {
        this.rines = rines;
    }
    
    
}
