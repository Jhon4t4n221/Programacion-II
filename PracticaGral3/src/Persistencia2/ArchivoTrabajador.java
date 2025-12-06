package Persistencia2;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class ArchivoTrabajador {

    private String nombreArch = "trabajadores.dat";

    public ArchivoTrabajador() {}

    // a) Crear archivo vacío
    public void crearArchivo() {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(nombreArch))) {
            o.writeObject(new ArrayList<Trabajador>());
            System.out.println("✔ Archivo creado.");
        } catch (Exception e) {
            System.out.println("Error creando archivo: " + e);
        }
    }

    // ---- Métodos auxiliares ----
    @SuppressWarnings("unchecked")
    private ArrayList<Trabajador> cargarLista() {
        try (ObjectInputStream o = new ObjectInputStream(new FileInputStream(nombreArch))) {
            return (ArrayList<Trabajador>) o.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void guardarLista(ArrayList<Trabajador> lista) {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(nombreArch))) {
            o.writeObject(lista);
        } catch (Exception e) {
            System.out.println("Error guardando: " + e);
        }
    }

    // b) Guardar un trabajador
    public void guardarTrabajador(Trabajador t) {
        ArrayList<Trabajador> lista = cargarLista();
        lista.add(t);
        guardarLista(lista);
        System.out.println("✔ Guardado: " + t.getNombre());
    }

    // c) Aumentar salario
    public void aumentaSalario(int aumento, Trabajador t) {
        ArrayList<Trabajador> lista = cargarLista();

        for (Trabajador trab : lista) {
            if (trab.getCarnet() == t.getCarnet()) {
                trab.setSalario(trab.getSalario() + aumento);
                System.out.println("✔ Salario aumentado a " + trab.getNombre());
            }
        }

        guardarLista(lista);
    }

    // d) Buscar el trabajador con mayor salario
    public Trabajador mayorSalario() {
        ArrayList<Trabajador> lista = cargarLista();
        if (lista.isEmpty()) return null;

        return lista.stream()
                .max(Comparator.comparing(Trabajador::getSalario))
                .orElse(null);
    }

    // e) Ordenar por salario
    public void ordenarPorSalario() {
        ArrayList<Trabajador> lista = cargarLista();
        lista.sort(Comparator.comparing(Trabajador::getSalario));

        System.out.println("✔ Trabajadores ordenados por salario:");
        for (Trabajador t : lista) {
            System.out.println(t);
        }

        guardarLista(lista);
    }
}
