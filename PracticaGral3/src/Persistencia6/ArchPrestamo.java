package Persistencia6;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ArchPrestamo {
    private final String archivo = "prestamos.json";
    private List<Prestamo> lista = new ArrayList<>();
    private final Gson gson = new Gson();

    public ArchPrestamo() { cargar(); }

    public void cargar() {
        try (Reader r = new FileReader(archivo)) {
            Type tipo = new TypeToken<List<Prestamo>>(){}.getType();
            List<Prestamo> aux = gson.fromJson(r, tipo);
            if (aux != null) lista = aux;
        } catch (FileNotFoundException fnf) {
            lista = new ArrayList<>();
        } catch (IOException e) { e.printStackTrace(); }
    }

    public void guardar() {
        try (Writer w = new FileWriter(archivo)) {
            gson.toJson(lista, w);
        } catch (IOException e) { e.printStackTrace(); }
    }

    public void agregar(Prestamo p) { lista.add(p); guardar(); }
    public List<Prestamo> listar() { return lista; }
}
