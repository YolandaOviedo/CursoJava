/**
 * Clase que implementa los metodos de una Cuenta
 * Abrir, consignar, retirar y consultar saldo
 * 
 * @author (Miguel Hernandez) 
 * @version (1.0 or a 19-07-2022)
 */
public class Cuenta
{
    /**
     * atributo correspondiente al saldo de la cuenta
     */
    private int saldo;

    /**
     * Apertura de la cuenta con $0
     */
    public Cuenta() {
        // initialise instance variables
        this.saldo = 0;
    }
/**
     * Apertura de la clase con una cantidad determinada
     */
    public Cuenta(int cantidad) {
        // initialise instance variables
        this.saldo = cantidad;
    }

    /**
     * Metodo que incrementa el valor del saludo de acuerdo a 
     * la cantidad consignada
     */

    public void consignar(int cantidad) {
        this.saldo = this.saldo + cantidad;
        //this.saldo += cantidad
    }

    /**
     * Metodo que disminuye el valor del saldo segun 
     * valor de la cantidad retirada
     */

    public void retirar(int cantidad) {
        //this.saldo = this.saldo - cantidad;
        this.saldo -= cantidad;
    }
    
    /**
     * Metodo que retorna el valor del saldo
     */
    
    public int consultarSaldo() {
        return this.saldo;
    }
}
