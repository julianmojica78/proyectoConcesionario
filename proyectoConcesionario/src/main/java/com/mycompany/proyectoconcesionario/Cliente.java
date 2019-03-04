package com.mycompany.proyectoconcesionario;

/**
 * clase que contiene los atributos de los clientes y los metodos propios del mismo
 * @author Julian Bustos Mojica
 */
public class Cliente {
    /**
     * atributo que contiene el codigo del cliente
     */
    private int codCliente;
    /**
     * atributo que contiene el nombre del cliente
     */
    private String nombre;
    /**
     * atributo que contiene la direccion del cliente
     */
    private String direccion;
    /**
     * atributo que contiene la cedula del cliente
     */
    private String cedula;
    
    /**
     * constructor que inicializa los  atributos
     * @param codCliente
     * @param nombre
     * @param direccion
     * @param cedula 
     */
    public Cliente(int codCliente, String nombre, String direccion, String cedula) {
        this.codCliente = codCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cedula = cedula;
    }
    /**
     * metodo que retorna rel codigo del cliente
     * @return codCliente
     */
    public int getCodCliente() {
        return codCliente;
    }
    /**
     * modofica el codigo del cliente
     * @param codCliente 
     */
    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
    /**
     * metodo que retorna el nombre del cliente
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * modifica el nombre del cliente
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo que retorna la direccion del cliente
     * @return direcion
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * modifica la direccion del cliente
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * metodo que retorna la cedula del cliente
     * @return cedula
     */
    public String getCedula() {
        return cedula;
    }
    /**
    * modifica la cedula del cliente
    * @param cedula 
    */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    
}
