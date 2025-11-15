package EjComposicion8;

import java.util.ArrayList;

public class Facultad {
    private String nombre;
    private String sigla;
    private ArrayList<Persona> bailarines = new ArrayList<>();

    public Facultad(String nombre, String sigla) {
        this.nombre = nombre;
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarBailarin(Persona p) {
        bailarines.add(p);
    }

    public void mostrarBailarines() {
        System.out.println("\nBailarines de Facultad " + nombre + ":");
        for (Persona p : bailarines) {
            System.out.println("- " + p.getNombre());
        }
    }
}
