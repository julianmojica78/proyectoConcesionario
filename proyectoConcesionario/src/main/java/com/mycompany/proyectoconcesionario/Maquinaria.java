package com.mycompany.proyectoconcesionario;

/**
 *  clase que hereda del padre Vehiculo y contiene los atibutos de Maquinaria Pesada
 * @author Julian Bustos
 */
public class Maquinaria extends Vehiculo{
 
    /**
     * atributo que contiene el codigo de maquinaria
     */
    private int codMaquinaria;
    /**
     * atributo que contiene el tipo de maquinaria
     */
    private String tipo;
    /**
     * atributo que contiene el Sub-Tipo de Maquinaria
     */
    private String subTipo;
    /**
     * atributo que contiene la potencia de Maquinaria
     */
    private String potencia;
    /**
     * constructor que incializa las variables
     * @param codMaquinaria
     * @param tipo
     * @param subTipo
     * @param potencia
     * @param codVehiculo
     * @param marca
     * @param modelo
     * @param color
     * @param precio 
     */
    public Maquinaria(int codMaquinaria, String tipo, String subTipo, String potencia, int codVehiculo, String marca, String modelo, String color, String precio) {
        super(codVehiculo, marca, modelo, color, precio);
        this.codMaquinaria = codMaquinaria;
        this.tipo = tipo;
        this.subTipo = subTipo;
        this.potencia = potencia;
    }
    
    /**
     * constructor que incializa las variables
     */
    public Maquinaria(){
    
}
    
    /**
     * retorna el codigo de la maquinaria
     * @return codMaquinaria
     */
    public int getCodMaquinaria() {
        return codMaquinaria;
    }
    /**
     * modifica el codigo de la maquinaria
     * @param codMaquinaria 
     */
    public void setCodMaquinaria(int codMaquinaria) {
        this.codMaquinaria = codMaquinaria;
    }
    /**
     * retorna el tipo de la maquinaria
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * modifica el sub tipo del la maquinaria
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * retorn el sub tipo de la maquinaria
     * @return 
     */
    public String getSubTipo() {
        return subTipo;
    }
    /**
     * modifica el sub tipo de maquinaria
     * @param subTipo 
     */
    public void setSubTipo(String subTipo) {
        this.subTipo = subTipo;
    }
    /**
     * retorna la potencia del maquinaria
     * @return 
     */
    public String getPotencia() {
        return potencia;
    }
    /**
     * modifica la potencia de la maquinaria
     * @param potencia 
     */
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
    
    
}
