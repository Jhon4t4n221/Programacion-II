package Persistencia6;

public class Libro {
    private String codLibro;
    private String titulo;
    private double precio;

    public Libro() {} // necesario para Gson

    public Libro(String codLibro, String titulo, double precio) {
        this.codLibro = codLibro;
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getCodLibro() { return codLibro; }
    public String getTitulo() { return titulo; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return codLibro + " | " + titulo + " | Bs " + precio;
    }
}

