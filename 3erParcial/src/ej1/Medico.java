package ej1;

import java.util.Scanner;
import java.io.*;

public class Medico {

    private int idMed;
    private String nombreMed;
    private String apellidoMed;
    private int aniosExperiencia;

    public Medico(int idMed, String nombreMed, String apellidoMed, int aniosExperiencia) {
        this.idMed = idMed;
        this.nombreMed = nombreMed;
        this.apellidoMed = apellidoMed;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Medico() {
        this.idMed = 0;
        this.nombreMed = "";
        this.apellidoMed = "";
        this.aniosExperiencia = 0;
    }

    public void alta() {
        try {
            new File("archivosMedico").mkdirs();
            String ruta = "archivosMedico/medico_" + this.idMed + ".txt";

            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
            bw.write(idMed + "\n");
            bw.write(nombreMed + "\n");
            bw.write(apellidoMed + "\n");
            bw.write(aniosExperiencia + "");
            bw.close();

            System.out.println("→ Médico guardado correctamente.");

        } catch (Exception e) {
            System.out.println("ERROR en alta de médico:\n" + e);
        }
    }

    public void cargar(String ruta) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));

            this.idMed = Integer.parseInt(br.readLine());
            this.nombreMed = br.readLine();
            this.apellidoMed = br.readLine();
            this.aniosExperiencia = Integer.parseInt(br.readLine());

            br.close();

        } catch (Exception e) {
            System.out.println("ERROR al cargar médico:\n" + e);
        }
    }

    public void baja() {
        File archivo = new File("archivosMedico/medico_" + this.idMed + ".txt");
        if (archivo.delete()) {
            System.out.println("→ Médico eliminado: " + archivo.getPath());
        } else {
            System.out.println("ERROR al eliminar médico.");
        }
    }

    @Override
    public String toString() {
        return "Medico{" + "idMed=" + idMed + ", nombreMed=" + nombreMed +
               ", apellidoMed=" + apellidoMed + ", aniosExperiencia=" + aniosExperiencia + '}';
    }

    public int getIdMed() { return idMed; }
    public String getNombreMed() { return nombreMed; }
    public String getApellidoMed() { return apellidoMed; }
}
