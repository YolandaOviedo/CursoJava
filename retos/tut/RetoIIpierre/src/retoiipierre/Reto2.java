import java.util.HashMap;
import java.util.Scanner;

class Reto2 {
   
    private final Scanner scanner = new Scanner(System.in);

    public String read(){
        return this.scanner.nextLine();
    }

    public void run(){
        BaseDatosProductos db = new BaseDatosProductos();
        String operacion = read();
        String[] valores = read().split(" ");
        int codigo = Integer.parseInt(valores[0]);
        String nombre = valores[1];
        double precio = Double.parseDouble(valores[2]);
        int inventario = Integer.parseInt(valores[3]);

        Producto p = new Producto(codigo,nombre,precio,inventario);

        if(operacion.equals("ACTUALIZAR") && db.verificarExistencia(p)){
            db.actualizar(p);
            db.generarInforme();
        }else if(operacion.equals("BORRAR") && db.verificarExistencia(p)){
            db.eliminar(p);
            db.generarInforme();
        }else if(operacion.equals("AGREGAR") && !db.verificarExistencia(p)){ 
            db.agregar(p);
            db.generarInforme();
        }else{
            System.out.println("ERROR");
        }
    }
    
    
    class Producto {
        //Atributos
        private int codigo;
        private String nombre;
        private double precio;
        private int inventario;

        //Constructor
        public Producto(int codigo, String nombre, double precio, int inventario) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
            this.inventario = inventario;
        }

        //Metodos
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
    
    class BaseDatosProductos {
        private HashMap<Integer,Producto> listaProductos = new HashMap<>();
        public BaseDatosProductos() {
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
        
        public void agregar(Producto p){
            listaProductos.put(p.getCodigo(),p);
        }
        public void actualizar(Producto p){
            listaProductos.replace(p.getCodigo(), p);
        }
        public void eliminar(Producto p){
            listaProductos.remove(p.getCodigo());
        }
        public void generarInforme(){
            double totalInventario = 0;
            for(Producto p:listaProductos.values()){
                totalInventario += p.getPrecio()*p.getInventario();
            }
            System.out.println(String.format("%.1f", totalInventario));
        }
        public boolean verificarExistencia(Producto p){
            return listaProductos.containsKey(p.getCodigo());
        }
    }
    
}
