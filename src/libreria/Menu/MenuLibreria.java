package libreria.Menu;

import java.util.Scanner;
import libreria.servicios.MetodosLecturaServicio;

public class MenuLibreria {

    private MetodosLecturaServicio lecturaServicio; 

    public MenuLibreria() {
        this.lecturaServicio=new MetodosLecturaServicio(); 
    }


    public void Menu() throws Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
            int opc=0;

            do {
                System.out.println("********MENU*******");
                System.out.println("1.Crear los métodos para dar de alta/bajo o editar dichas entidades. \n"
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

                        break;
                    case 2:
                        System.out.println("");
                        lecturaServicio.buscarAutorPorNombre();
                        break;
                    case 3:
                        System.out.println("");

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
