package Persistencia6;

public class Prestamo {
    private String codCliente;
    private String codLibro;
    private String fecha; // formato simple
    private int cantidad;

    public Prestamo() {}

    public Prestamo(String codCliente, String codLibro, String fecha, int cantidad) {
        this.codCliente = codCliente;
        this.codLibro = codLibro;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public String getCodCliente() { return codCliente; }
    public String getCodLibro() { return codLibro; }
    public String getFecha() { return fecha; }
    public int getCantidad() { return cantidad; }

    @Override
    public String toString() {
        return "Cliente=" + codCliente + " Libro=" + codLibro + " Fecha=" + fecha + " Cant=" + cantidad;
    }
}
