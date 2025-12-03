package Biblioteca;

public class Estudiante {
    private String codigo;
    private String nombre;

    public Estudiante(String c, String n) {
        this.codigo = c;
        this.nombre = n;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Código: " + codigo);
    }
}
