package com.mycompany.proyectoconcesionario;

import java.util.List;

/**
 * clase que contiene los atributos de los ArraysFacturaa y los metodos propios del mismo
 * @author Julian Bustos Mojica
 */
public class ArraysFactura {
    /**
     * atributo qu contiene la lista de facturas
     */
    private List<Factura> factura;
    /**
     * constructor que inicializa las variables de factura
     * @param factura 
     */
    public ArraysFactura(List<Factura> factura) {
        this.factura = factura;
    }
    /**
     * metodo que retorna la lista de las facturas 
     * @return 
     */
    public List<Factura> getFactura() {
        return factura;
    }
    /**
     * modifica la lista de las facturas
     * @param factura 
     */
    public void setFactura(List<Factura> factura) {
        this.factura = factura;
    }
}
