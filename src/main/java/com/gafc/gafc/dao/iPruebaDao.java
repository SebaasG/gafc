/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gafc.gafc.dao;

import com.gafc.gafc.models.pruebaResultados;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Owner
 */
@Repository
public interface iPruebaDao extends  JpaRepository<pruebaResultados, String>{
    
@Query("SELECT r.codResu, r.resu1, r.resu2, r.resu3, r.resu4, r.resu5, r.resu6, r.resu7, r.resu8, r.resu9, r.resu10, r.resu11, r.resu12,fecha FROM pruebaResultados r WHERE r.docApe = :docApe")
List<String> findResulByDocApe(@Param("docApe") String docApe);

   @Transactional
    @Modifying
    @Query(value = "INSERT INTO pruebaresultados(resu1, resu2, resu3, resu4, resu5, resu6, resu7, resu8, resu9, resu10, resu11, resu12, docApe) " +
                   "VALUES (:resu1, :resu2, :resu3, :resu4, :resu5, :resu6, :resu7, :resu8, :resu9, :resu10, :resu11, :resu12, :docApe)",
                   nativeQuery = true)
    void insertarPruebaResultados(
        @Param("resu1") String resu1,
        @Param("resu2") String resu2,
        @Param("resu3") String resu3,
        @Param("resu4") String resu4,
        @Param("resu5") String resu5,
        @Param("resu6") String resu6,
        @Param("resu7") String resu7,
        @Param("resu8") String resu8,
        @Param("resu9") String resu9,
        @Param("resu10") String resu10,
        @Param("resu11") String resu11,
        @Param("resu12") String resu12,
        @Param("docApe") String docApe
    );

}