package com.mycompany.proyectoconcesionario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * clase que contiene los atributos del inventario y los metodos propios del mismo
 * @author Julian Bustos Mojica
 */
public class Inventario {
    
    /**
     * atributo que contiene el codigo del Inventario
     */
    private int codInventario;
    /**
     * atributo que contiene la lista de Vehiculos
     */
    private List<Vehiculo> vehiculo;
    /**
     * atributo que contiene la cantidad de vehiculos
     */
    private int cantidad;
    /**
     * array que contine los vehiculos
     */
    List<Vehiculo> auto = new ArrayList<>();
    /**
     * array que contine los vehiculos deportivos
     */
    List<Deportivo> vehiculo1 = new ArrayList<>();
    /**
     * array que contine los vehiculos estandar
     */
    List<Estandar> vehiculo2 = new ArrayList<>();
    /**
     * array que contine los vehiculos de maquinaria pesada
     */
    List<Maquinaria> vehiculo3 = new ArrayList<>();
    /**
     * array que contine los vehiculos personalizados
     */
    List<Personalizado> vehiculo4 = new ArrayList<>();
    /**
     * array que contine los datos del vendedor
     */
    List<Vendedor> vendedor = new ArrayList<>();
    List<Inventario> inventario = new ArrayList<>();
    
