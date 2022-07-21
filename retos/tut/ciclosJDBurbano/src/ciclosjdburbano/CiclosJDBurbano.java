/*
 * TUTORÍAS SOBRE BUCLES 
 * HAY FALLAS EN LOS GIT PULL
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosjdburbano;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author jjben
 */
public class CiclosJDBurbano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        int valor = lector.nextInt();
        tablasDeMultiplicar(valor);
        // metodoWhile(6);
        // metodoDoWhile(11);
        //bucleHashMap();
    }
    
    public static void tablasDeMultiplicar(int a)
    {
        for(int i = 0; i <= 10; i+=2)
        {
            System.out.println(a + " x " + i + " = " + a * i);
        }
    }
    public static void metodoWhile(int a)
    {
        while(a <= 10)
        {
            System.out.println("El número es igual " + a);
            a+=2;
        }
    }
    public static void metodoDoWhile(int a)
    {
        do
        {
            System.out.println("El número es = " + a);
            a++;
        }
        while(a>5 && a<10);
    }
    public static void bucleHashMap()
    {
        HashMap<String, Integer> contenedor = new HashMap<>();

        contenedor.put("Elemento 1", 1);
        contenedor.put("Elemento 2", 2);
        contenedor.put("Elemento 3", 3);
        contenedor.put("Elemento 4", 4);
        contenedor.put("Elemento 5", 5);

        for(String key:contenedor.keySet())
        {
            int valor = contenedor.get(key);
            System.out.println("Valor = " + valor);
        }

    }
}