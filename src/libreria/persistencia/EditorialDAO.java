

package libreria.persistencia;

import java.util.List;
import libreria.entidades.Editorial;


public class EditorialDAO extends DAO<Editorial> {

    @Override 
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }
    
     public void eliminar(Integer id) throws Exception {
        Editorial editorial = buscarPorId(id);
        super.eliminar(editorial);
    }
     
    public Editorial buscarPorId(Integer id) throws Exception{
        conectar(); 
        Editorial editorial=em.find(Editorial.class, id);
        desconectar(); 
        
        return editorial; 
    }
    
     public Editorial buscarEditorialPorNombre(String nombre) throws Exception{
        conectar(); 
        Editorial editorial=(Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre").setParameter("nombre",nombre).getSingleResult(); 
        //Otra forma mas simplificada ->
        // Editorial editorial = em.find(Editorial.class, nombre); 
        desconectar(); 
        
        return editorial;
    }
    
    public List<Editorial> listarEditoriales() throws Exception{
        conectar(); 
        List<Editorial> editoriales=em.createQuery("SELECT e FROM Editorial e").getResultList();
        desconectar(); 
        
        return editoriales; 
        
    }
}
