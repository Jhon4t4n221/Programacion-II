package Persistencia7;

public class Main {
    public static void main(String[] args) {
        ArchNiño arch = new ArchNiño("ninos.dat");

        // Crear
        arch.agregar(new Niño("Luis", "Perez", "Gomez", 123, 10, 32, 140));
        arch.agregar(new Niño("Ana", "Lopez", "Rios", 456, 8, 25, 130));
        arch.agregar(new Niño("Mario", "Castro", "Soto", 789, 12, 50, 160));

        // Listar
        System.out.println("\nLISTA DE NIÑOS:");
        arch.listar();

        // b)
        System.out.println("\nNiños con peso adecuado: " + arch.contarPesoAdecuado());

        // c)
        arch.mostrarNoAdecuados();

        // d)
        System.out.println("\nPromedio de edad: " + arch.promedioEdad());

        // e)
        System.out.println("\nBuscando CI 456:");
        System.out.println(arch.buscar(456));

        // f)
        System.out.println("\nNiños con mayor talla:");
        arch.mostrarTallaMaxima();
    }
}
