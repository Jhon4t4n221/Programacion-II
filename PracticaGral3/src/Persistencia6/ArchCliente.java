package Persistencia6;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ArchCliente {
    private final String archivo = "clientes.json";
    private List<Cliente> lista = new ArrayList<>();
    private final Gson gson = new Gson();

    public ArchCliente() { cargar(); }

    public void cargar() {
        try (Reader r = new FileReader(archivo)) {
            Type tipo = new TypeToken<List<Cliente>>(){}.getType();
            List<Cliente> aux = gson.fromJson(r, tipo);
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

    public void agregar(Cliente c) { lista.add(c); guardar(); }
    public List<Cliente> listar() { return lista; }

    public Cliente buscarPorCodigo(String cod) {
        for (Cliente c : lista) if (c.getCodCliente().equalsIgnoreCase(cod)) return c;
        return null;
    }
}
