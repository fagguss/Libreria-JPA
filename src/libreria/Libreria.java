

package libreria;

import libreria.Menu.MenuLibreria;
import libreria.persistencia.DAO;
//import libreria.entidades.Autor;
//import libreria.entidades.Editorial;
//import libreria.entidades.Libro;




public class Libreria {

  
    public static void main(String[] args) throws Exception {
    
        try{
           
          

//            DAO dao = new DAO(); 
//            dao.getClass();
            
//            Autor autor=new Autor(1, "JK Rowling", false);
//            Editorial editorial=new Editorial(3, "Palos", false);
//            Libro libro=new Libro(256, "Harry Potter", 2001, 3, 0, 3, false, autor,editorial); 
            
            MenuLibreria menu=new MenuLibreria(); 
            menu.Menu();
            
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error en el sistema por \n"+e.getMessage());
        }
    }

}
