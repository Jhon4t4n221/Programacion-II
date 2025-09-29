package Ej1;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     Empleado[] empleados = new Empleado[5];

	     System.out.println("=== Registro de Empleados Tiempo Completo ===");
	     for (int i = 0; i < 3; i++) {
	         System.out.print("Nombre del empleado " + (i+1) + ": ");
	         String nombre = sc.nextLine();
	         System.out.print("Salario anual: ");
	         double salarioAnual = sc.nextDouble();
	         sc.nextLine();
	         empleados[i] = new EmpleadoTiempoCompleto(nombre, salarioAnual);
	     }

	     System.out.println("\n=== Registro de Empleados Tiempo Horario ===");
	     for (int i = 3; i < 5; i++) {
	         System.out.print("Nombre del empleado " + (i-2) + ": ");
	         String nombre = sc.nextLine();
	         System.out.print("Horas trabajadas: ");
	         double horas = sc.nextDouble();
	         System.out.print("Tarifa por hora: ");
	         double tarifa = sc.nextDouble();
	         sc.nextLine();
	         empleados[i] = new EmpleadoTiempoHorario(nombre, horas, tarifa);
	     }

	     System.out.println("\n=== Datos de Empleados ===");
	     for (Empleado e : empleados) {
	         System.out.println(e.toString());
	     }
	 }
}
