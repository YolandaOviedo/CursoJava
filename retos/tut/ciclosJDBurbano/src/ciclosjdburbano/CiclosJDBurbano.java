/*
 * TUTORÍAS SOBRE BUCLES 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosjdburbano;

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
        //tablasDeMultiplicar(5);
        metodoWhile(10);
    }
    
    public static void tablasDeMultiplicar(int a)
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.println(a + " x " + i + " = " + a * i);
        }
    }
    public static void metodoWhile(int a)
    {
        while(a <= 10)
        {
            System.out.println("El número es igual " + a);
            a++;
        }
    }
    // public static void metodoDoWhile(int a)
    // {

    // }
    // }
}