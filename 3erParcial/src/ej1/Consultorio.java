package ej1;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Consultorio {

    private String consultas;
    private String medicos;

    public Consultorio(String consultas, String medicos) {
        this.consultas = consultas;
        this.medicos = medicos;
    }

    public ArrayList<Medico> cargarMedicos() {
        ArrayList<Medico> lista = new ArrayList<>();

        File carpeta = new File(this.medicos);
        if (!carpeta.exists()) return lista;

        File[] archivos = carpeta.listFiles();
        if (archivos == null) return lista;

        for (File f : archivos) {
            if (f.getName().endsWith(".txt")) {
                Medico m = new Medico();
                m.cargar(f.getPath());
                lista.add(m);
            }
        }
        return lista;
    }

    public ArrayList<Consulta> cargarConsultas() {
        ArrayList<Consulta> lista = new ArrayList<>();

        File carpeta = new File(this.consultas);
        if (!carpeta.exists()) return lista;

        File[] archivos = carpeta.listFiles();
        if (archivos == null) return lista;

        for (File f : archivos) {
            if (f.getName().endsWith(".json")) {
                Consulta c = new Consulta();
                c.cargar(f.getPath());
                lista.add(c);
            }
        }
        return lista;
    }

    public void mostrarMedicos() {
        ArrayList<Medico> lista = cargarMedicos();
        if (lista.isEmpty()) System.out.println("No hay médicos.");

        for (Medico m : lista) System.out.println(m);
    }

    public void mostrarConsultas() {
        ArrayList<Consulta> lista = cargarConsultas();
        if (lista.isEmpty()) System.out.println("No hay consultas.");

        for (Consulta c : lista) System.out.println(c);
    }

    public void ejercicio1() {

        Medico m1 = new Medico(1, "Carlos", "Mendoza", 5);
        Medico m2 = new Medico(2, "Ana", "Lopez", 8);
        Medico m3 = new Medico(3, "Pedro", "Garcia", 3);

        m1.alta();
        m2.alta();
        m3.alta();

        Consulta c1 = new Consulta(1001, "Juan", "Perez", 1, 10, "Enero", 2024);
        Consulta c2 = new Consulta(1002, "Maria", "Gomez", 1, 15, "Enero", 2024);
        Consulta c3 = new Consulta(1003, "Luis", "Rodriguez", 1, 20, "Febrero", 2024);

        Consulta c4 = new Consulta(1004, "Sofia", "Martinez", 2, 5, "Febrero", 2024);
        Consulta c5 = new Consulta(1005, "Carlos", "Sanchez", 2, 10, "Marzo", 2024);
        Consulta c6 = new Consulta(1006, "Laura", "Diaz", 2, 15, "Marzo", 2024);

        Consulta c7 = new Consulta(1007, "Miguel", "Torres", 3, 20, "Abril", 2024);
        Consulta c8 = new Consulta(1008, "Elena", "Ramirez", 3, 25, "Abril", 2024);
        Consulta c9 = new Consulta(1009, "Jorge", "Vargas", 3, 30, "Mayo", 2024);

        c1.alta(); c2.alta(); c3.alta();
        c4.alta(); c5.alta(); c6.alta();
        c7.alta(); c8.alta(); c9.alta();
    }

    public void ejercicio2(String nom, String ape) {

        ArrayList<Medico> medicos = cargarMedicos();
        ArrayList<Consulta> consultas = cargarConsultas();

        int id = -1;

        for (Medico m : medicos) {
            if (m.getNombreMed().equals(nom) &&
                m.getApellidoMed().equals(ape)) {

                id = m.getIdMed();
                m.baja();
                break;
            }
        }

        if (id == -1) {
            System.out.println("No se encontró al médico.");
            return;
        }

        for (Consulta c : consultas) {
            if (c.getIdMed() == id) c.baja();
        }

        System.out.println("→ Médico y consultas eliminadas correctamente.");
    }

    public void ejercicio3() {
        ArrayList<Consulta> lista = cargarConsultas();
        int modificadas = 0;

        for (Consulta c : lista) {

            boolean esNavidad = (c.getDias() == 25 && c.getMes().equals("Diciembre"));
            boolean esAnioNuevo = (c.getDias() == 1 && c.getMes().equals("Enero"));

            if (esNavidad || esAnioNuevo) {
                System.out.println("→ Consulta en fecha especial encontrada: " + c);
                
                c.setDias(c.getDias() + 1);

                c.alta();

                modificadas++;
                System.out.println("   → FECHA ACTUALIZADA: " + c);
            }
        }

        if (modificadas == 0) {
            System.out.println("No se encontraron consultas en Navidad o Año Nuevo.");
        } else {
            System.out.println("Total de consultas actualizadas: " + modificadas);
        }
    }

}
