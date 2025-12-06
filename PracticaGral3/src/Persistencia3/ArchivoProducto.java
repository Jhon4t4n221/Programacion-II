package Persistencia3;

import java.io.*;
import java.util.ArrayList;

public class ArchivoProducto {

    private String nomA;

    public ArchivoProducto(String nomA) {
        this.nomA = nomA;
    }

    // ----------------------
    // Crear archivo vacío
    // ----------------------
    public void crearArchivo() {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(nomA))) {
            o.writeObject(new ArrayList<Producto>());
            System.out.println("✔ Archivo creado.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    // Métodos auxiliares
    @SuppressWarnings("unchecked")
    private ArrayList<Producto> cargarLista() {
        try (ObjectInputStream o = new ObjectInputStream(new FileInputStream(nomA))) {
            return (ArrayList<Producto>) o.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void guardarLista(ArrayList<Producto> lista) {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(nomA))) {
            o.writeObject(lista);
        } catch (Exception e) {
            System.out.println("Error guardando lista: " + e);
        }
    }

    // ----------------------
    // b) Guardar producto
    // ----------------------
    public void guardarProducto(Producto p) {
        ArrayList<Producto> lista = cargarLista();
        lista.add(p);
        guardarLista(lista);
        System.out.println("✔ Guardado: " + p.getNombre());
    }

    // ----------------------
    // c) Buscar por código
    // ----------------------
    public Producto buscaProducto(int c) {
        ArrayList<Producto> lista = cargarLista();

        for (Producto p : lista) {
            if (p.getCodigo() == c) {
                return p;
            }
        }
        return null;
    }

    // ----------------------
    // d) Calcular promedio de precios
    // ----------------------
    public float promedioPrecios() {
        ArrayList<Producto> lista = cargarLista();
        if (lista.isEmpty()) return 0;

        float suma = 0;
        for (Producto p : lista) {
            suma += p.getPrecio();
        }
        return suma / lista.size();
    }

    // ----------------------
    // e) Producto más caro
    // ----------------------
    public Producto productoMasCaro() {
        ArrayList<Producto> lista = cargarLista();
        if (lista.isEmpty()) return null;

        Producto mayor = lista.get(0);

        for (Producto p : lista) {
            if (p.getPrecio() > mayor.getPrecio()) {
                mayor = p;
            }
        }
        return mayor;
    }
}
