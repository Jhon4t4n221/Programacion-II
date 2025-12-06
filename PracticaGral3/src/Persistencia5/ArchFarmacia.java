package Persistencia5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class ArchFarmacia {

    private String na;

    public ArchFarmacia(String na) {
        this.na = na;
    }

    // Crear archivo
    public void crearArchivo() {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(na))) {
            o.writeObject(new ArrayList<Farmacia>());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    @SuppressWarnings("unchecked")
    private ArrayList<Farmacia> cargar() {
        try (ObjectInputStream o = new ObjectInputStream(new FileInputStream(na))) {
            return (ArrayList<Farmacia>) o.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    private void guardar(ArrayList<Farmacia> lista) {
        try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(na))) {
            o.writeObject(lista);
        } catch (Exception e) {
            System.out.println("Error al guardar: " + e);
        }
    }

    // Guardar una farmacia
    public void guardarFarmacia(Farmacia f) {
        ArrayList<Farmacia> lista = cargar();
        lista.add(f);
        guardar(lista);
    }

    // a) Medicamentos para la tos en sucursal X
    public void medicamentosTosSucursal(int suc) {
        ArrayList<Farmacia> lista = cargar();
        for (Farmacia f : lista) {
            if (f.getSucursal() == suc) {
                f.mostrarMedicamentosPorTipo("tos");
            }
        }
    }

    // b) Sucursal y dirección que tiene "Tapsin"
    public void farmaciaConTapsin() {
        ArrayList<Farmacia> lista = cargar();

        for (Farmacia f : lista) {
            if (f.contieneMedicamento("Tapsin")) {
                System.out.println("Sucursal: " + f.getSucursal() +
                        " | Dirección: " + f.getDireccion());
            }
        }
    }

    // c) Buscar medicamentos por tipo
    public void buscarPorTipo(String tipo) {
        ArrayList<Farmacia> lista = cargar();
        for (Farmacia f : lista) {
            f.mostrarMedicamentosPorTipo(tipo);
        }
    }

    // d) Ordenar farmacias por dirección
    public void ordenarPorDireccion() {
        ArrayList<Farmacia> lista = cargar();

        Collections.sort(lista, (a, b) ->
                a.getDireccion().compareToIgnoreCase(b.getDireccion()));

        guardar(lista);
    }

    // e) Mover medicamentos tipo X de farmacia A a farmacia Z
    public void moverMedicamentos(String tipo, int a, int z) {
        ArrayList<Farmacia> lista = cargar();

        Farmacia fa = null, fz = null;

        for (Farmacia f : lista) {
            if (f.getSucursal() == a) fa = f;
            if (f.getSucursal() == z) fz = f;
        }

        if (fa == null || fz == null) return;

        Medicamento[] meds = fa.getMedicamentos();

        for (int i = 0; i < fa.getNroM(); i++) {
            if (meds[i].getTipo().equalsIgnoreCase(tipo)) {
                fz.agregarMedicamento(meds[i]);
            }
        }
    }
}
