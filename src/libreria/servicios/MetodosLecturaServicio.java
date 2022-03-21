package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

public class MetodosLecturaServicio {

    private AutorServicio autorServicio;
    private EditorialServicio editorialServicio;
    private LibroServicio libroServicio;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public MetodosLecturaServicio() {
        this.autorServicio = new AutorServicio();
        this.editorialServicio = new EditorialServicio();
        this.libroServicio = new LibroServicio();

    }

    public void crearAutor() throws Exception {

        System.out.println("********AUTOR NUEVO*******");
        System.out.print("Nombre completo: ");
        String nombre = leer.next();
        System.out.print("Alta: ");
        Boolean alta = leer.nextBoolean();

        autorServicio.crearAutor(nombre, alta);

    }

//    public void crearAutor() throws Exception {
//        Autor autor = new Autor();
//        System.out.println("********AUTOR NUEVO*******");
//        System.out.print("Nombre completo: ");
//        autor.setNombre(leer.next());
//        System.out.print("Alta: ");
//        autor.setAlta(leer.nextBoolean());
//
//        autorServicio.crearAutor(autor);
//
//    }
    public void crearEditorial() throws Exception {

        System.out.println("********EDITORIAL NUEVA*******");
        System.out.print("Nombre completo: ");
        String nombre = leer.next();
        System.out.print("Alta: ");
        Boolean alta = leer.nextBoolean();

        editorialServicio.crearEditorial(nombre, alta);

    }

    public void crearLibro() throws Exception {
        System.out.println("*****LIBRO NUEVO******");
        System.out.print("TITULO COMPLETO: ");
        String titulo = leer.next();
        System.out.print("AÑO DE PUBLICACIÓN: ");
        Integer anio = leer.nextInt();

        System.out.print("AUTOR: ");
        String autorNombre = leer.next();
        Autor autor=autorServicio.buscarAutorPorNombre(autorNombre);

        System.out.print("EDITORIAL: ");
        String editorialNombre = leer.next();
        Editorial editorial=editorialServicio.buscarEditorialPorNombre(editorialNombre);

        System.out.print("ALTA: ");
        Boolean alta=leer.nextBoolean(); 
        System.out.print("EJEMPLARES: ");
        String ejemplares=leer.next();
        System.out.print("EJEMPLARES PRESTADOS: ");
        String ejemplaresPrestados=leer.next(); 
        System.out.print("EJEMPLARES RESTANTES: ");
        String ejemplaresRestantes =leer.next(); 

        libroServicio.crearLibro(titulo,anio,autor,editorial,alta,ejemplares,ejemplaresPrestados,ejemplaresRestantes);

    }

    public void buscarAutorPorNombre() throws Exception {

        try {
            System.out.println("****BUSQUEDA DE AUTOR POR NOMBRE****");
            System.out.print("Ingrese nombre del autor: ");
            String nombre = leer.next();

            autorServicio.buscarAutorPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
