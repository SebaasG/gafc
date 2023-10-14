/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gafc.gafc.controllers;

import com.gafc.gafc.models.pruebaResultados;
import com.gafc.gafc.service.implement.pruebaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author defaultsYoungs
 */
@RestController
@RequestMapping (path = "/apiPrue")
public class pruebaController {
    
    private final pruebaService pruebaService;
    
     @Autowired
    public pruebaController(pruebaService pruebaService) {
        this.pruebaService = pruebaService;
    }

    @GetMapping("/{docApe}")
    public List<String> obtenerRespuestasRespResPorId(@PathVariable String docApe) {
        return this.pruebaService.obtenerResultados(docApe);
    }
    
      @GetMapping("/get")
    public List<pruebaResultados> getRes(){
        return (ArrayList<pruebaResultados>) pruebaService.getRes();
   }
    
//       @PostMapping(path = "/saveRes")
//      public void  guardar(@RequestBody pruebaResultados saveRes){
//     this.pruebaService.guardar(saveRes);
//      }
    
     @PostMapping(path = "/saveRes")
    public void insertarPruebaResultados(
        @RequestParam String resu1,
        @RequestParam String resu2,
        @RequestParam String resu3,
        @RequestParam String resu4,
        @RequestParam String resu5,
        @RequestParam String resu6,
        @RequestParam String resu7,
        @RequestParam String resu8,
        @RequestParam String resu9,
        @RequestParam String resu10,
        @RequestParam String resu11,
        @RequestParam String resu12,
        @RequestParam String docApe
    ) {
        pruebaService.insertarPruebaResultados(
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
}
