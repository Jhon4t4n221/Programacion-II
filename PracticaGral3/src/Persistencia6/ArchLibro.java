package Persistencia6;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ArchLibro {
    private final String archivo = "libros.json";
    private List<Libro> lista = new ArrayList<>();
    private final Gson gson = new Gson();

    public ArchLibro() {
        cargar(); // carga al iniciar
    }

    public void cargar() {
        try (Reader r = new FileReader(archivo)) {
            Type tipo = new TypeToken<List<Libro>>(){}.getType();
            List<Libro> aux = gson.fromJson(r, tipo);
            if (aux != null) lista = aux;
        } catch (FileNotFoundException fnf) {
            lista = new ArrayList<>(); // si no existe, lista vacía
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardar() {
        try (Writer w = new FileWriter(archivo)) {
            gson.toJson(lista, w);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void agregar(Libro l) {
        lista.add(l);
        guardar();
    }

    public List<Libro> listar() {
        return lista;
    }

    public Libro buscarPorCodigo(String cod) {
        for (Libro l : lista) if (l.getCodLibro().equalsIgnoreCase(cod)) return l;
        return null;
    }
}

