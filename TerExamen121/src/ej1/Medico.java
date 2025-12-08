package ej1;
import java.util.Scanner;

public class Medico {
    private int id;
    private String nombreMed;
    private String apellidoMed;

    public Medico(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombreMed;
    }

    
    @Override
	public String toString() {
		return "Medico [id=" + id + ", nombreMed=" + nombreMed + ", apellidoMed=" + apellidoMed + "]";
	}

	public static Medico crearPorTeclado(Scanner sc) {
        System.out.print("Ingrese ID del médico: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese nombre del médico: ");
        String nombre = sc.nextLine();
        return new Medico(id, nombre);
        sc.nextLine();
        System.out.print("Ingrese apellido del médico: ");
        String apellidoMed = sc.nextLine();
        return new Medico(id, apellidoMed);
    }
}






