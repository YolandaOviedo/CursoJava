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
        HashMap<String, String[]> capitalCities = new HashMap<>();
        capitalCities.put("England", ["London", "Libra"]);
        capitalCities.put("Germany", ["Berlin"]);
        capitalCities.put("Colombia", ["Bogotá"]);
        
        System.out.println(capitalCities);
    }
    
}
