/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gafc.gafc.service.implement;
import com.gafc.gafc.dao.iInstructorDao;
import com.gafc.gafc.models.aprendiz;
import com.gafc.gafc.models.instructor;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author defaultsYoungs
 */

@Service
public class instructorService {
    
       private final  iInstructorDao iInstructorDao;
    
    @Autowired

    public instructorService(iInstructorDao iInstructorDao) {
        this.iInstructorDao = iInstructorDao;
    }
    
      public ArrayList<instructor> getUsers(){
      return (ArrayList<instructor>) iInstructorDao.findAll();
    }
    
      public void guardar(instructor saveIns) {
        this.iInstructorDao.save(saveIns);
    }
      
 public ArrayList<String> obtenerDoc(String docIns, String conIns) {
    return (ArrayList<String>) iInstructorDao.findResulBycode(docIns, conIns);
}

    
}
