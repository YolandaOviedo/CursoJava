import java.util.Scanner;

class Reto0 {

    private final Scanner scanner = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Reto0 ejecutar = new Reto0 ();
        ejecutar.run();
    }
    
     /**
     *  Este debe ser el único objeto de tipo Scanner en el código
     */
    

    /**
     * Este método es usado para solicitar datos al usuario
     * @return  Lectura de la siguiente linea del teclado
     */
    public float read(){
        return this.scanner.nextFloat();
    }

    /**
     * método principal
     */
    public void run(){

        /*
        solución propuesta
        */
        float recibe1 = read();

        float recibe2 = read();

        System.out.print(sumar(recibe1,recibe2)+" "+multiplicar(recibe1,recibe2));

    }
    public float sumar(float num,float nun1){
        return num+nun1;

    }
    public float multiplicar(float num,float nun1){

        return num*nun1;
    }
}


