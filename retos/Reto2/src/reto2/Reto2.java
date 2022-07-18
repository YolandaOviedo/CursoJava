/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

import java.util.HashMap;

/**
 *
 * @author jjben
 */
public class Reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<int, ArrayList> listaProductos = new HashMap<int, ArrayList>();
        listaProductos.put(1, ["Manzanas", 5000.0, 25]);
        listaProductos.put(2, ["Limones", 2300.0, 15]);
        listaProductos.put(3, ["Peras", 2700.0, 33]);
        listaProductos.put(4, ["Arandanos", 9300.0, 5]);
        


        System.out.println(listaProductos);
    }
    
}
