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
 * @author defaultsYoungs
 */

@Entity
@Table (name ="instructor")
public class instructor implements Serializable{
 
@Id
@Column (name = "docIns")
private String docIns;

@Column (name = "nomIns")
private String nomIns;

@Column (name = "conIns")
private String conIns;


//ENCAPSULACIÓN 

    /**
     * @return the docIns
     */
    public String getDocIns() {
        return docIns;
    }

    /**
     * @param docIns the docIns to set
     */
    public void setDocIns(String docIns) {
        this.docIns = docIns;
    }

    /**
     * @return the nomIns
     */
    public String getNomIns() {
        return nomIns;
    }

    /**
     * @param nomIns the nomIns to set
     */
    public void setNomIns(String nomIns) {
        this.nomIns = nomIns;
    }

    /**
     * @return the conIns
     */
    public String getConIns() {
        return conIns;
    }

    /**
     * @param conIns the conIns to set
     */
    public void setConIns(String conIns) {
        this.conIns = conIns;
    }


}
