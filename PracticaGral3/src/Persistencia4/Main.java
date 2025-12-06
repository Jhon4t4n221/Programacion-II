package Persistencia4;

import java.util.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArchiNota arch = new ArchiNota("notas.dat");
        arch.crearArchivo();

        // Crear estudiantes
        Estudiante e1 = new Estudiante(1, "Juan", "Perez", "Lopez", 20);
        Estudiante e2 = new Estudiante(2, "Maria", "Quispe", "Flores", 19);
        Estudiante e3 = new Estudiante(3, "Luis", "Mamani", "Choque", 22);

        // Crear notas
        ArrayList<Nota> lista = new ArrayList<>();
        lista.add(new Nota("Programacion", 90, e1));
        lista.add(new Nota("Programacion", 75, e2));
        lista.add(new Nota("Matematicas", 95, e3));

        arch.agregarNotas(lista);

        System.out.println("\nPromedio de notas:");
        System.out.println( arch.promedioNotas() );

        System.out.println("\nMejor nota:");
        for (Nota n : arch.mejorNota()) {
            System.out.println(n);
        }

        System.out.println("\nEliminando materia Programacion...");
        arch.eliminarMateria("Programacion");
    }
}

