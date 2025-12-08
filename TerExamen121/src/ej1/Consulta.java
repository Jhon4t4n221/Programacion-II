package ej1;

import java.util.Scanner;

public class Consulta {
    private int idConsulta;
    private Medico medico;
    private Consultorio consultorio;

    public Consulta(int idConsulta, Medico medico, Consultorio consultorio) {
        this.idConsulta = idConsulta;
        this.medico = medico;
        this.consultorio = consultorio;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    @Override
    public String toString() {
        return "Consulta ID: " + idConsulta +
               "\n  " + medico.toString() +
               "\n  " + consultorio.toString();
    }

    public static Consulta crearPorTeclado(Scanner sc) {
        System.out.print("Ingrese ID de la consulta: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("=== Datos del Médico ===");
        Medico m = Medico.crearPorTeclado(sc);

        System.out.println("=== Datos del Consultorio ===");
        Consultorio c = Consultorio.crearPorTeclado(sc);

        return new Consulta(id, m, c);
    }
}



