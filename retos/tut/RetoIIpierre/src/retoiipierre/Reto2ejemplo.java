package retoiipierre;

import java.util.HashMap;
import java.util.Scanner;

public class Reto2ejemplo
{
    Scanner scanner = new Scanner(System.in);

    public void run()
    {
        String operacion = scanner.nextLine();
        String[] datos = scanner.nextLine().split(" ");
        BaseDatosProductos base = new BaseDatosProductos();

        Producto p = new Producto(
            Integer.parseInt(datos[0]), 
            datos[1],
            Double.parseDouble(datos[2]), 
            Integer.parseInt(datos[3]));
        
        if(operacion.equals("AGREGAR") && !base.verificarExistencia(p))
        {
            base.agregar(p);
            System.out.println(base.generarInforme());
        } 
        else if(operacion.equals("ACTUALIZAR") && base.verificarExistencia(p))
        {
            base.actualizar(p);
            System.out.println(base.generarInforme());
        }
        else if(operacion.equals("BORRAR") && base.verificarExistencia(p))
        {
            base.eliminar(p);
            System.out.println(base.generarInforme());
        }
        else {
            System.out.println("ERROR");
        }
    }
    
}

class BaseDatosProductos 
{
    HashMap<Integer, Producto> listaProductos = new HashMap<Integer, Producto>();
    
    BaseDatosProductos()
    {
        listaProductos.put(1, new Producto(1, "Manzanas", 5000.0, 25));
        listaProductos.put(2, new Producto(2, "Limones", 2300.0, 15));
        listaProductos.put(3, new Producto(3, "Peras", 2700.0, 33));
        listaProductos.put(4, new Producto(4, "Arandanos", 9300.0, 5));
        listaProductos.put(5, new Producto(5, "Tomates", 2100.0, 42));
        listaProductos.put(6, new Producto(6, "Fresas", 4100.0, 3));
        listaProductos.put(7, new Producto(7, "Helado", 4500.0, 41));
        listaProductos.put(8, new Producto(8, "Galletas", 500.0, 8));
        listaProductos.put(9, new Producto(9, "Chocolates", 3500.0, 80));
        listaProductos.put(10, new Producto(10, "Jamon", 15000.0, 10));
    }

    public void agregar(Producto p)
    {
        listaProductos.put(p.getCodigo(), p);
    }
    
    public void actualizar(Producto p)
    {
        listaProductos.replace(p.getCodigo(), p);
    }
    public void eliminar(Producto p)
    {
        //listaProductos.remove(p.getCodigo(), p);
        listaProductos.remove(p.getCodigo());
    }

    public boolean verificarExistencia(Producto p)
    {
        return listaProductos.containsKey(p.getCodigo());

    }

    public double generarInforme()
    {
        double subtotal = 0.0;
        for( Producto p:listaProductos.values() )
        {
            subtotal += (p.getPrecio() * p.getInventario());

        }
        return subtotal;
    }
}
/**
 * Clase Producto con sus atributos y metodos
 */
class Producto 
{
    /**
     * Atributos de la clase Producto:
     * codigo, nombre, precio, inventario
     */
    private Integer codigo;
    private String nombre;
    private Double precio;
    private Integer inventario;

    /**
     * Metodo constructor
     * @return
     */
    Producto(Integer codigo, String nombre, Double precio, Integer inventario)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    /**
     * Getter y Setter
     */
    public Integer getCodigo()
    {
        return codigo;
    }
    public void setCodigo(Integer codigo)
    {
        this.codigo = codigo;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public Double getPrecio()
    {
        return precio;
    }
    public void setPrecio(Double precio)
    {
        this.precio = precio;
    }
    public Integer getInventario()
    {
        return inventario;
    }
    public void setInventario(Integer inventario)
    {
        this.inventario = inventario;
    }
}