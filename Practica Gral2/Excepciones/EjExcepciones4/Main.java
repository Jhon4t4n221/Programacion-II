package EjExcepciones4;

public class Main {
    public static void main(String[] args) {

        Inventario inv = new Inventario();

        try {
            Producto p1 = new Producto("001", "Laptop", 5500, 10);
            inv.agregarProducto(p1);

            Producto p2 = new Producto("001", "Monitor", 1200, 5);
            inv.agregarProducto(p2); // ERROR código duplicado

            inv.venderProducto("001", 20); // ERROR stock insuficiente

            inv.buscarProducto("999"); // ERROR no existe

        } catch (CodigoDuplicadoException |
                 ValorInvalidoException |
                 ProductoNoEncontradoException |
                 StockInsuficienteException e)
        {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
