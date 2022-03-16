package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {

    private AutorDAO autorDAO;
    private Autor autor;
    private Scanner leer;


    public AutorServicio() {
        this.autorDAO = new AutorDAO();
        this.autor = new Autor();
        this.leer=new Scanner(System.in).useDelimiter("\n");
    }

    public AutorServicio(AutorDAO autorDAO, Autor autor) {
        this.autorDAO = autorDAO;
        this.autor = autor;
    }

    //Negocio
    public List<Autor> buscarAutorPorNombre(String nombre) throws Exception {

        try {
            
            if (nombre==null | nombre.trim().isEmpty()){
                throw new Exception ("INGRESE NOMBRE VALIDO"); 
            }
            
            autor.setNombre(nombre);
            
            List<Autor> autores=new ArrayList(); 
            autores = autorDAO.buscarAutorPorNombre(autor.getNombre());

            return autores;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
