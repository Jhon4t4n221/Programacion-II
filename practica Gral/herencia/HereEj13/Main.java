package HereEj13;

public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef("Remy", 3000, 10, "Pastelero", 50);
        Mesero mesero1 = new Mesero("Linguini", 2000, 300, 5, 30);
        Mesero mesero2 = new Mesero("Colette", 2200, 500, 8, 35);
        Administrativo admin1 = new Administrativo("Skinner", 2500, "Gerente");
        Administrativo admin2 = new Administrativo("Anton", 2400, "Contador");

        Empleado[] empleados = {chef, mesero1, mesero2, admin1, admin2};

        float X = 2500;
        System.out.println("\nEmpleados con sueldo igual a " + X + ":");
        for (Empleado e : empleados) {
            if (e.sueldoMes == X) {
                e.mostrar();
            }
        }

        System.out.println("\nSueldos totales considerando horas extra y propinas:");
        System.out.println(chef.nombre + ": " + chef.sueldoTotal(true));
        System.out.println(mesero1.nombre + ": " + mesero1.sueldoTotal(true, true));
        System.out.println(mesero2.nombre + ": " + mesero2.sueldoTotal(true, true));
    }
}
