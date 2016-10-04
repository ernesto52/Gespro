package com.tsp.gespro.hibernate.pojo;
// Generated 10/09/2016 08:06:59 PM by Hibernate Tools 4.3.1



/**
 * Punto generated by hbm2java
 */
public class Punto  implements java.io.Serializable {


     private Integer idPunto;
     private Integer idCobertura;
     private String lugar;
     private double longitud;
     private double latitud;
     private String descripcion;
     private int tipo;

    public Punto() {
    }

	
    public Punto(String lugar, double longitud, double latitud, String descripcion, int tipo) {
        this.lugar = lugar;
        this.longitud = longitud;
        this.latitud = latitud;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
    public Punto(Integer idCobertura, String lugar, double longitud, double latitud, String descripcion, int tipo) {
       this.idCobertura = idCobertura;
       this.lugar = lugar;
       this.longitud = longitud;
       this.latitud = latitud;
       this.descripcion = descripcion;
       this.tipo = tipo;
    }
   
    public Integer getIdPunto() {
        return this.idPunto;
    }
    
    public void setIdPunto(Integer idPunto) {
        this.idPunto = idPunto;
    }
    public Integer getIdCobertura() {
        return this.idCobertura;
    }
    
    public void setIdCobertura(Integer idCobertura) {
        this.idCobertura = idCobertura;
    }
    public String getLugar() {
        return this.lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public double getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public double getLatitud() {
        return this.latitud;
    }
    
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getTipo() {
        return this.tipo;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }




}

