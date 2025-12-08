package ej1;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Consultorio {
    private int nroConsultorio;
    private String nombreConsultorio;

    public Consultorio(int nroConsultorio, String nombreConsultorio) {
        this.nroConsultorio = nroConsultorio;
        this.nombreConsultorio = nombreConsultorio;
    }

    public int getNroConsultorio() {
        return nroConsultorio;
    }

    public String getNombreConsultorio() {
        return nombreConsultorio;
    }

    @Override
    public String toString() {
        return "Consultorio Nº: " + nroConsultorio + " - Nombre: " + nombreConsultorio;
    }

    public static Consultorio crearPorTeclado(Scanner sc) {
        System.out.print("Ingrese número del consultorio: ");
        int nro = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese nombre del consultorio: ");
        String nombre = sc.nextLine();
        return new Consultorio(nro, nombre);
    }
}


