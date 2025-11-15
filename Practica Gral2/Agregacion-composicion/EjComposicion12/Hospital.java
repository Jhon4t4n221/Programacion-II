package EjComposicion12;

import java.util.ArrayList;

public class Hospital {
    private String nombre;
    private ArrayList<Doctor> doctores;   // Agregación

    public Hospital(String nombre) {
        this.nombre = nombre;
        this.doctores = new ArrayList<>();
    }

    // Método para agregar doctores existentes
    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    public void mostrarDoctores() {
        System.out.println("Hospital: " + nombre);
        System.out.println("Doctores asignados:");
        for (Doctor d : doctores) {
            d.mostrarInfo();
        }
        System.out.println();
    }
}
