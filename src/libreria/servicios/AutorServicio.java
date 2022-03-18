package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {

    private AutorDAO autorDAO;
    private Autor autor;

    public AutorServicio() {
        this.autorDAO = new AutorDAO();
        this.autor = new Autor();
    }

    public AutorServicio(AutorDAO autorDAO, Autor autor) {
        this.autorDAO = autorDAO;
        this.autor = autor;
    }

    //Negocio
    public void crearAutor(Autor autor) throws Exception {

        try {
            if (autor.getNombre() == null | autor.getNombre().trim().isEmpty()) {
                throw new Exception("INGRESE NOMBRE VALIDO");
            }

//            if (autor.getAlta() == null | autor.getAlta().trim.isEmpty()) {
//                throw new Exception("INGRESE ALTA VALIDO, true o false");
//            }

            autorDAO.guardar(autor);
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw e; 
        }

    }

    public List<Autor> buscarAutorPorNombre(String nombre) throws Exception {

        try {

            if (nombre == null | nombre.trim().isEmpty()) {
                throw new Exception("INGRESE NOMBRE VALIDO");
            }

            autor.setNombre(nombre);

            List<Autor> autores = new ArrayList();
            autores = autorDAO.buscarAutorPorNombre(autor.getNombre());

            return autores;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
