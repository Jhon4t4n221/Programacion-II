package Persistencia2;

public class Main {
    public static void main(String[] args) {

        ArchivoTrabajador arch = new ArchivoTrabajador();

        // Crear archivo vacío
        arch.crearArchivo();

        // Agregar trabajadores
        arch.guardarTrabajador(new Trabajador("Luis", 123, 2000));
        arch.guardarTrabajador(new Trabajador("Ana", 321, 3500));
        arch.guardarTrabajador(new Trabajador("Mario", 777, 1800));

        // Aumentar salario a un trabajador
        arch.aumentaSalario(500, new Trabajador("dummy", 321, 0));

        // Buscar mayor salario
        System.out.println("\nTrabajador con mayor salario:");
        System.out.println(arch.mayorSalario());

        // Ordenar
        System.out.println("\nOrdenando...");
        arch.ordenarPorSalario();
    }
}
