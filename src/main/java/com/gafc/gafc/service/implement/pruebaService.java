/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gafc.gafc.service.implement;

import com.gafc.gafc.dao.iPruebaDao;
import com.gafc.gafc.models.pruebaResultados;
import com.gafc.gafc.models.respuestasXAprendiz;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Owner
 */
@Service
public class pruebaService {
    
    private final iPruebaDao iPruebaDao;
   
    @Autowired
    
    public pruebaService(iPruebaDao iPruebaDao) {
        this.iPruebaDao = iPruebaDao;
    }


    public List<String> obtenerResultados(String docApe) {
        return (ArrayList<String>) iPruebaDao.findResulByDocApe(docApe);
    }
    
//        public void guardar(pruebaResultados saveRes) {
//        this.iPruebaDao.save(saveRes);
//    }
    
     public void insertarPruebaResultados(
        String resu1,
        String resu2,
        String resu3,
        String resu4,
        String resu5,
        String resu6,
        String resu7,
        String resu8,
        String resu9,
        String resu10,
        String resu11,
        String resu12,
        String docApe
    ) {
        iPruebaDao.insertarPruebaResultados(
            resu1,
            resu2,
            resu3,
            resu4,
            resu5,
            resu6,
            resu7,
            resu8,
            resu9,
            resu10,
            resu11,
            resu12,
            docApe
        );
    }
        
          public List<pruebaResultados> getRes (){
        return (ArrayList<pruebaResultados>) iPruebaDao.findAll();
    }
          
          

}
