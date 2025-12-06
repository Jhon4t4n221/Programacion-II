package Persistencia1;
import java.io.*;
import java.util.ArrayList;

public class ArchivoCharangos {

    private static final String archivo = "charangos.dat";

    public static void guardar(ArrayList<Charango> lista) {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(archivo))) {
            o.writeObject(lista);
            System.out.println("✔ Archivo guardado");
        } catch (Exception e) {
            System.out.println("Error al guardar: " + e);
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Charango> cargar() {
        try (ObjectInputStream o = new ObjectInputStream(new FileInputStream(archivo))) {
            System.out.println("✔ Archivo cargado");
            return (ArrayList<Charango>) o.readObject();
        } catch (Exception e) {
            System.out.println("No existe archivo, creando lista nueva...");
            return new ArrayList<>();
        }
    }
}
