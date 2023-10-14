/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gafc.gafc.controllers;

import com.gafc.gafc.models.respuestasXAprendiz;
import com.gafc.gafc.service.implement.respuestasService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
    
/**
 *
 * @author defaultsYoungs
 */

@RestController
@RequestMapping (path = "/apiRes")
public class respuestasController {
    
    @Autowired
    private final respuestasService respuestasService;
    
    public respuestasController(respuestasService respuestasService) {
        this.respuestasService = respuestasService;
    }
    
    
  @GetMapping("/{docApe}")
    public List<String> obtenerRespuestasRespResPorId(@PathVariable String docApe) {
        return this.respuestasService.obtenerRespuestasRespResPorId(docApe);
    }
    
    @GetMapping("/2/{docApe}")
    public List<String> obtenerRespuestasRespResPorId2(@PathVariable String docApe) {
        return this.respuestasService.obtenerRespuestasRespResPorId2(docApe);
    }

     @GetMapping("/getRes")
    public ArrayList<respuestasXAprendiz> getRes(){
        return (ArrayList<respuestasXAprendiz>) respuestasService.getRes();
   }
  
      @PostMapping(path = "/saveRes")
      public void  guardar(@RequestBody respuestasXAprendiz saveRes){
     this.respuestasService.guardar(saveRes);
    
    }
}
