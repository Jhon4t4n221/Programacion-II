package Biblioteca;

public class Prestamo {
    private String fechaPrestamo = "2025-01-01";
    private String fechaDevolucion = "2025-01-10";
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(Estudiante e, Libro l) {
        this.estudiante = e;
        this.libro = l;
    }

    public void mostrarInfo() {
        System.out.println("Préstamo:");
        estudiante.mostrarInfo();
        libro.mostrarInfo();
        System.out.println("Fechas: " + fechaPrestamo + " / " + fechaDevolucion);
    }
}
