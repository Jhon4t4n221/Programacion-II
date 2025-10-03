package HereEj11;

public class Main {
    public static void main(String[] args) {
        JefePolicia jefe1 = new JefePolicia("Carlos Lopez", 45, 5000, "Seguridad", "Capitán", "Antinarcóticos");
        JefePolicia jefe2 = new JefePolicia("Maria Perez", 40, 5500, "Investigaciones", "Capitán", "Anticorrupción");

        System.out.println("=== Datos de los Jefes de Policía ===");
        System.out.println(jefe1);
        System.out.println(jefe2);

        System.out.println("\n=== Jefe con mayor sueldo ===");
        if (jefe1.getSueldo() > jefe2.getSueldo()) {
            System.out.println(jefe1.getNombre() + " tiene mayor sueldo.");
        } else if (jefe1.getSueldo() < jefe2.getSueldo()) {
            System.out.println(jefe2.getNombre() + " tiene mayor sueldo.");
        } else {
            System.out.println("Ambos tienen el mismo sueldo.");
        }

        System.out.println("\n=== Comparación de Grados ===");
        if (jefe1.getGrado().equals(jefe2.getGrado())) {
            System.out.println("Ambos tienen el mismo grado: " + jefe1.getGrado());
        } else {
            System.out.println("Tienen grados diferentes: " + jefe1.getGrado() + " y " + jefe2.getGrado());
        }
    }
}

