package libreria.servicios;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

public class LibroServicio {

    private LibroDAO libroDAO;

    public LibroServicio() {
        this.libroDAO = new LibroDAO();
    }

    public void crearLibro(String titulo, Integer anio, Autor autor, Editorial editorial,Boolean alta, String ejemplares, String ejemplaresPrestados, String ejemplaresRestantes) throws Exception {

        try {
            if (titulo == null | titulo.trim().isEmpty()) {
                throw new Exception("INGRESE NOMBRE VALIDO");
            }
            if (anio == null) {
                throw new Exception("INGRESE AÑO VALIDO");
            }
            if (ejemplares == null | ejemplares.trim().isEmpty()) {
                throw new Exception("INGRESE NUMERO DE EJEMPLARES");
            }
            if (ejemplaresPrestados== null | ejemplaresPrestados.trim().isEmpty()) {
                throw new Exception("INGRESE NUMERO DE EJEMPLARES PRESTADOS");
            }
            if (ejemplaresRestantes == null | ejemplaresRestantes.trim().isEmpty()) {
                throw new Exception("INGRESE NUMERO DE EJEMPLARES RESTANTES");
            }
            if (autor == null ) {
                throw new Exception("INGRESE NOMBRE DE AUTOR");
            }
            if (editorial== null) {
                throw new Exception("INGRESE NOMBRE DE EDITORIAL");
            }
            if (alta == null & alta!=true & alta!=false) {
                throw new Exception("INGRESE ALTA (true o false)");
            }
            
            Libro libro=new Libro();
            
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAlta(alta);
            
            
            libroDAO.guardar(libro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }

}
