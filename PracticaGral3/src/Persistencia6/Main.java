package Persistencia6;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sistema s = new Sistema();

        System.out.println("=== SISTEMA DE LIBRERÍA (Persistencia JSON) ===\n");

        System.out.println("Cargando datos desde archivos JSON...");
        System.out.println("Libros cargados: " + s.listarLibros().size());
        System.out.println("Clientes cargados: " + s.listarClientes().size());
        System.out.println("Préstamos cargados: " + s.listarPrestamos().size());
        System.out.println("---------------------------------------\n");

        System.out.println("Agregando datos de ejemplo...\n");

        s.agregarLibro(new Libro("L1", "Harry Potter", 120));
        s.agregarLibro(new Libro("L2", "Aprendiendo Java", 80));
        s.agregarLibro(new Libro("L3", "Estructuras de Datos", 150));

        s.agregarCliente(new Cliente("C1", "123456", "Juan", "Pérez"));
        s.agregarCliente(new Cliente("C2", "654321", "María", "González"));

        s.agregarPrestamo(new Prestamo("C1", "L1", "2025-10-01", 2));
        s.agregarPrestamo(new Prestamo("C2", "L1", "2025-10-02", 1));
        s.agregarPrestamo(new Prestamo("C1", "L3", "2025-10-03", 1));

        System.out.println("Datos registrados correctamente.\n");

        // a) libros entre precios
        System.out.println("a) Libros entre 70 y 130:");
        for (Libro l : s.librosEntre(70, 130)) {
            System.out.println("   " + l);
        }
        System.out.println();

        // b) ingreso total por libro
        System.out.println("b) Ingreso total generado por el libro L1:");
        System.out.println("   Bs " + s.ingresoPorLibro("L1") + "\n");

        // c) libros nunca vendidos
        System.out.println("c) Libros que nunca fueron vendidos:");
        List<Libro> noVendidos = s.librosNoVendidos();
        if (noVendidos.isEmpty()) {
            System.out.println("   Ninguno.");
        } else {
            for (Libro l : noVendidos) {
                System.out.println("   " + l);
            }
        }
        System.out.println();

        // d) clientes que compraron un libro
        System.out.println("d) Clientes que compraron el libro L1:");
        for (Cliente c : s.clientesQueCompraron("L1")) {
            System.out.println("   " + c);
        }
        System.out.println();

        // e) libro más prestado
        System.out.println("e) Libro más prestado:");
        Libro masPrestado = s.libroMasPrestado();
        System.out.println("   " + (masPrestado != null ? masPrestado : "No hay registros") + "\n");

        // f) cliente con más préstamos
        System.out.println("f) Cliente con más préstamos:");
        Cliente masCliente = s.clienteMasPrestamos();
        System.out.println("   " + (masCliente != null ? masCliente : "No hay registros") + "\n");

        System.out.println("=== FIN DEL PROGRAMA ===");
    }
}

