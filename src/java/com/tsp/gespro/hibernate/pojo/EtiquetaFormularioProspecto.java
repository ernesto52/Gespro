package com.tsp.gespro.hibernate.pojo;
// Generated 10/09/2016 07:54:03 PM by Hibernate Tools 4.3.1



/**
 * EtiquetaFormularioProspecto generated by hbm2java
 */
public class EtiquetaFormularioProspecto  implements java.io.Serializable {


     private Integer idEtiquetaFormularioProspecto;
     private String campo;
     private Integer idUsuario;
     private String etiqueta;
     private Integer obligatorio;

    public EtiquetaFormularioProspecto() {
    }

    public EtiquetaFormularioProspecto(String campo, Integer idUsuario, String etiqueta, Integer obligatorio) {
       this.campo = campo;
       this.idUsuario = idUsuario;
       this.etiqueta = etiqueta;
       this.obligatorio = obligatorio;
    }
   
    public Integer getIdEtiquetaFormularioProspecto() {
        return this.idEtiquetaFormularioProspecto;
    }
    
    public void setIdEtiquetaFormularioProspecto(Integer idEtiquetaFormularioProspecto) {
        this.idEtiquetaFormularioProspecto = idEtiquetaFormularioProspecto;
    }
    public String getCampo() {
        return this.campo;
    }
    
    public void setCampo(String campo) {
        this.campo = campo;
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
    public Integer getObligatorio() {
        return this.obligatorio;
    }
    
    public void setObligatorio(Integer obligatorio) {
        this.obligatorio = obligatorio;
    }




}


