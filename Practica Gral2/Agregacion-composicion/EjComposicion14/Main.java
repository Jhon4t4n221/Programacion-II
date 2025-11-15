package EjComposicion14;

public class Main {
    public static void main(String[] args) {
        
        Empresa emp = new Empresa("Google Bolivia");

        emp.agregarEmpleado(new Empleado("Carlos", "Ingeniero", 5500));
        emp.agregarEmpleado(new Empleado("María", "Diseñadora", 4800));
        emp.agregarEmpleado(new Empleado("Luis", "Analista", 6200));

        System.out.println("Estado inicial:");
        emp.mostrarInfo();

        System.out.println("\nBuscando empleado 'María':");
        Empleado encontrado = emp.buscarEmpleado("María");
        if (encontrado != null) encontrado.mostrarInfo();

        System.out.println("\nEliminando empleado 'Carlos'...");
        emp.eliminarEmpleado("Carlos");

        System.out.println("\nEstado después de eliminar:");
        emp.mostrarInfo();

        System.out.println("\nPromedio salarial:");
        System.out.println(emp.promedioSalarial());

        System.out.println("\nEmpleados con salario mayor a 5000:");
        emp.empleadosConSalarioMayorA(5000);
    }
}
