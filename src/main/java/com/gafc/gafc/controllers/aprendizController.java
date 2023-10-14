package com.gafc.gafc.controllers;

import com.gafc.gafc.models.aprendiz;
import com.gafc.gafc.service.implement.aprendizService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping (path = "/apiApe")
public class aprendizController {
    
    private final aprendizService AprendizService;
    
    @Autowired
    
    public aprendizController(aprendizService AprendizService){
        this.AprendizService = AprendizService;
    }

     @GetMapping("/get")
    public ArrayList<aprendiz> getUsers(){
        return (ArrayList<aprendiz>) AprendizService.getUsers();
   }
    
 @GetMapping("/{codIng}")
public ResponseEntity<ArrayList<String>> obtenerRespuestasRespResPorId(@PathVariable int codIng) {
    ArrayList<String> respuesta = this.AprendizService.obtenerDoc(codIng);
    if (respuesta.isEmpty()) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(respuesta);
    } else {
        return ResponseEntity.ok(respuesta);
    }
}
  
//    @GetMapping(path = "/{docApe}")
//         public Optional<aprendiz> getById(@PathVariable String docApe){
//        return this.AprendizService.getById(docApe);
//    }
         
         @GetMapping(path = "/Cod")
         public ArrayList<Integer> getcode(){
        return (ArrayList<Integer>) AprendizService.getCod();
    }
   
//  @PutMapping(path = "/{docApe}")
//    public aprendiz actualizar(@RequestBody aprendiz request,@PathVariable String docApe){
//        return this.AprendizService.actualizar(request, docApe);
//    }
    
      @PostMapping(path = "/save")
      public void  guardar(@RequestBody aprendiz saveApe){
     this.AprendizService.guardar(saveApe);
    }

      @DeleteMapping(path = "/{docApe}")
    public String eliminar (@PathVariable ("docApe") String docApe){
        boolean ok = this.AprendizService.eliminar(docApe);
        if(ok){
            return "Se elimino correctamente a: "+ docApe +" jeje";
        }else{
            return "El usuario no se pudo borrar";
        }
       
    }
//    @GetMapping("/prueba/{docApe}")
//    public ResponseEntity<List<Integer>> getPruebaValuesPorDocumento(@PathVariable String docApe) {
//        List<Integer> pruebaValues = this.AprendizService.getPruebaValuesPorDocumento(docApe);
//        return ResponseEntity.ok(pruebaValues);
//    }
    
    @GetMapping("/prueba/{docApe}")
public ResponseEntity<Integer> getPruebaByDocApe(@PathVariable String docApe) {
    int prueba = this.AprendizService.getPrueba(docApe);
    
    // Realiza las acciones necesarias con el valor de 'prueba'
    
    return ResponseEntity.ok(prueba);
}

}
