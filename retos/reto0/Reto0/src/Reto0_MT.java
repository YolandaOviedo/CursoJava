import java.util.Scanner;
/*
* Recomendaciones Generales:
*
*    -> El método run() funcionará como nuestro método principal
*    -> No declarar objetos de tipo Scanner, utilizar el método read() para solicitar datos al usuario.
*    -> Si requiere utilizar varias clases, estas NO deben ser tipo public.
*/
class Reto1
{

    /**
    *  Este debe ser el único objeto de tipo Scanner en el código
    */
    private final Scanner scanner = new Scanner(System.in);
    //String[] entradas = scanner.nextLine().split(" ");

    /**
    * Este método es usado para solicitar datos al usuario
    * @return  Lectura de la siguiente linea del teclado
    */
    public String read(){
        return this.scanner.nextLine();
    }

    /**
    * método principal
    */
    public static void main(String[] args) 
    {   
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
        
    public void run()
    {
        /*
        solución propuesta
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
    
    }
