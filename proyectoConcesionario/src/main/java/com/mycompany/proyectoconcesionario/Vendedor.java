package com.mycompany.proyectoconcesionario;

/**
 * clase que contiene los atributos del vendedor y los metodos propios del mismo
 * @author Julian Bustos Mojica
 */
public class Vendedor {
    
    /**
     * atributo que contiene el codigo del vendedor
     */
    private int codVendedor;
    /**
     * atributo que contiene el metodo del nombre
     */
    private String nombre;
    /**
     * atributo que contiene la comision del vendedor
     */
    private float Comision;

    /**
     * constructor que inicializa las variables
     * @param codVendedor
     * @param nombre
     * @param Comision 
     */
    public Vendedor(int codVendedor, String nombre, float Comision) {
        this.codVendedor = codVendedor;
        this.nombre = nombre;
        this.Comision = Comision;
    }
    /**
     * constructor que inicializa las variables
     */
    public Vendedor() {
    }
    /**
     * metodo que retorna el codigo del vendedor
     * @return codVendedor
     */
    public int getCodVendedor() {
        return codVendedor;
    }
    /**
     * modifica el codigo del vendedor
     * @param codVendedor 
     */
    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }
    /**
     * metodo que retorna el nombre del vendedor
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * modifica el nombre del vendedor
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo que retorna la comision del vendedor
     * @return comision
     */
    public float getComision() {
        return Comision;
    }
    /**
     * modifica la comision del vendedor
     * @param Comision 
     */
    public void setComision(float Comision) {
        this.Comision = Comision;
    }
    
    
}
