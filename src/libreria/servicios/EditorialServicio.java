package libreria.servicios;

import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialServicio {

    private EditorialDAO editorialDAO;

    public EditorialServicio() {
        this.editorialDAO = new EditorialDAO();
    }

    public void crearEditorial(String nombre, Boolean alta) throws Exception {

        try {
            if (nombre == null | nombre.trim().isEmpty()) {
                throw new Exception("INGRESE NOMBRE VALIDO");
            }

            if (alta == null & alta != true & alta != false) {
                throw new Exception("INGRESE ALTA VALIDO, true o false");
            }

            Editorial editorial = new Editorial();
            editorial.setNombre(nombre);
            editorial.setAlta(alta);

            editorialDAO.guardar(editorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }

    public Editorial buscarEditorialPorNombre(String nombre) throws Exception {

        try {

            if (nombre == null | nombre.trim().isEmpty()) {
                throw new Exception("INGRESE NOMBRE VALIDO");
            }
            
            Editorial editorial=new Editorial(); 
            editorial.setNombre(nombre);

            editorial = editorialDAO.buscarEditorialPorNombre(editorial.getNombre());

            return editorialDAO.buscarEditorialPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
