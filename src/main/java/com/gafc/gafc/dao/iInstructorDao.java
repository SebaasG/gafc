/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gafc.gafc.dao;

import com.gafc.gafc.models.instructor;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author defaultsYoungs
 */
public interface iInstructorDao extends CrudRepository<instructor, Integer> {
    
@Query("SELECT i.docIns FROM instructor i WHERE i.docIns = :docIns AND i.conIns = :conIns")
List<String> findResulBycode(@Param("docIns") String docIns, @Param("conIns") String conIns);
  
}
