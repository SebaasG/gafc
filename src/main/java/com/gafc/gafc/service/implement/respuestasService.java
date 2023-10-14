/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gafc.gafc.service.implement;
import com.gafc.gafc.dao.iRespuestasDao;
import com.gafc.gafc.models.respuestasXAprendiz;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author defaultsYoungs
 */
@Service
public class respuestasService {
    
     private final iRespuestasDao iRespuestasDao;

    public respuestasService(iRespuestasDao iRespuestasDao) {
        this.iRespuestasDao = iRespuestasDao;
    }
    
     public ArrayList<respuestasXAprendiz> getRes (){
        return (ArrayList<respuestasXAprendiz>) iRespuestasDao.findAll();
    }
     
     public void guardar(respuestasXAprendiz saveRes) {
        this.iRespuestasDao.save(saveRes);
    }
     
     public List<String> obtenerRespuestasRespResPorId(String docApe) {
        return iRespuestasDao.findRespResByDocApe(docApe);
    }
     
     public List<String> obtenerRespuestasRespResPorId2(String docApe) {
        return iRespuestasDao.findRespResByDocApe2(docApe);
    }
     

}


