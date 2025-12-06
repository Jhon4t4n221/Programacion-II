package Persistencia9;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ArchZoo {

    public ArrayList<Zoologico> zoos;

    public ArchZoo() {
        zoos = new ArrayList<>();
    }

    // a) CREAR
    public void crearZoo(int id, String nombre, String dir) {
        zoos.add(new Zoologico(id, nombre, dir));
    }

    // a) MODIFICAR
    public void modificarZoo(int id, String nuevoNombre, String nuevaDir) {
        for (Zoologico z : zoos) {
            if (z.id == id) {
                z.nombre = nuevoNombre;
                z.direccion = nuevaDir;
                System.out.println("Modificado exitosamente.");
                return;
            }
        }
        System.out.println("No existe el zoológico.");
    }

    // a) ELIMINAR
    public void eliminarZoo(int id) {
        zoos.removeIf(z -> z.id == id);
    }

    // b) Listar zoos con mayor variedad
    public void listarMayorVariedad() {
        if (zoos.size() == 0) return;

        Zoologico max = zoos.get(0);
        for (Zoologico z : zoos) {
            if (z.getVariedad() > max.getVariedad()) {
                max = z;
            }
        }

        System.out.println("Zoo con mayor variedad: " + max.nombre + " (" + max.getVariedad() + ")");
    }

    // c) Listar zoos vacíos y eliminarlos
    public void listarYEliminarVacios() {
        System.out.println("Zoológicos vacíos:");
        for (Zoologico z : zoos) {
            if (z.estaVacio()) {
                System.out.println(z.nombre);
            }
        }
        zoos.removeIf(z -> z.estaVacio());
    }

    // d) Mostrar animales de especie X en todos los zoos
    public void mostrarEspecieGlobal(String especie) {
        for (Zoologico z : zoos) {
            System.out.println("En zoo: " + z.nombre);
            z.mostrarAnimalesDe(especie);
        }
    }

    // e) Mover animales zoo X -> zoo Y
    public void moverAnimales(int id1, int id2, String especie) {
        Zoologico z1 = null, z2 = null;

        for (Zoologico z : zoos) {
            if (z.id == id1) z1 = z;
            if (z.id == id2) z2 = z;
        }

        if (z1 != null && z2 != null) {
            z1.moverA(z2, especie);
            System.out.println("Animales movidos correctamente.");
        } else {
            System.out.println("Error: zoológico no encontrado.");
        }
    }

    //           JSON PERSISTENCIA
    public void guardarJSON() {
        try {
            Gson gson = new Gson();
            FileWriter writer = new FileWriter("zoologicos.json");
            gson.toJson(zoos, writer);
            writer.close();
            System.out.println("Guardado en zoologicos.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerJSON() {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("zoologicos.json"));
            zoos = gson.fromJson(reader, new TypeToken<ArrayList<Zoologico>>(){}.getType());
            reader.close();
            System.out.println("Cargado desde zoologicos.json");
        } catch (Exception e) {
            System.out.println("No existe archivo, iniciando vacío.");
        }
    }
}
