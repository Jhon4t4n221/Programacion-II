package EjComposicion2;

public class Main {
    public static void main(String[] args) {

        Departamento d1 = new Departamento("Sistemas", "Tecnología");
        Departamento d2 = new Departamento("Contabilidad", "Administración");

        Empleado e1 = new Empleado("Juan", "Analista", 3500);
        Empleado e2 = new Empleado("María", "Programadora", 4000);
        Empleado e3 = new Empleado("Luis", "Tester", 3200);
        Empleado e4 = new Empleado("Ana", "Diseñadora", 3000);
        Empleado e5 = new Empleado("Carlos", "Soporte", 2800);

        d1.agregarEmpleado(e1);
        d1.agregarEmpleado(e2);
        d1.agregarEmpleado(e3);
        d1.agregarEmpleado(e4);
        d1.agregarEmpleado(e5);

        d1.mostrarEmpleados();
        d2.mostrarEmpleados();

        d1.cambioSalario(5000);
        System.out.println("\n>>> Sueldos actualizados en Departamento Sistemas:");
        d1.mostrarEmpleados();

        System.out.println("\n¿Juan está en departamento 2?: " + d2.buscarEmpleado("Juan"));

        for (Empleado e : d1.getEmpleados()) {
            d2.agregarEmpleado(e);
        }
        d1.getEmpleados().clear();

        System.out.println("\n>>> Después de mover empleados:");
        d1.mostrarEmpleados();
        d2.mostrarEmpleados();
    }
}
