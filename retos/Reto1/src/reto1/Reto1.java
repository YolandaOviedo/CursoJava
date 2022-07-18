/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;
import java.util.Scanner;
/**
 *
 * @author jjben
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static String Calcular_Riesgo(double imc, int edad)
    {
        String riesgo = "";
        if (imc < 22 && edad < 45)riesgo = "Bajo";
        if (imc < 22 && edad >= 45)riesgo = "Medio";
        if (imc >= 22 && edad < 45)riesgo = "Medio";
        if (imc >= 22 && edad >= 45)riesgo = "Alto";
        return riesgo;
    }
    
    public static double Calcular_IMC(double masa, double altura)
    {
        double IMC = masa / (altura * altura);
        return IMC;
    }
    
    public static boolean validacion(double masa, double altura, int edad)
    {
        if ((masa<0||masa>150)||(altura< 0.1||altura>2.5)||(edad<0||edad>110))
        {
            return false;
        }
        return true;
    }
    
    public static String Casos_Pruebas()
    {
        String prueba = 
                "ERROR\t\tENTRADA\t\tSALIDA\n" +
"190 1.60 100\t73.1 1.65 35 \t26.9 Medio \n" +
"0 0 0\t\t73 1.65 45 \t26.8 Alto \n" +
"-1 -1 -1\t73 1.65 44 \t26.8 Medio \n" +
"\t\t69.2 1.61 32 \t26.7 Medio\n";
        
        return prueba;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(Casos_Pruebas());
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String[] entradas = sc.nextLine().split(" ");
        
        double masa = Double.parseDouble(entradas[0]);
        double altura = Double.parseDouble(entradas[1]);
        int edad = Integer.parseInt(entradas[2]);
        
        double imc = Calcular_IMC(masa, altura);
        
        if (validacion(masa,altura,edad))
        {
            System.out.println(String.format("%.1f", imc) + " " + Calcular_Riesgo(imc,edad));   
        }
        else
        {
            System.out.println("ERROR");
        }
    }            
}
