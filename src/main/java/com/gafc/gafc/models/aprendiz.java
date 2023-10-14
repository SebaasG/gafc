/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gafc.gafc.models;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author defaultsYoungs
 */
@Data
@Entity
@Table (name ="aprendiz")
public class aprendiz implements Serializable{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column (name = "consApe", unique = true)
private int consApe;

@Column (name = "docApe")
private String docApe;

@Column (name = "nomApe")
private String nomApe;

@Column (name = "tipPro")
private String tipPro;

@Column (name = "fecIni")
private String fecIni;

@Column (name = "codFic")
private int codFic;

@Column (name = "codIng")
private int codIng;

@Column (name = "ipv1")
private boolean ipv1;

@Column (name = "ipv2")
private boolean ipv2;

    /**
     * @return the consApe
     */
    public int getConsApe() {
        return consApe;
    }

    /**
     * @param consApe the consApe to set
     */
    public void setConsApe(int consApe) {
        this.consApe = consApe;
    }

    /**
     * @return the docApe
     */
    public String getDocApe() {
        return docApe;
    }

    /**
     * @param docApe the docApe to set
     */
    public void setDocApe(String docApe) {
        this.docApe = docApe;
    }

    /**
     * @return the nomApe
     */
    public String getNomApe() {
        return nomApe;
    }

    /**
     * @param nomApe the nomApe to set
     */
    public void setNomApe(String nomApe) {
        this.nomApe = nomApe;
    }

    /**
     * @return the tipPro
     */
    public String getTipPro() {
        return tipPro;
    }

    /**
     * @param tipPro the tipPro to set
     */
    public void setTipPro(String tipPro) {
        this.tipPro = tipPro;
    }

    /**
     * @return the fecIni
     */
    public String getFecIni() {
        return fecIni;
    }

    /**
     * @param fecIni the fecIni to set
     */
    public void setFecIni(String fecIni) {
        this.fecIni = fecIni;
    }

    /**
     * @return the codFic
     */
    public int getCodFic() {
        return codFic;
    }

    /**
     * @param codFic the codFic to set
     */
    public void setCodFic(int codFic) {
        this.codFic = codFic;
    }

    /**
     * @return the codIng
     */
    public int getCodIng() {
        return codIng;
    }

    /**
     * @param codIng the codIng to set
     */
    public void setCodIng(int codIng) {
        this.codIng = codIng;
    }

    /**
     * @return the ipv1
     */
    public boolean isIpv1() {
        return ipv1;
    }

    /**
     * @param ipv1 the ipv1 to set
     */
    public void setIpv1(boolean ipv1) {
        this.ipv1 = ipv1;
    }

    /**
     * @return the ipv2
     */
    public boolean isIpv2() {
        return ipv2;
    }

    /**
     * @param ipv2 the ipv2 to set
     */
    public void setIpv2(boolean ipv2) {
        this.ipv2 = ipv2;
    }




}
