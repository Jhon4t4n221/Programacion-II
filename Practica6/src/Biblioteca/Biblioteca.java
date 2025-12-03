package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    private List<Autor> autores;
    private List<Prestamo> prestamos;
    private Horario horario;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.horario = new Horario("Lun-Vie", "08:00", "18:00");
    }

    public void agregarLibro(Libro l) { libros.add(l); }
    public void agregarAutor(Autor a) { autores.add(a); }

    public void prestarLibro(Estudiante e, Libro l) {
        prestamos.add(new Prestamo(e, l));
    }

    public void mostrarEstado() {
        System.out.println("Biblioteca: " + nombre);
        horario.mostrarHorario();

        System.out.println("\n--- Libros ---");
        libros.forEach(Libro::mostrarInfo);

        System.out.println("\n--- Autores ---");
        autores.forEach(Autor::mostrarInfo);

        System.out.println("\n--- Prestamos ---");
        prestamos.forEach(Prestamo::mostrarInfo);
    }

    public void guardarDatos() {
        try {
            Persistencia.guardar("libros.json", libros);
            Persistencia.guardar("autores.json", autores);
            Persistencia.guardar("prestamos.json", prestamos);
            System.out.println("Datos guardados correctamente.");
        } catch (Exception e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }
}

