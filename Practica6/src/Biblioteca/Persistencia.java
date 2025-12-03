package Biblioteca;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.util.List;

public class Persistencia {
    private static final Gson gson = new Gson();

    public static <T> void guardar(String archivo, List<T> lista) throws IOException {
        FileWriter writer = new FileWriter(archivo);
        gson.toJson(lista, writer);
        writer.close();
    }

    public static <T> List<T> cargar(String archivo, Class<T[]> clase) throws IOException {
        Reader reader = new FileReader(archivo);
        T[] data = gson.fromJson(reader, clase);
        reader.close();
        return List.of(data);
    }
}
