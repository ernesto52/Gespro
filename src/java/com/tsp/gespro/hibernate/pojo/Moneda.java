package com.tsp.gespro.hibernate.pojo;
// Generated 10/09/2016 08:02:03 PM by Hibernate Tools 4.3.1



/**
 * Moneda generated by hbm2java
 */
public class Moneda  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String codigo;
     private String simbolo;
     private Boolean activo;

    public Moneda() {
    }

	
    public Moneda(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
    }
    public Moneda(String nombre, String codigo, String simbolo, Boolean activo) {
       this.nombre = nombre;
       this.codigo = codigo;
       this.simbolo = simbolo;
       this.activo = activo;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getSimbolo() {
        return this.simbolo;
    }
    
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    public Boolean getActivo() {
        return this.activo;
    }
    
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }




}

