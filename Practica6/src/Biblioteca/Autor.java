package Biblioteca;

public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String n, String nac) {
        this.nombre = n;
        this.nacionalidad = nac;
    }

    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + " (" + nacionalidad + ")");
    }
}
