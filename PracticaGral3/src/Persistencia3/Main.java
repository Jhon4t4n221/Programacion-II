package Persistencia3;

public class Main {
    public static void main(String[] args) {

        ArchivoProducto arch = new ArchivoProducto("productos.dat");

        arch.crearArchivo();

        arch.guardarProducto(new Producto(1, "Mouse", 50));
        arch.guardarProducto(new Producto(2, "Teclado", 120));
        arch.guardarProducto(new Producto(3, "Monitor", 800));

        System.out.println("\nBuscando producto con código 2:");
        System.out.println(arch.buscaProducto(2));

        System.out.println("\nPromedio de precios:");
        System.out.println(arch.promedioPrecios());

        System.out.println("\nProducto más caro:");
        System.out.println(arch.productoMasCaro());
    }
}
