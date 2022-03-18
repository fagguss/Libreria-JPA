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
        Autor autor = new Autor();
        System.out.println("********AUTOR NUEVO*******");
        System.out.print("Nombre completo: ");
        autor.setNombre(leer.next());
        System.out.print("Alta: ");
        autor.setAlta(leer.nextBoolean());

        autorServicio.crearAutor(autor);

    }

    public void crearEditorial() throws Exception {
        Editorial editorial = new Editorial();
        System.out.println("********EDITORIAL NUEVA*******");
        System.out.print("Nombre completo: ");
        editorial.setNombre(leer.next());
        System.out.print("Alta: ");
        editorial.setAlta(leer.nextBoolean());

        editorialServicio.crearEditorial(editorial);

    }

    public void crearLibro() throws Exception {
        Libro libro = new Libro();
        System.out.println("*****LIBRO NUEVO******");
        System.out.print("TITULO COMPLETO: ");
        libro.setTitulo(leer.next());
        System.out.print("AÑO DE PUBLICACIÓN: ");
        libro.setAnio(leer.nextInt());

        System.out.print("AUTOR: ");
        String autorNombre = leer.next();
        libro.setAutor((Autor) autorServicio.buscarAutorPorNombre(autorNombre));

        System.out.print("EDITORIAL: ");
        String editorialNombre = leer.next();
        libro.setEditorial((Editorial) editorialServicio.buscarEditorialPorNombre(editorialNombre));

        System.out.print("ALTA: ");
        libro.setAlta(leer.nextBoolean());
        System.out.print("EJEMPLARES: ");
        libro.setEjemplares(leer.nextInt());
        System.out.print("EJEMPLARES PRESTADOS: ");
        libro.setEjemplaresPrestados(leer.nextInt());
        System.out.print("EJEMPLARES RESTANTES: ");
        libro.setEjemplaresRestantes(leer.nextInt());

        libroServicio.crearLibro(libro);

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
