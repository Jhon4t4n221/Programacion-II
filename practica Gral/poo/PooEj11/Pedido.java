package PooEj11;

public class Pedido {
    private String producto;
    private String estado;

    public Pedido(String producto, String estado) {
        this.producto = producto;
        this.estado = estado;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("El objeto Pedido fue destruido.");
    }

    public void mostrar() {
        System.out.println("Producto: " + producto + " | Estado: " + estado);
    }
}
