package com.tsp.gespro.hibernate.pojo;
// Generated 10/09/2016 07:54:03 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CampoAdicionalCliente generated by hbm2java
 */
public class CampoAdicionalCliente  implements java.io.Serializable {


     private Integer idCampoAdicionalCliente;
     private Integer idUsuario;
     private String etiqueta;
     private Integer tipoDato;
     private Integer obligatorio;
     private Set campoAdicionalClienteValors = new HashSet(0);
     private Set campoAdicionalClienteValors_1 = new HashSet(0);

    public CampoAdicionalCliente() {
    }

    public CampoAdicionalCliente(Integer idUsuario, String etiqueta, Integer tipoDato, Integer obligatorio, Set campoAdicionalClienteValors, Set campoAdicionalClienteValors_1) {
       this.idUsuario = idUsuario;
       this.etiqueta = etiqueta;
       this.tipoDato = tipoDato;
       this.obligatorio = obligatorio;
       this.campoAdicionalClienteValors = campoAdicionalClienteValors;
       this.campoAdicionalClienteValors_1 = campoAdicionalClienteValors_1;
    }
   
    public Integer getIdCampoAdicionalCliente() {
        return this.idCampoAdicionalCliente;
    }
    
    public void setIdCampoAdicionalCliente(Integer idCampoAdicionalCliente) {
        this.idCampoAdicionalCliente = idCampoAdicionalCliente;
    }
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getEtiqueta() {
        return this.etiqueta;
    }
    
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    public Integer getTipoDato() {
        return this.tipoDato;
    }
    
    public void setTipoDato(Integer tipoDato) {
        this.tipoDato = tipoDato;
    }
    public Integer getObligatorio() {
        return this.obligatorio;
    }
    
    public void setObligatorio(Integer obligatorio) {
        this.obligatorio = obligatorio;
    }
    public Set getCampoAdicionalClienteValors() {
        return this.campoAdicionalClienteValors;
    }
    
    public void setCampoAdicionalClienteValors(Set campoAdicionalClienteValors) {
        this.campoAdicionalClienteValors = campoAdicionalClienteValors;
    }
    public Set getCampoAdicionalClienteValors_1() {
        return this.campoAdicionalClienteValors_1;
    }
    
    public void setCampoAdicionalClienteValors_1(Set campoAdicionalClienteValors_1) {
        this.campoAdicionalClienteValors_1 = campoAdicionalClienteValors_1;
    }




}

