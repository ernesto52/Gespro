package com.tsp.gespro.hibernate.pojo;
// Generated 10/09/2016 07:52:44 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ConceptoRegistroFotografico generated by hbm2java
 */
public class ConceptoRegistroFotografico  implements java.io.Serializable {


     private Integer idRegistro;
     private int idEmpresa;
     private int idConcepto;
     private Integer idCliente;
     private Integer idUsuario;
     private Integer idTipoFoto;
     private Integer idEstatus;
     private String nombreFoto;
     private String comentario;
     private Date fechaHora;

    public ConceptoRegistroFotografico() {
    }

	
    public ConceptoRegistroFotografico(int idEmpresa, int idConcepto) {
        this.idEmpresa = idEmpresa;
        this.idConcepto = idConcepto;
    }
    public ConceptoRegistroFotografico(int idEmpresa, int idConcepto, Integer idCliente, Integer idUsuario, Integer idTipoFoto, Integer idEstatus, String nombreFoto, String comentario, Date fechaHora) {
       this.idEmpresa = idEmpresa;
       this.idConcepto = idConcepto;
       this.idCliente = idCliente;
       this.idUsuario = idUsuario;
       this.idTipoFoto = idTipoFoto;
       this.idEstatus = idEstatus;
       this.nombreFoto = nombreFoto;
       this.comentario = comentario;
       this.fechaHora = fechaHora;
    }
   
    public Integer getIdRegistro() {
        return this.idRegistro;
    }
    
    public void setIdRegistro(Integer idRegistro) {
        this.idRegistro = idRegistro;
    }
    public int getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public int getIdConcepto() {
        return this.idConcepto;
    }
    
    public void setIdConcepto(int idConcepto) {
        this.idConcepto = idConcepto;
    }
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Integer getIdTipoFoto() {
        return this.idTipoFoto;
    }
    
    public void setIdTipoFoto(Integer idTipoFoto) {
        this.idTipoFoto = idTipoFoto;
    }
    public Integer getIdEstatus() {
        return this.idEstatus;
    }
    
    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }
    public String getNombreFoto() {
        return this.nombreFoto;
    }
    
    public void setNombreFoto(String nombreFoto) {
        this.nombreFoto = nombreFoto;
    }
    public String getComentario() {
        return this.comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public Date getFechaHora() {
        return this.fechaHora;
    }
    
    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }




}


