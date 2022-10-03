/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import java.util.ArrayList;

/**
 *
 * @author willy
 */
public class insertarcliente {
       public static ArrayList insertarCliente(ArrayList lista,cliente cli)
    {
     
      lista.add(cli);
      System.out.println("se añade elemento");
       System.out.println(cli.toString());
      return lista;
      
    }
    
    public static void buscarUsuario(ArrayList lista , String ElementoAbuscar)
    {
      int posicion = lista.indexOf(ElementoAbuscar);
        System.out.println(lista.listIterator(posicion +1));
     
    }
    
    public static void totalIngresos(ArrayList lista)
    {
      
      
    }
            
}
