package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

public class AutorDAO extends DAO<Autor> {

    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    public void eliminar(Integer id) throws Exception {
        Autor autor = buscarAutorPorId(id);
        super.eliminar(autor);
    }

    public Autor buscarAutorPorId(Integer id) throws Exception {
        conectar();
        Autor autor = em.find(Autor.class, id);
        desconectar();

        return autor;
    }

    public Autor buscarAutorPorNombre(String nombre) throws Exception {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        //Forma mas simplificada ->
        //Autor autor = em.find(Autor.class, email);
        desconectar();

        return autor;
    }

    public List<Autor> listarAutores() throws Exception {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar();

        return autores;

    }
}
