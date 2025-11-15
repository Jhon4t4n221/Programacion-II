package EjExcepciones4;

public class Inventario {

    Producto[] productos = new Producto[100];
    int nroProductos = 0;

    public void agregarProducto(Producto p)
            throws CodigoDuplicadoException, ValorInvalidoException {

        if (p.precio < 0 || p.stock < 0) {
            throw new ValorInvalidoException("Precio o stock negativo");
        }

        for (int i = 0; i < nroProductos; i++) {
            if (productos[i].codigo.equals(p.codigo)) {
                throw new CodigoDuplicadoException("Código ya registrado: " + p.codigo);
            }
        }

        productos[nroProductos++] = p;
    }


    public Producto buscarProducto(String codigo)
            throws ProductoNoEncontradoException {

        for (int i = 0; i < nroProductos; i++) {
            if (productos[i].codigo.equals(codigo)) {
                return productos[i];
            }
        }

        throw new ProductoNoEncontradoException("Producto no encontrado: " + codigo);
    }


    public void venderProducto(String codigo, int cantidad)
            throws ProductoNoEncontradoException, StockInsuficienteException {

        Producto p = buscarProducto(codigo);

        if (p.stock < cantidad) {
            throw new StockInsuficienteException("Stock insuficiente. Disponible: " + p.stock);
        }

        p.stock -= cantidad;
    }
}
