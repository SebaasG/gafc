/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gafc.gafc.controllers;
import com.gafc.gafc.models.instructor;
import com.gafc.gafc.service.implement.instructorService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping (path = "/apiIns")
public class instructorController {
    
    private final instructorService InstructorService;
    
    @Autowired

    public instructorController(instructorService InstructorService) {
        this.InstructorService = InstructorService;
    }

        @GetMapping("/get")
    public ArrayList<instructor> getUsers(){
        return (ArrayList<instructor>) InstructorService.getUsers();
   }
    
@GetMapping("/{docIns}/{conIns}")
public ResponseEntity<ArrayList<String>> InicioSesion(@PathVariable String docIns, @PathVariable String conIns) {
    ArrayList<String> respuesta = this.InstructorService.obtenerDoc(docIns, conIns);
    if (respuesta.isEmpty()) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(respuesta);
    } else {
        
        return ResponseEntity.ok(respuesta);
    }
}
   @PostMapping(path = "/save")
      public void  guardar(@RequestBody instructor saveIns){
     this.InstructorService.guardar(saveIns);
    }
    
    
}
