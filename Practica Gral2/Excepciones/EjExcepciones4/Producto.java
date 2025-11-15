package EjExcepciones4;

public class Producto {
    String codigo;
    String nombre;
    double precio;
    int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrar() {
        System.out.println(codigo + " - " + nombre +
                " | Precio: " + precio +
                " | Stock: " + stock);
    }
}
