//primer elemento
/**
 * Clase que implementa las operaciones de una cuenta a saber: apertura, consignacion, retiro y consulta del saldo .
 * 
 * @author (Miguel Hernandez ) 
 * @version (1.0 19-07-2022)
 */
public class Cuenta2
{
    // instance variables - replace the example below with your own
    private int saldo;

    /**
     * Constructor para crear una cuenta con $0
     * */
    public Cuenta2()
    {
        // initialise instance variables
        this.saldo = 0;
    }
    
    /**
     * Constructor para crear una cuenta con una cantidad de dinero que tiene el cliente
     * */
    public Cuenta2(int cantidad)
    {
        // initialise instance variables
        if(cantidad > 0) {
           this.saldo = cantidad;
        } else {
            System.out.println("Error");
        }
    }


// segundo elemento
    
/**
     * Metodo que registrar las transferencias o consignaciones que realiza
     * el cliente
     * 
     * @param  cantidad  
     */
    
    public void consignar(int cantidad)
    {
        if(cantidad > 0) {
            this.saldo = this.saldo + cantidad;
        } else {
            System.out.println("Error");
        }
    }
    
    
    /**
     * Metodo que registrar lo retiros que realiza el cliente
     * 
     * @param  cantidad  
     */
    
    public void retirar(int cantidad)
    {
        if(cantidad > 0 && cantidad <= saldo) {
           this.saldo -= cantidad;
        } else {
             System.out.println("Error");
        }
        
    }
    
    /**
     * Metodo que registrar lo retiros que realiza el cliente
     * 
     * @return saldo
     */
    
    public int consultarSaldo()
    {
       return saldo;
    }  
}

// tercer elemento
/**
 * Clase que prueba la clase Cuenta
 * 
 * @author (Miguel Hernández) 
 * @version (1.0 or a 19-07-2022)
 */

import java.util.Scanner;
public class AppCuenta
{
    // instance variables - replace the example below with your own
    private Cuenta2 unaCuenta;

    /**
     * Creación de una Cuenta
     */
    public AppCuenta()
    {
        this.unaCuenta = new Cuenta2();
    }
    
    /**
     * Metodo de las transacciones (apertura, consignacion, retiro consulta del saldo)
     */
   
 public void realizarTransacciones() {
         int cantidad = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el valor a consignar: ");
        cantidad = sc.nextInt();
        unaCuenta.consignar(cantidad);
        System.out.println("Saldo: "+unaCuenta.consultarSaldo());
        
        
        System.out.println("Digite el valor a retirar: ");
        cantidad = sc.nextInt();
        unaCuenta.retirar(cantidad);
        System.out.println("Saldo: "+unaCuenta.consultarSaldo());
    }
    
    
    public static void main(String []args) {
        AppCuenta app = new AppCuenta();
        app.realizarTransacciones();
    }

}
