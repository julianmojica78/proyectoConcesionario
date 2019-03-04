package com.mycompany.proyectoconcesionario;

import java.util.List;

/**
 * clase que contiene los atributos de la factura y los metodos propios del mismo
 * @author Julian Bustos Mojica
 */
public class Factura {
    
    /**
     * atributo que contiene el codigo de la factura
     */
    private int codFactura;
    /**
     * atributo que contiene la fecha de la factura
     */
    private String fecha;
    /**
     * atributo que contiene el total de la factura
     */
    private String total;
    /**
     * atributo que contiene la lista de los clientes
     */
    private List<Cliente> cliente;
    /**
     * atributo que contiene la lista de ventas
     */
    private List<Venta> venta;
    /**
     * constructor que inicializa los atributos
     */
    public Factura() {
    }
    /**
     * metodo que retorna el codigo de la factura
     * @return  
     */
    public int getCodFactura() {
        return codFactura;
    }
    /**
     * modifica el codigo de la factura
     * @param codFactura 
     */
    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }
    /**
     * metodo que retorna la fecha de la factura
     * @return fecha
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * modifica la fecha de la factura
     * @param fecha 
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     * metodo que retorna el total de la factura
     * @return total
     */
    public String getTotal() {
        return total;
    }
    /**
     * modifica el total de la factura
     * @param total 
     */
    public void setTotal(String total) {
        this.total = total;
    }
    /**
     * metodo que retorna la lista de los clientes
     * @return 
     */
    public List<Cliente> getCliente() {
        return cliente;
    }
    /**
     * modifica la lista de clientes
     * @param cliente 
     */
    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }
    /**
     * metodo que retorna la lista de la venta
     * @return venta
     */
    public List<Venta> getVenta() {
        return venta;
    }
    /**
     * modifica la lista de la venta
     * @param venta 
     */
    public void setVenta(List<Venta> venta) {
        this.venta = venta;
    } 
}
