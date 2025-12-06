package Persistencia1;
import java.util.*;

public class Aplicacion {

    public static void main(String[] args) {

        ArrayList<Charango> lista = ArchivoCharangos.cargar();

        // Ejemplo: crear 3 charangos
        boolean[] ejemplo = {true, true, true, false, false, false, false, false, false, false};

        lista.add(new Charango("Madera", 10, ejemplo));
        lista.add(new Charango("Cedro", 10, ejemplo));
        lista.add(new Charango("Abeto", 8, ejemplo));

        // b) Eliminar charangos con más de 6 cuerdas falsas
        lista.removeIf(ch -> ch.contarCuerdasFalsas() > 6);

        // c) Listar charangos por material x
        listarPorMaterial(lista, "Madera");

        // d) Buscar charangos con 10 cuerdas
        System.out.println("\nCharangos con 10 cuerdas:");
        for (Charango ch : lista) {
            if (ch.getNroCuerdas() == 10) {
                System.out.println(ch);
            }
        }

        // e) Ordenar por material
        lista.sort(Comparator.comparing(Charango::getMaterial));

        System.out.println("\nLista ordenada por material:");
        for (Charango ch : lista) {
            System.out.println(ch);
        }

        ArchivoCharangos.guardar(lista);
    }

    public static void listarPorMaterial(ArrayList<Charango> lista, String mat) {
        System.out.println("\nCharangos de material: " + mat);
        for (Charango ch : lista) {
            if (ch.getMaterial().equalsIgnoreCase(mat)) {
                System.out.println(ch);
            }
        }
    }
}
