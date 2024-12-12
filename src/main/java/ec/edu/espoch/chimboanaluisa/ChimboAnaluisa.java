/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.chimboanaluisa;

import ec.edu.espoch.chimboanaluisa.compras.Compras;
import ec.edu.espoch.chimboanaluisa.libro.Genero;

/**
 *
 * @author SO-LAB1-PC14
 */
public class ChimboAnaluisa {

    public static void main(String[] args) {
  
       
        Libros libro1 = new Libros("Cien años de soledad", "Gabriel Garcia Marquez", 20.0 , Genero.FICCION);
        Libros libro2 = new Libros("El origen de las especies", "Charles Darwin", 15.0 , Genero.EDUCATIVO);

      
        Clientes clientes = new Clientes("Karen Analuisa", "3604");

     Compras compras = new Compras(clientes, new Libros[]{libro1, libro2});
        compras.mostrarResumen();
                
    }
       }
