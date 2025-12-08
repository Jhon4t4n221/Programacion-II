package ej1;

import java.util.Scanner;

public class Consulta {

    private int idConsulta;
    private String nombreMedico;
    private String apellidoMedico;
    private String dia;

    // constructor
    public Consulta(int idConsulta, String nombreMedico, String apellidoMedico, String dia) {
        this.idConsulta = idConsulta;
        this.nombreMedico = nombreMedico;
        this.apellidoMedico = apellidoMedico;
        this.dia = dia;
    }

    public int getIdConsulta() { return idConsulta; }
    public String getNombreMedico() { return nombreMedico; }
    public String getApellidoMedico() { return apellidoMedico; }
    public String getDia() { return dia; }
    public void setDia(String dia) { this.dia = dia; }

    @Override
    public String toString() {
        return idConsulta + " | Dr. " + nombreMedico + " " + apellidoMedico + " | Día: " + dia;
    }

	public static Consulta crearPorTeclado(Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}

    // método estático crearPorTeclado()
}


