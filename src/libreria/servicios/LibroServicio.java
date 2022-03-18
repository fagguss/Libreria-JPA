package libreria.servicios;

import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

public class LibroServicio {
    
    private LibroDAO libroDAO; 
    private Libro libro; 

    public LibroServicio() {
        this.libroDAO = new LibroDAO();
        this.libro = new Libro();
    }
    
    

    public void crearLibro(Libro libro) throws Exception {

        try {
            if (libro.getTitulo() == null | libro.getTitulo().trim().isEmpty()) {
                throw new Exception("INGRESE NOMBRE VALIDO");
            }

//            if (libro.getAnio() == null | libro.getAnio().trim().isEmpty()) {
//                throw new Exception("INGRESE ALTA VALIDO, true o false");
//            }

            libroDAO.guardar(libro);
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw e; 
        }

    }
    
}
