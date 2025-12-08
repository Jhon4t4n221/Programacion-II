package ej1;
import java.util.Scanner;

public class Medico {
    private int id;
    private String nombre;

    public Medico(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Médico ID: " + id + " - Nombre: " + nombre;
    }

    public static Medico crearPorTeclado(Scanner sc) {
        System.out.print("Ingrese ID del médico: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese nombre del médico: ");
        String nombre = sc.nextLine();
        return new Medico(id, nombre);
    }
}






