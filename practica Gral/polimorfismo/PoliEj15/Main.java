package PoliEj15;

public class Main {
    public static void main(String[] args) {
        Laboratorio lab1 = new Laboratorio("Lasin 1", 10);
        Laboratorio lab2 = new Laboratorio("Lasin 2", 10);

        Ordenador o1 = new Ordenador("A001", 1, 4, "i3", "activo");
        Ordenador o2 = new Ordenador("A002", 2, 16, "i7", "activo");
        Ordenador o3 = new Ordenador("A003", 3, 8, "Ryzen 5", "inactivo");
        Ordenador o4 = new Ordenador("A004", 4, 12, "i5", "activo");
        Ordenador o5 = new Ordenador("B001", 5, 4, "i3", "inactivo");
        Ordenador o6 = new Ordenador("B002", 6, 32, "i9", "activo");

        lab1.agregarOrdenador(o1);
        lab1.agregarOrdenador(o2);
        lab1.agregarOrdenador(o3);
        lab1.agregarOrdenador(o4);

        lab2.agregarOrdenador(o5);
        lab2.agregarOrdenador(o6);

        System.out.println("\n--- Ordenadores activos ---");
        lab1.informacion("activo");

        System.out.println("\n--- Ordenadores en Lasin 1 ---");
        lab1.informacion(lab1);

        System.out.println("\n--- Ordenadores con RAM > 8 ---");
        lab1.informacion(8);

        System.out.println("\n--- Traslado de 2 ordenadores de Lasin 1 a Lasin 2 ---");
        lab1.trasladar(lab2, 2);
    }
}