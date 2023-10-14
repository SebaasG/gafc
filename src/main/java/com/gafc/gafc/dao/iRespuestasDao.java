/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gafc.gafc.dao;
import com.gafc.gafc.models.respuestasXAprendiz;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author defaultsYoungs
 */

@Repository
public interface iRespuestasDao extends JpaRepository<respuestasXAprendiz, String>{
 @Query("SELECT r.respRes FROM respuestasXAprendiz r WHERE r.docApe = docApe and r.codPro =1 ORDER BY r.numPreRes ASC")
    List<String> findRespResByDocApe(@Param("docApe") String docApe);
    
     @Query("SELECT r.respRes FROM respuestasXAprendiz r WHERE r.docApe = docApe and r.codPro =2 ORDER BY r.numPreRes ASC")
    List<String> findRespResByDocApe2(@Param("docApe") String docApe);

}
