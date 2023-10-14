/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gafc.gafc.dao;

import com.gafc.gafc.models.aprendiz;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author deafultsYoungs
 */

@Repository
public interface iAprendizDao extends JpaRepository<aprendiz, String> {
    @Query("SELECT r.codIng FROM aprendiz r")
    ArrayList<Integer> findcode();
    
      @Query("SELECT r.docApe FROM aprendiz r WHERE r.codIng = :codIng")
    List<String> findResulBycode(@Param("codIng") int codIng);
    
    @Query("SELECT CASE WHEN r.ipv1 = 1 AND r.ipv2 = 1 THEN 1 "
       + "WHEN r.ipv1 = 1 AND r.ipv2 = 0 THEN 2 "
       + "WHEN r.ipv1 = 0 AND r.ipv2 = 1 THEN 3 "
       + "ELSE 0 END AS prueba FROM aprendiz r WHERE r.docApe = :docApe")
int findPrueba(@Param("docApe") String docApe);

  
}
