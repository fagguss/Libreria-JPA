package libreria.servicios;

import java.util.ArrayList;
import java.util.List;

import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialServicio {

    private EditorialDAO editorialDAO;
    private Editorial editorial;

    public EditorialServicio() {
        this.editorialDAO = new EditorialDAO();
        this.editorial = new Editorial();
    }

    public void crearEditorial(Editorial editorial) throws Exception {

        try {
            if (editorial.getNombre() == null | editorial.getNombre().trim().isEmpty()) {
                throw new Exception("INGRESE NOMBRE VALIDO");
            }

//            if (editorial.getAlta() == null | editorial.getAlta().trim().isEmpty()) {
//                throw new Exception("INGRESE ALTA VALIDO, true o false");
//            }

            editorialDAO.guardar(editorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }

    public List<Editorial> buscarEditorialPorNombre(String nombre) throws Exception {

        try {

            if (nombre == null | nombre.trim().isEmpty()) {
                throw new Exception("INGRESE NOMBRE VALIDO");
            }

            editorial.setNombre(nombre);

            List<Editorial> editoriales = new ArrayList();
            editoriales = editorialDAO.buscarEditorialPorNombre(editorial.getNombre());

            return editoriales;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
