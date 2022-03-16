package libreria.persistencia;

import java.util.ArrayList;
import libreria.entidades.Libro;

public class LibroDAO extends DAO<Libro> {

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(Long ISBN) throws Exception {
        Libro libro = buscarPorISBN(ISBN);
        super.eliminar(libro);
    }

    public Libro buscarPorISBN(Long ISBN) throws Exception {
        conectar();
        Libro libro = em.find(Libro.class, ISBN);
        desconectar();

        return libro;
    }
    
    public ArrayList<Libro> listarLibros() throws Exception{
        conectar(); 
        ArrayList<Libro> libros=(ArrayList<Libro>) em.createQuery("SELECT l FROM Libro l").getResultList(); 
        desconectar(); 
        
        return libros; 
    }

}
