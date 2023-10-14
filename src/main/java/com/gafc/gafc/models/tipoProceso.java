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
import lombok.Data;

/**
 *
 * @author defaultsYoungs
 */
@Data
@Entity 
@Table (name ="tipoProceso")

public class tipoProceso implements Serializable{
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column (name = "codPro")
private Integer codPro;

@Column (name = "nomPro")
private String nomPro;

@Column (name = "despro")
private String despro;

//Encapsulación


    //@return the codPro
    public Integer getCodPro() {
        return codPro;
    }
    //@param codPro the codPro to set
    public void setCodPro(Integer codPro) {
        this.codPro = codPro;
    }
    //@return the nomPro
    public String getNomPro() {
        return nomPro;
    }
    //@param nomPro the nomPro to set
    public void setNomPro(String nomPro) {
        this.nomPro = nomPro;
    }
    //@return the despro
    public String getDespro() {
        return despro;
    }
    //@param despro the despro to set
    public void setDespro(String despro) {
        this.despro = despro;
    }
    

}
