package HereEj7;
public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Juan", "Vargas", "Lopez", 20, "RU123", "MAT2023");
        Estudiante e2 = new Estudiante("Ana", "Perez", "Soto", 22, "RU456", "MAT2024");
        Docente d1 = new Docente("Carlos", "Fernandez", "Diaz", 22, 5000, "REG789");

        System.out.println("=== Estudiantes ===");
        e1.mostrar();
        e2.mostrar();
        System.out.println("=== Docente ===");
        d1.mostrar();

        double promedioEdad = (e1.getEdad() + e2.getEdad()) / 2.0;
        System.out.println("\nPromedio de edad de estudiantes: " + promedioEdad);

        e1.modificarEdad(25);
        System.out.println("\nEdad modificada del estudiante 1:");
        e1.mostrar();

        if (e1.getEdad() == d1.getEdad() || e2.getEdad() == d1.getEdad()) {
            System.out.println("\nUno de los estudiantes tiene la misma edad que el docente.");
        } else {
            System.out.println("\nNingún estudiante tiene la misma edad que el docente.");
        }
    }
}
