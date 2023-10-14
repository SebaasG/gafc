/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gafc.gafc.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Sena CSET
 */

@Entity
@Table (name = "resultadosXAprendiz") 

public class resultadosXAprendiz implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "codRsl")
    private Integer codRsl;
    
    @Column (name= "desRsl")
    private String desRsl;
    
    @Column (name = "resRes")
    private Integer resRes;
    
    @Column (name = "docApe")
    private String docApe;
    
    @Column (name = "codPro")
    private Integer codPro;

    //Encapsulación 
    
    //@return the codRsl
    public Integer getCodRsl() {
        return codRsl;
    }
    //@param codRsl the codRsl to set 
    public void setCodRsl(Integer codRsl) {
        this.codRsl = codRsl;
    }
    //@return desRsl
    public String getDesRsl() {
        return desRsl;
    }
    //@param desRsl the desRsl to set 
    public void setDesRsl(String desRsl) {
        this.desRsl = desRsl;
    }
     //@return desRsl
    public Integer getResRes() {
        return resRes;
    }
    //@param desRsl the desRsl to set 
    public void setResRes(Integer resRes) {
        this.resRes = resRes;
    }

    public String getDocApe() {
        return docApe;
    }

    public void setDocApe(String docApe) {
        this.docApe = docApe;
    }

    public Integer getCodPro() {
        return codPro;
    }

    public void setCodPro(Integer codPro) {
        this.codPro = codPro;
    }
    
    
    
}
