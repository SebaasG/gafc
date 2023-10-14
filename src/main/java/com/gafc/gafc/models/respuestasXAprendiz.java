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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author defaultsYoungs
 */
@Data
@Entity
@Table (name ="respuestasXAprendiz")
public class respuestasXAprendiz implements Serializable {
    
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consRes")
    private int consRes;

    @Column(name = "numPreRes")
    private int numPreRes;

    @Column(name = "respRes", length = 10)
    private String respRes;

    @Column(name = "docApe", length = 11)
    private String docApe;

    @Column(name = "codPro")
    private int codPro;

    // Getters y setters

    public int getConsRes() {
        return consRes;
    }

    public void setConsRes(int consRes) {
        this.consRes = consRes;
    }

    public int getNumPreRes() {
        return numPreRes;
    }

    public void setNumPreRes(int numPreRes) {
        this.numPreRes = numPreRes;
    }

    public String getRespRes() {
        return respRes;
    }

    public void setRespRes(String respRes) {
        this.respRes = respRes;
    }

    public String getDocApe() {
        return docApe;
    }

    public void setDocApe(String docApe) {
        this.docApe = docApe;
    }

    public int getCodPro() {
        return codPro;
    }

    public void setCodPro(int codPro) {
        this.codPro = codPro;
    }


        
}
