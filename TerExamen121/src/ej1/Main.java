package ej1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Consulta> consultas = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Agregar consulta");
            System.out.println("2. Listar consultas");
            System.out.println("3. Buscar consulta por ID");
            System.out.println("4. Eliminar consulta por ID");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");
            System.out.println("6. Dar de baja a un médico y eliminar sus consultas");
            System.out.println("7. Cambiar el día de consultas en Navidad/Año Nuevo");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    consultas.add(Consulta.crearPorTeclado(sc));
                    System.out.println("Consulta agregada con éxito.");
                    break;

                case 2:
                    System.out.println("=== LISTA DE CONSULTAS ===");
                    if (consultas.isEmpty()) {
                        System.out.println("No hay consultas registradas.");
                    } else {
                        for (Consulta con : consultas) {
                            System.out.println(con);
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese ID a buscar: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    boolean encontrado = false;
                    for (Consulta con : consultas) {
                        if (con.getIdConsulta() == idBuscar) {
                            System.out.println("Consulta encontrada:");
                            System.out.println(con);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) System.out.println("No existe una consulta con ese ID.");
                    break;

                case 4:
                    System.out.print("Ingrese ID a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();

                    Consulta eliminar = null;
                    for (Consulta con : consultas) {
                        if (con.getIdConsulta() == idEliminar) {
                            eliminar = con;
                            break;
                        }
                    }

                    if (eliminar != null) {
                        consultas.remove(eliminar);
                        System.out.println("Consulta eliminada.");
                    } else {
                        System.out.println("No existe una consulta con ese ID.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    
                case 6:
                    System.out.print("Nombre del médico a dar de baja: ");
                    String nomMed = sc.nextLine();

                    System.out.print("Apellido del médico: ");
                    String apeMed = sc.nextLine();

                    boolean eliminado = consultas.removeIf(c ->
                        c.getNombreMedico().equalsIgnoreCase(nomMed) &&
                        c.getApellidoMedico().equalsIgnoreCase(apeMed)
                    );

                    if (eliminado)
                        System.out.println("Se dieron de baja todas las consultas de ese médico.");
                    else
                        System.out.println("No se encontraron consultas de ese médico.");
                    break;
                    
                case 7:
                    System.out.println("Cambiando fechas especiales...");

                    for (Consulta con : consultas) {
                        if (con.getDia().equals("25/12") || con.getDia().equals("31/12")) {
                            System.out.println("Consulta ID " + con.getIdConsulta() +
                                    " tenía fecha " + con.getDia());

                            System.out.print("Nuevo día (dd/mm): ");
                            String nuevoDia = sc.nextLine();
                            con.setDia(nuevoDia);
                        }
                    }

                    System.out.println("Fechas actualizadas.");
                    break;


            }

        } while (opcion != 5);
        

        sc.close();
    }
}	