    /**
     * constructor que incializa las variables
     * @param codInventario
     * @param vehiculo
     * @param cantidad 
     */
    public Inventario(int codInventario, List<Vehiculo> vehiculo, int cantidad) {
        this.codInventario = codInventario;
        this.vehiculo = vehiculo;
        this.cantidad = cantidad;
    }
    /**
     * constructor que incializa las variables
     */
    public Inventario() {
    }
    /**
     * metodo que enseña el menu de seleccion y rediige segun la opcion
     */
    public void menuAgregar(){
        Scanner sn = new Scanner(System.in);
        int opcion = 0; //Guardaremos la opcion del usuario
 
        do{
            System.out.println("Bienvenidos");
            System.out.println("1. Insertar Deportivos");
            System.out.println("2. Mostrar  Deportivos");
            System.out.println("3. Insertar Estandar");
            System.out.println("4. Mostrar  Estandar");
            System.out.println("5. Insertar Maquinaria");
            System.out.println("6. Mostrar  Maquinaria");
            System.out.println("7. Insertar Personalizados");
            System.out.println("8. Mostrar  Personalizados");
            System.out.println("9. Mostrar Vehiculo mas Caro Y mas Barato");
            System.out.println("10. Salir");
 
            try {            
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        agregarDeportivo(vehiculo1);
                        break;
                    case 2:
                         imprimirDeportivo(vehiculo1);
                        break;
                    case 3:
                        agregarEstandar(vehiculo2);
                        break;
                    case 4:
                        imprimirEstandar(vehiculo2);
                        break;
                    case 5:
                        agregarMaquinaria(vehiculo3);
                        break;
                    case 6:
                        imprimirMaquinaria(vehiculo3);
                        break;
                    case 7:
                        agregarPersonaliados(vehiculo4);
                        break;
                    case 8:
                        imprimirPersonalizado(vehiculo4);
                        break;
                    case 9:
                        vehiculoMasCaro();
                        vehiculoMasBarato();
                        break;
                    case 10:
                        System.out.println("Salir...");
                        System.exit(opcion);
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 11");
                }
            } catch(Exception e){
                System.out.println("Debes insertar un número");
                sn.next();
            } 
        }while(opcion != 7);  
    }
    /**
    * metodo que permite agregar un vehiculo Deportivo
    * @param vehiculo1
    * @throws IOException 
    */
    public void agregarDeportivo(List<Deportivo> vehiculo1) throws IOException{
      
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Deportivo deportivo2 = new Deportivo();
      
      System.out.println("Ingrese el Codigo del vehiculo:");
      deportivo2.setCodVehiculo(Integer.parseInt(br.readLine()));
      System.out.println("Ingrese el Marca del vehiculo:");
      deportivo2.setMarca(br.readLine());
      System.out.println("Ingrese el Modelo del vehiculo:");
      deportivo2.setModelo(br.readLine());
      System.out.println("Ingrese el Color del vehiculo:");
      deportivo2.setColor(br.readLine());
      System.out.println("Ingrese el Precio del vehiculo:");
      deportivo2.setPrecio(br.readLine());
      System.out.println("Ingrese el Codigo del vehiculo Deportivo:");
      deportivo2.setCodDeportivo(Integer.parseInt(br.readLine()));
      System.out.println("Ingrese el Cilindraje del vehiculo Deportivo:");
      deportivo2.setCilindrje(br.readLine());
      System.out.println("Ingrese el Peso del vehiculo Deportivo:");
      deportivo2.setPeso(Integer.parseInt(br.readLine()));
      System.out.println("Ingrese la Fuerza del Vehiculo Deportivo:");
      deportivo2.setFuerza(br.readLine());
      vehiculo1.add(deportivo2); 
      agregarStock(deportivo2);
    }
    /**
     * metodo que permite imprimir los datos del elemento deportivo
     * @param vehiculo1 
     */
  public void imprimirDeportivo(List<Deportivo> vehiculo1){
    if(vehiculo1.isEmpty()){
          System.out.println("No Hay Autos Registrados");
    }else{
      for(Deportivo depor : vehiculo1){
          System.out.println("Codigo del Vehiculo"+ depor.getCodVehiculo()
                  + "\n Marca Vehiculo: "+ depor.getMarca()
                  + "\n Modelo Vehiculo: "+ depor.getModelo()
                  + "\n Color Vehiculo: " + depor.getColor()
                  +"\n Precio Vehiculo: " +depor.getPrecio()
                  + "\n Codigo Deportivo: " +depor.getCodDeportivo()
                  + "\n Cilindraje Deportivo: " +depor.getCilindrje()
                  + "\n Peso Deportivo: " +depor.getPeso()
                  + "\n Fuerza Deportivo: "+depor.getFuerza());
      }
    }
  }
  /**
   * metodo que permite agregar un vehiculo Estandar
   * @param vehiculo2
   * @throws IOException 
   */
    public void agregarEstandar(List<Estandar> vehiculo2) throws IOException{
      
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Estandar datos = new Estandar();
      
      System.out.println("Ingrese el Codigo del vehiculo:");
      datos.setCodVehiculo(Integer.parseInt(br.readLine()));
      System.out.println("Ingrese el Marca del vehiculo:");
      datos.setMarca(br.readLine());
      System.out.println("Ingrese el Modelo del vehiculo:");
      datos.setModelo(br.readLine());
      System.out.println("Ingrese el Color del vehiculo:");
      datos.setColor(br.readLine());
      System.out.println("Ingrese el Precio del vehiculo:");
      datos.setPrecio(br.readLine());
      System.out.println("Ingrese el Codigo del vehiculo Estandar:");
      datos.setCodEstandar(Integer.parseInt(br.readLine()));
      System.out.println("Ingrese la Transmision del vehiculo Estandar:");
      datos.setTransmision(br.readLine());
      System.out.println("Ingrese el numero pasajeros del vehiculo Estandar:");
      datos.setNumPasajeros(Integer.parseInt(br.readLine()));
      vehiculo2.add(datos);
      agregarStock(datos);
    }
    /**
     * metodo que permite imprimir los datos del vehiculo estandar
     * @param vehiculo2 
     */
  public void imprimirEstandar(List<Estandar> vehiculo2){
      if(vehiculo2.isEmpty()){
          System.out.println("No Hay Autos Registrados");
      }else{
        for(Estandar datos : vehiculo2){
          System.out.println("Codigo del Vehiculo"+ datos.getCodVehiculo()
                  + "\n Marca Vehiculo: "+ datos.getMarca()
                  + "\n Modelo Vehiculo: "+ datos.getModelo()
                  + "\n Color Vehiculo: " + datos.getColor()
                  +"\n Precio Vehiculo: " +datos.getPrecio()
                  + "\n Codigo Estandar: " +datos.getCodEstandar()
                  + "\n Trasmision Vehiculo: " +datos.getTransmision()
                  + "\n Numero Pasajeros: " +datos.getNumPasajeros());
        } 
      }
  }
  /**
   * metodo que permite agregar un vehiculo de maquinaria pesada
   * @param vehiculo3
   * @throws IOException 
   */
    public void agregarMaquinaria(List<Maquinaria> vehiculo3) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Maquinaria datos = new Maquinaria();
      
      System.out.println("Ingrese el Codigo del vehiculo:");
      datos.setCodVehiculo(Integer.parseInt(br.readLine()));
      System.out.println("Ingrese el Marca del vehiculo:");
      datos.setMarca(br.readLine());
      System.out.println("Ingrese el Modelo del vehiculo:");
      datos.setModelo(br.readLine());
      System.out.println("Ingrese el Color del vehiculo:");
      datos.setColor(br.readLine());
      System.out.println("Ingrese el Precio del vehiculo:");
      datos.setPrecio(br.readLine());
      System.out.println("Ingrese el Codigo de la Maquinaria:");
      datos.setCodMaquinaria(Integer.parseInt(br.readLine()));
      System.out.println("Ingrese el Tipo de la Maquinaria:");
      datos.setTipo(br.readLine());
      System.out.println("Ingrese el Sub-Tipo de la Maquinaria:");
      datos.setSubTipo(br.readLine());
      System.out.println("Ingrese la potencia de la Maquinaria:");
      datos.setSubTipo(br.readLine());
      vehiculo3.add(datos);
      agregarStock(datos);
    }
    /**
     * metodo que permite imprimir los elemtos de la maquinaria pesada
     * @param vehiculo3 
     */
  public void imprimirMaquinaria(List<Maquinaria> vehiculo3){
      if(vehiculo3.isEmpty()){
          System.out.println("No Hay Autos Registrados");
      }else{
        for(Maquinaria datos : vehiculo3){
          System.out.println("Codigo del Vehiculo"+ datos.getCodVehiculo()
                  + "\n Marca Vehiculo: "+ datos.getMarca()
                  + "\n Modelo Vehiculo: "+ datos.getModelo()
                  + "\n Color Vehiculo: " + datos.getColor()
                  +"\n Precio Vehiculo: " +datos.getPrecio()
                  + "\n Codigo Maquinaria: " +datos.getCodMaquinaria()
                  + "\n Tipo Maquinaria: " +datos.getTipo()
                  + "\n Sub-Tipo Maquinaria: " +datos.getSubTipo()
                  + "\n Potencia Maquinaria: " +datos.getPotencia());
        } 
      }
  }
  /**
   * metodo que permite agregar un vehiculo personalizado
   * @param vehiculo4
   * @throws IOException 
   */
      public void agregarPersonaliados(List<Personalizado> vehiculo4) throws IOException{
      
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Personalizado datos = new Personalizado();
      
      System.out.println("Ingrese el Codigo del vehiculo:");
      datos.setCodVehiculo(Integer.parseInt(br.readLine()));
      System.out.println("Ingrese el Marca del vehiculo:");
      datos.setMarca(br.readLine());
      System.out.println("Ingrese el Modelo del vehiculo:");
      datos.setModelo(br.readLine());
      System.out.println("Ingrese el Color del vehiculo:");
      datos.setColor(br.readLine());
      System.out.println("Ingrese el Precio del vehiculo:");
      datos.setPrecio(br.readLine());
      System.out.println("Ingrese el Codigo del Personalizado:");
      datos.setCodPersonalizado(Integer.parseInt(br.readLine()));
      System.out.println("Ingrese el tipo de asiento:");
      datos.setAsientos(br.readLine());
      System.out.println("Ingrese si los vidrios son electricos o manuales:");
      datos.setVidrios(br.readLine());
      System.out.println("Ingrese el numero de rin:");
      datos.setRines(Integer.parseInt(br.readLine()));
      vehiculo4.add(datos); 
      agregarStock(datos);
    }
      /**
       * metodo que permite imprimir los vehiculos personalizados
       * @param vehiculo4 
       */
  public void imprimirPersonalizado(List<Personalizado> vehiculo4){
      if(vehiculo4.isEmpty()){
          System.out.println("No Hay Autos Registrados");
      }else{
        for(Personalizado datos : vehiculo4){
          System.out.println("Codigo del Vehiculo"+ datos.getCodVehiculo()
                  + "\n Marca Vehiculo: "+ datos.getMarca()
                  + "\n Modelo Vehiculo: "+ datos.getModelo()
                  + "\n Color Vehiculo: " + datos.getColor()
                  +"\n Precio Vehiculo: " +datos.getPrecio()
                  + "\n Codigo Personalizado: " +datos.getCodPersonalizado()
                  + "\n Tipo Asiento: " +datos.getAsientos()
                  + "\n Tipo Vidrios: " +datos.getVidrios()
                  + "\n Numero Rin: " +datos.getRines());
        } 
      }
  }
  /**
   * metodo que permite agregar al inventario los elementos del vehiculo
   * @param vehiculo 
   */
    public void agregarStock(Vehiculo vehiculo){
        auto.add(vehiculo);
    }
    /**
     * metodo que permite realizar la venta del vehiculo
     */
    public void ventaVehiculo(){
        //List<Vehiculo> auto = new ArrayList<Vehiculo>();
        Scanner sn = new Scanner(System.in);
        int codigo;
        char opcion;
        System.out.println("Ingrese el codigo del vehiculo de venta: ");
        codigo = sn.nextInt();
        List<Vehiculo> venta = new ArrayList<>();
        for (Vehiculo cont : auto) {
            if(cont.getCodVehiculo() == codigo){
                System.out.println("El vehiculo que desea vender es: "+cont.getMarca()+" modelo: "+cont.getModelo()+" con un precio de: "+cont.getPrecio());
                System.out.println("¿Es correcto? S/N");
                opcion = sn.next().charAt(0);
                switch(opcion){
                    case 's':{
                        venta.add(cont);
                        comisionVenta(cont);
                        auto.remove(cont);
                        break;
                    }case 'n':{
                        ventaVehiculo();
                        
                    }
                }//switch
            }//if
        }//for  
    }    
    /**
     * metodo que permite saber cual es el carro mas caro del inventario
     */
    public void vehiculoMasCaro(){
        float caro = 0;
        String marca = "";
        if(auto.isEmpty()){
            System.out.println("No hay autos Registrados");
        }else{
            for(Vehiculo cont : auto){
                if(Float.parseFloat(cont.getPrecio())>caro){
                caro = Float.parseFloat(cont.getPrecio());
                marca = cont.getMarca();
                }
            }
        System.out.println("El Vehiculo mas Caro es " +marca+" Con Precio de "+caro);
        }
    }
    /**
     * metodo que permite saber cual es el vehiculo mas barato del inventario
     */
        public void vehiculoMasBarato(){
        float barato = 1999999999;
        String marca = "";
        if(auto.isEmpty()){
            System.out.println("No hay autos Registrados");
        }else{
            for(Vehiculo cont : auto){
                if(Float.parseFloat(cont.getPrecio())<barato){
                barato = Float.parseFloat(cont.getPrecio());
                marca = cont.getMarca();
                }
            }
         System.out.println("El Vehiculo mas Barato es " +marca+" Con Precio de "+barato);
        }
    }
        /**
         * metodo que permite sacar la comision por ventas
         * @param autos 
         */
    public void comisionVenta(Vehiculo autos){
      /*Vendedor vendedor1 = new Vendedor();
        float precio = Float.parseFloat(autos.getPrecio());
        float subtotal = (precio * 0.05f);
        float comision = 0;
        for(Vendedor cont : vendedor){
            comision = cont.getComision();
            }
        float total = comision + subtotal;
        vendedor1.setCodVendedor(1);
        vendedor1.setNombre("Vendedor");
        vendedor1.setComision(total);
        vendedor.add(vendedor1);
        System.out.println("La Comision por la Ventas es: "+vendedor1.getComision());
        System.out.println("La Comision otra por la Ventas es: "+total);*/       
    }
    /**
     * retorna la lista de los vehiculos
     * @return vehicuolo
     */
    public List<Vehiculo> getInventario() {
        return vehiculo;
    }
    /**
     * modifica la lista del inventario
     * @param vehiculo 
     */
    public void setInventario(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }
    /**
     * metodo que retorna el codigo del inventario
     * @return codInventario
     */
    public int getCodInventario() {
        return codInventario;
    }
    /**
     * modifica el codigo del inventario
     * @param codInventario 
     */
    public void setCodInventario(int codInventario) {
        this.codInventario = codInventario;
    }
    /**
     * metodo que retorna la lista de vehiculos
     * @return vehiculo
     */
    public List<Vehiculo> getVehiculo() {
        return vehiculo;
    }
    /**
     * modifica la lista de vehiculos
     * @param vehiculo 
     */
    public void setVehiculo(List<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }
    /**
     * metodo que retorna cantidad
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }
    /**
     * modifica el calor de cantidad
     * @param cantidad 
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    

    
   
    
    
}
