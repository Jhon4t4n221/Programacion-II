package Persistencia8;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ArchRefri {

    public String nombre;
    public ArrayList<Alimento> alimentos;

    public ArchRefri(String nombre) {
        this.nombre = nombre;
        alimentos = new ArrayList<>();
    }

    // -----------------------------------
    //        MÉTODOS DEL EJERCICIO
    // -----------------------------------

    // a) Crear
    public void crear(String n, String f, int c) {
        alimentos.add(new Alimento(n, f, c));
    }

    // a) Modificar por nombre
    public void modificar(String n, String fNueva, int cNueva) {
        for (Alimento a : alimentos) {
            if (a.nombre.equals(n)) {
                a.fechaVencimiento = fNueva;
                a.cantidad = cNueva;
                System.out.println("Modificado con éxito");
                return;
            }
        }
        System.out.println("No existe el alimento.");
    }

    // a) Eliminar por nombre
    public void eliminar(String n) {
        alimentos.removeIf(a -> a.nombre.equals(n));
    }

    // b) Mostrar alimentos que vencen antes de X
    public void mostrarAntesDe(String fechaX) {
        for (Alimento a : alimentos) {
            if (a.fechaVencimiento.compareTo(fechaX) < 0) {
                System.out.println(a.nombre + " vence: " + a.fechaVencimiento);
            }
        }
    }

    // c) Eliminar alimentos con cantidad 0
    public void eliminarSinStock() {
        alimentos.removeIf(a -> a.cantidad == 0);
    }

    // d) Buscar vencidos
    public void buscarVencidos(String hoy) {
        for (Alimento a : alimentos) {
            if (a.fechaVencimiento.compareTo(hoy) < 0) {
                System.out.println(a.nombre + " está vencido.");
            }
        }
    }

    // e) Mostrar alimento con mayor cantidad
    public void mayorCantidad() {
        if (alimentos.size() == 0) {
            System.out.println("No hay alimentos.");
            return;
        }
        Alimento max = alimentos.get(0);
        for (Alimento a : alimentos) {
            if (a.cantidad > max.cantidad) {
                max = a;
            }
        }
        System.out.println("Mayor cantidad: " + max.nombre + " (" + max.cantidad + ")");
    }

    // -----------------------------------
    //       PERSISTENCIA JSON
    // -----------------------------------

    // Guardar en JSON
    public void guardarJSON() {
        try {
            Gson gson = new Gson();
            FileWriter writer = new FileWriter("alimentos.json");

            gson.toJson(alimentos, writer);

            writer.close();
            System.out.println("Datos guardados en alimentos.json");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Leer desde JSON
    public void leerJSON() {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("alimentos.json"));

            alimentos = gson.fromJson(reader, new TypeToken<ArrayList<Alimento>>(){}.getType());

            reader.close();
            System.out.println("Datos cargados desde alimentos.json");

        } catch (IOException e) {
            System.out.println("No existe el archivo, iniciando vacío.");
        }
    }
}
