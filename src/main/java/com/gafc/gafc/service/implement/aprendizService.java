package com.gafc.gafc.service.implement;
import com.gafc.gafc.dao.iAprendizDao;
import com.gafc.gafc.models.aprendiz;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class aprendizService {

   private final  iAprendizDao IAprendizDao;
    
    @Autowired
     
    public aprendizService(iAprendizDao IAprendizDao){
        this.IAprendizDao = IAprendizDao;
    }
    
      public ArrayList<String> obtenerDoc(int codIng) {
        return (ArrayList<String>) IAprendizDao.findResulBycode(codIng);
    }
    
   public void guardar(aprendiz saveApe) {
        this.IAprendizDao.save(saveApe);
    }

  public ArrayList<aprendiz> getUsers (){
        
        return (ArrayList<aprendiz>) IAprendizDao.findAll();
    }
  
    public Optional<aprendiz> getById(String docApe){
        return IAprendizDao.findById(docApe);
    }
    
     public ArrayList<Integer> getCod(){
        return (ArrayList<Integer>) IAprendizDao.findcode();
    }
    
//     public aprendiz actualizar(aprendiz request, String docApe){
//        aprendiz user = IAprendizDao.findById(docApe).get();
//        
//        
//        user.setTipPro(request.getTipPro());
//        user.setFecIni(request.getFecIni());
//        user.setCodFic(request.getCodFic());
//     
//        IAprendizDao.save(user);
//        return user;
//    }

    public boolean eliminar(String docApe){
        try {
            IAprendizDao.deleteById(docApe);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
 

//    public List<Integer> getPruebaValuesPorDocumento(String docApe) {
//        // Realiza la consulta SQL para obtener el valor de 'ipv1' para un aprendiz específico
//        List<Integer> pruebaValues = new ArrayList<>();
//        Optional<aprendiz> optionalAprendiz = IAprendizDao.findById(docApe);
//        if (optionalAprendiz.isPresent()) {
//            aprendiz ape = optionalAprendiz.get();
//            pruebaValues.add(ape.isIpv1() ? 1 : 0);
//        }
//        return pruebaValues;
//    }
    
    public int getPrueba(String docApe) {
    return IAprendizDao.findPrueba(docApe);
}



}
