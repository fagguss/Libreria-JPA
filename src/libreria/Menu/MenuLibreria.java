package libreria.Menu;

import java.util.Scanner;

import libreria.servicios.MetodosLecturaServicio;

public class MenuLibreria {

    private MetodosLecturaServicio lecturaServicio;

    public MenuLibreria() {
        this.lecturaServicio = new MetodosLecturaServicio();

    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void Menu() throws Exception {

        try {
            int opc = 0;

            do {
                System.out.println("********MENU*******");
                System.out.println("1.Ingresar libro. \n"
                        + "2.Crear un autor. \n"
                        + "3.Crear una editorial. \n"
                        + "2.Búsqueda de un Autor por nombre. \n"
                        + "3.Búsqueda de un libro por ISBN. \n"
                        + "4.Búsqueda de un libro por Título. \n"
                        + "5.Búsqueda de un libro/s por nombre de Autor. \n"
                        + "6.Búsqueda de un libro/s por nombre de Editorial. \n"
                        + "7.Finalizar.");
                System.out.print("Elige una opcion que desea realizar: ");
                opc = leer.nextInt();

                switch (opc) {
                    case 1:
                        System.out.println("");
                        lecturaServicio.crearLibro();
                        break;
                    case 2:
                        System.out.println("");
                        lecturaServicio.crearAutor();
                        break;
                    case 3:
                        System.out.println("");
                        lecturaServicio.crearEditorial();
                        break;
                    case 4:
                        System.out.println("");

                        break;
                    case 5:
                        System.out.println("");

                        break;
                    case 6:
                        System.out.println("");

                        break;
                    case 7:
                        System.out.println("Hasta luego, finalizo operacion :)");
                        break;
                }

            } while (opc != 7);

        } catch (Exception e) {
            throw e;

        }
    }
}
