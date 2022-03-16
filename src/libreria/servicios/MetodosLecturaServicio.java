package libreria.servicios;

import java.util.Scanner;

public class MetodosLecturaServicio {

    private AutorServicio autorServicio;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public MetodosLecturaServicio() {
        this.autorServicio = new AutorServicio();
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
