package ej1;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Consulta {

    private int ci;
    private String nombrePaciente;
    private String apellidoPaciente;
    private int idMed;
    private int dias;
    private String mes;
    private int anio;

    public Consulta(int ci, String nombrePaciente, String apellidoPaciente,
                    int idMed, int dias, String mes, int anio) {
        this.ci = ci;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.idMed = idMed;
        this.dias = dias;
        this.mes = mes;
        this.anio = anio;
    }

    public Consulta() {
        this.ci = 0;
        this.nombrePaciente = "";
        this.apellidoPaciente = "";
        this.idMed = 0;
        this.dias = 0;
        this.mes = "";
        this.anio = 0;
    }

    @Override
    public String toString() {
        return "Consulta{" + "ci=" + ci + ", nombrePaciente=" + nombrePaciente +
               ", apellidoPaciente=" + apellidoPaciente + ", idMed=" + idMed +
               ", dias=" + dias + ", mes=" + mes + ", anio=" + anio + '}';
    }

    public void alta() {
        try {
            new File("archivosConsulta").mkdirs();
            String ruta = "archivosConsulta/consulta_" + this.ci + "_" + this.idMed + ".json";

            Gson gson = new Gson();
            FileWriter w = new FileWriter(ruta);
            gson.toJson(this, w);
            w.close();

            System.out.println("→ Consulta guardada correctamente.");

        } catch (Exception e) {
            System.out.println("ERROR en alta de consulta:\n" + e);
        }
    }

    public void cargar(String ruta) {
        try {
            Gson gson = new Gson();
            FileReader r = new FileReader(ruta);

            Consulta c = gson.fromJson(r, Consulta.class);

            this.ci = c.ci;
            this.nombrePaciente = c.nombrePaciente;
            this.apellidoPaciente = c.apellidoPaciente;
            this.idMed = c.idMed;
            this.dias = c.dias;
            this.mes = c.mes;
            this.anio = c.anio;

            r.close();

        } catch (Exception e) {
            System.out.println("ERROR al cargar consulta:\n" + e);
        }
    }

    public void baja() {
        String ruta = "archivosConsulta/consulta_" + this.ci + "_" + this.idMed + ".json";
        File archivo = new File(ruta);

        if (archivo.delete()) {
            System.out.println("→ Consulta eliminada: " + archivo.getPath());
        } else {
            System.out.println("ERROR al eliminar consulta.");
        }
    }
    
    public int getIdMed() { return idMed; }
    public int getDias() { return dias; }
    public void setDias(int dias) { this.dias = dias; }
    public String getMes() { return mes; }

}
