

package libreria;

import libreria.Menu.MenuLibreria;
import libreria.persistencia.DAO;
//import libreria.entidades.Autor;
//import libreria.entidades.Editorial;
//import libreria.entidades.Libro;




public class Libreria {

  
    public static void main(String[] args) throws Exception {
    
        try{

            MenuLibreria menu=new MenuLibreria(); 
            menu.Menu();
            
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error en el sistema por \n"+e.getMessage());
        }
    }

}
