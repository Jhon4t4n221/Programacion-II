package ej1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Consultorio consultorio = new Consultorio("archivosConsulta", "archivosMedico");

        int opcion;

        do {
            System.out.println("\n========= MENÚ PRINCIPAL =========");
            System.out.println("1. Crear 3 médicos y 9 consultas (Ejercicio A)");
            System.out.println("2. Dar de baja médico X Y y sus consultas (Ejercicio B)");
            System.out.println("3. Cambiar fechas de Navidad y Año Nuevo (Ejercicio C)");
            System.out.println("4. Mostrar médicos");
            System.out.println("5. Mostrar consultas");
            System.out.println("6. Salir");
            System.out.print("Seleccione opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

            case 1:
                System.out.println("\n=== EJERCICIO A ===");
                consultorio.ejercicio1();
                break;

            case 2:
                System.out.println("\n=== EJERCICIO B ===");
                System.out.print("Ingrese nombre del médico: ");
                String nombre = sc.nextLine();

                System.out.print("Ingrese apellido del médico: ");
                String apellido = sc.nextLine();

                consultorio.ejercicio2(nombre, apellido);
                break;

            case 3:
                System.out.println("\n=== EJERCICIO C ===");
                consultorio.ejercicio3();
                break;

            case 4:
                System.out.println("\n=== LISTA DE MÉDICOS ===");
                consultorio.mostrarMedicos();
                break;

            case 5:
                System.out.println("\n=== LISTA DE CONSULTAS ===");
                consultorio.mostrarConsultas();
                break;

            case 6:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}
