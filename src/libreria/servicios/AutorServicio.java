package libreria.servicios;

import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {

    private AutorDAO autorDAO;

    public AutorServicio() {
        this.autorDAO = new AutorDAO();
    }


    //Negocio
    public void crearAutor(String nombre, Boolean alta) throws Exception {

        try {
            if (nombre == null | nombre.trim().isEmpty()) {
                throw new Exception("INGRESE NOMBRE VALIDO");
            }

            if (alta == null & alta!=true & alta!=false) {
                throw new Exception("INGRESE ALTA VALIDO, true o false");
            }
            
            Autor autor=new Autor(); 
            autor.setNombre(nombre);
            autor.setAlta(alta);
            
            autorDAO.guardar(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }

    public Autor buscarAutorPorNombre(String nombre) throws Exception {

        try {

            if (nombre == null | nombre.trim().isEmpty()) {
                throw new Exception("INGRESE NOMBRE VALIDO");
            }
            
            Autor autor = new Autor(); 
            autor.setNombre(nombre);

            autor = autorDAO.buscarAutorPorNombre(autor.getNombre());

            return autorDAO.buscarAutorPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
