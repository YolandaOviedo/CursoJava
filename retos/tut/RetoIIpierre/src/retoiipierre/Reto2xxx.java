import java.util.HashMap;
import java.util.Scanner;

/*
* Recomendaciones Generales:
*
*    -> El método run() funcionará como nuestro método principal
*    -> No declarar objetos de tipo Scanner, utilizar el método read() para solicitar datos al usuario.
*    -> Si requiere utilizar varias clases, estas NO deben ser tipo public.
*/
class Reto2xxx{

    /**
    *  Este debe ser el único objeto de tipo Scanner en el código
    */
    private final Scanner scanner = new Scanner(System.in);

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
    public void run() 
    {
        /*
         * solución propuesta
         */
        BaseDatosProductos base = new BaseDatosProductos();
        String operacion = read();
        String[] datos = read().split(" ");
        int codigo = Integer.parseInt(datos[0]);
        String nombre = datos[1];
        double precio = Double.parseDouble(datos[2]);
        int inventario = Integer.parseInt(datos[3]);

        Producto p = new Producto(codigo, nombre, precio, inventario);
        if (operacion.equals("AGREGAR") && !base.verificarExistencia(p)) {
            base.agregar(p);
            System.out.println(base.generarInforme());
        } else if (operacion.equals("ACTUALIZAR") && base.verificarExistencia(p)) {
            base.actualizar(p);
            System.out.println(base.generarInforme());
        } else if (operacion.equals("BORRAR") && base.verificarExistencia(p)) {
            base.eliminar(p);
            System.out.println(base.generarInforme());
        } else {
            System.out.println("ERROR");
        }
        /**
         * Clase Producto con atributos, constructor y métodos
         */
        class Producto 
        {
            /**
             * Atributos de la clase Producto:
             * codigo, nombre, precio, inventario
             */
            private int codigo;
            private String nombre;
            private double precio;
            private int inventario;

            /**
             * Metodo constructor
             * 
             * @return
             */
            Producto(int codigo, String nombre, double precio, int inventario) 
            {
                this.codigo = codigo;
                this.nombre = nombre;
                this.precio = precio;
                this.inventario = inventario;
            }

            /**
             * Getter y Setter
             */
            public int getCodigo() {
                return codigo;
            }

            public void setCodigo(int codigo) {
                this.codigo = codigo;
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public double getPrecio() {
                return precio;
            }

            public void setPrecio(double precio) {
                this.precio = precio;
            }

            public int getInventario() {
                return inventario;
            }

            public void setInventario(int inventario) {
                this.inventario = inventario;
            }
        }

        class BaseDatosProductos 
        {
            HashMap<Integer,Producto> listaProductos = new HashMap<>();

            BaseDatosProductos() {
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

            public void agregar(Producto p) {
                listaProductos.put(p.getCodigo(), p);
            }

            public void actualizar(Producto p) {
                listaProductos.replace(p.getCodigo(), p);
            }

            public void eliminar(Producto p) {
                // listaProductos.remove(p.getCodigo(), p);
                listaProductos.remove(p.getCodigo());
            }

            public boolean verificarExistencia(Producto p) {
                return listaProductos.containsKey(p.getCodigo());

            }

            public double generarInforme() {
                double subtotal = 0.0;
                for (Producto p : listaProductos.values()) {
                    subtotal += (p.getPrecio() * p.getInventario());

                }
                return subtotal;
            }
        }

    }

}