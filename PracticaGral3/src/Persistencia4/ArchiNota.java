package Persistencia4;

import java.io.*;
import java.util.ArrayList;

public class ArchiNota {

    private String nombreArchi;

    public ArchiNota(String nombreArchi) {
        this.nombreArchi = nombreArchi;
    }

    // Crear archivo vacío
    public void crearArchivo() {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(nombreArchi))) {
            o.writeObject(new ArrayList<Nota>());
            System.out.println("✔ Archivo creado.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    // AUXILIARES
    @SuppressWarnings("unchecked")
    private ArrayList<Nota> cargarLista() {
        try (ObjectInputStream o = new ObjectInputStream(new FileInputStream(nombreArchi))) {
            return (ArrayList<Nota>) o.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void guardarLista(ArrayList<Nota> lista) {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(nombreArchi))) {
            o.writeObject(lista);
        } catch (Exception e) {
            System.out.println("Error al guardar: " + e);
        }
    }

    // b) Agregar varios estudiantes (varias notas)
    public void agregarNotas(ArrayList<Nota> nuevas) {
        ArrayList<Nota> lista = cargarLista();
        lista.addAll(nuevas);
        guardarLista(lista);
    }

    // c) Promedio de notas
    public float promedioNotas() {
        ArrayList<Nota> lista = cargarLista();
        if (lista.isEmpty()) return 0;

        float suma = 0;
        for (Nota n : lista) suma += n.getNotaFinal();

        return suma / lista.size();
    }

    // d) Mejor nota
    public ArrayList<Nota> mejorNota() {
        ArrayList<Nota> lista = cargarLista();
        ArrayList<Nota> mejores = new ArrayList<>();

        if (lista.isEmpty()) return mejores;

        float max = lista.get(0).getNotaFinal();
        for (Nota n : lista) {
            if (n.getNotaFinal() > max) {
                max = n.getNotaFinal();
            }
        }

        for (Nota n : lista) {
            if (n.getNotaFinal() == max) {
                mejores.add(n);
            }
        }

        return mejores;
    }

    // e) Eliminar por materia
    public void eliminarMateria(String mat) {
        ArrayList<Nota> lista = cargarLista();
        lista.removeIf(n -> n.getMateria().equalsIgnoreCase(mat));
        guardarLista(lista);
        System.out.println("✔ Eliminados los estudiantes de " + mat);
    }
}

