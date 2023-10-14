/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gafc.gafc.models;

import java.security.Timestamp;
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

@Entity
@Table (name ="pruebaResultados")
public class pruebaResultados {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "codResu")
    private Integer codResu;
    
    @Column (name= "resu1")
    private String resu1;
    
    @Column (name = "resu2")
    private String resu2;
    
    @Column (name = "resu3")
    private String resu3;
    
    @Column (name = "resu4")
    private String resu4;
    
    @Column (name = "resu5")
    private String resu5;
    
    @Column (name = "resu6")
    private String resu6;
    
    @Column (name = "resu7")
    private String resu7;
    
    @Column (name = "resu8")
    private String resu8;
    
    @Column (name = "resu9")
    private String resu9;
    
    @Column (name = "resu10")
    private String resu10;
    
    @Column (name = "resu11")
    private String resu11;
    
    @Column (name = "resu12")
    private String resu12;

    @Column (name = "docApe")
    private String docApe;
    
    @Column (name = "fecha")
    private Date fecha;

    /**
     * @return the codResu
     */
    public Integer getCodResu() {
        return codResu;
    }

    /**
     * @param codResu the codResu to set
     */
    public void setCodResu(Integer codResu) {
        this.codResu = codResu;
    }

    /**
     * @return the resu1
     */
    public String getResu1() {
        return resu1;
    }

    /**
     * @param resu1 the resu1 to set
     */
    public void setResu1(String resu1) {
        this.resu1 = resu1;
    }

    /**
     * @return the resu2
     */
    public String getResu2() {
        return resu2;
    }

    /**
     * @param resu2 the resu2 to set
     */
    public void setResu2(String resu2) {
        this.resu2 = resu2;
    }

    /**
     * @return the resu3
     */
    public String getResu3() {
        return resu3;
    }

    /**
     * @param resu3 the resu3 to set
     */
    public void setResu3(String resu3) {
        this.resu3 = resu3;
    }

    /**
     * @return the resu4
     */
    public String getResu4() {
        return resu4;
    }

    /**
     * @param resu4 the resu4 to set
     */
    public void setResu4(String resu4) {
        this.resu4 = resu4;
    }

    /**
     * @return the resu5
     */
    public String getResu5() {
        return resu5;
    }

    /**
     * @param resu5 the resu5 to set
     */
    public void setResu5(String resu5) {
        this.resu5 = resu5;
    }

    /**
     * @return the resu6
     */
    public String getResu6() {
        return resu6;
    }

    /**
     * @param resu6 the resu6 to set
     */
    public void setResu6(String resu6) {
        this.resu6 = resu6;
    }

    /**
     * @return the resu7
     */
    public String getResu7() {
        return resu7;
    }

    /**
     * @param resu7 the resu7 to set
     */
    public void setResu7(String resu7) {
        this.resu7 = resu7;
    }

    /**
     * @return the resu8
     */
    public String getResu8() {
        return resu8;
    }

    /**
     * @param resu8 the resu8 to set
     */
    public void setResu8(String resu8) {
        this.resu8 = resu8;
    }

    /**
     * @return the resu9
     */
    public String getResu9() {
        return resu9;
    }

    /**
     * @param resu9 the resu9 to set
     */
    public void setResu9(String resu9) {
        this.resu9 = resu9;
    }

    /**
     * @return the resu10
     */
    public String getResu10() {
        return resu10;
    }

    /**
     * @param resu10 the resu10 to set
     */
    public void setResu10(String resu10) {
        this.resu10 = resu10;
    }

    /**
     * @return the resu11
     */
    public String getResu11() {
        return resu11;
    }

    /**
     * @param resu11 the resu11 to set
     */
    public void setResu11(String resu11) {
        this.resu11 = resu11;
    }

    /**
     * @return the resu12
     */
    public String getResu12() {
        return resu12;
    }

    /**
     * @param resu12 the resu12 to set
     */
    public void setResu12(String resu12) {
        this.resu12 = resu12;
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
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
