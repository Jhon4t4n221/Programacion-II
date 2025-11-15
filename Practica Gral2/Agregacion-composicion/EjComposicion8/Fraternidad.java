package EjComposicion8;

import java.util.ArrayList;

public class Fraternidad {
    private String nombre;
    private Persona encargado;
    private ArrayList<Persona> bailarines = new ArrayList<>();

    public Fraternidad(String nombre, Persona encargado) {
        this.nombre = nombre;
        this.encargado = encargado;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona getEncargado() {
        return encargado;
    }

    public void agregarBailarin(Persona p) {
        bailarines.add(p);
    }

    public void mostrarBailarines() {
        System.out.println("\nBailarines de " + nombre + ":");
        for (Persona p : bailarines) {
            System.out.println("- " + p.getNombre());
        }
    }
}
