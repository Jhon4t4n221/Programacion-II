package PoliEj9;

public class Estudiante {
    private String nombre;
    private String apellidos;
    private double parcial1;
    private double parcial2;
    private double exFinal;
    
    public Estudiante(String nombre, String apellidos, double parcial1, double parcial2, double exFinal) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.exFinal = exFinal;
    }

    public Estudiante() {
        this("Juan", "Perez", 20.5, 10.2, 5.0);
    }

    public Estudiante(String nombre, String apellidos) {
        this(nombre, apellidos, 20.1, 30.0, 10.2);
    }

    private double calcularPromedio() {
        return ((parcial1 / 30) + (parcial2 / 30) + (exFinal / 40)) * 100;
    }

    public void notaFinal() {
        double nFinal = parcial1 + parcial2 + exFinal;
        System.out.println("Nota final (suma de parciales): " + nFinal);
    }

    public void notaFinal(boolean sobre100) {
        double prom = calcularPromedio();
        System.out.println("Promedio final sobre 100: " + prom);
    }

    public void aprobo() {
        double prom = calcularPromedio();
        if (prom >= 51) {
            System.out.println("El estudiante " + nombre + " " + apellidos + " aprobó (>51)");
        } else {
            System.out.println("El estudiante " + nombre + " " + apellidos + " no aprobó (>51)");
        }
    }

    public void aprobo(double notaMinima) {
        double prom = calcularPromedio();
        if (prom >= notaMinima) {
            System.out.println("El estudiante " + nombre + " " + apellidos + " aprobó (nota mínima: " + notaMinima + ")");
        } else {
            System.out.println("El estudiante " + nombre + " " + apellidos + " no alcanzó la nota mínima: " + notaMinima);
        }
    }

    public void aproboExtra(double nExtra) {
        double prom = calcularPromedio() + nExtra;
        if(prom > 100) prom = 100;
        if(prom >= 70) {
            System.out.println("El estudiante " + nombre + " " + apellidos + " aprobó con nota extra: " + prom);
        } else {
            System.out.println("El estudiante " + nombre + " " + apellidos + " no alcanza la nota mínima, incluso con nota extra: " + prom);
        }
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Parcial 1: " + parcial1);
        System.out.println("Parcial 2: " + parcial2);
        System.out.println("Examen Final: " + exFinal);
        System.out.println();
    }

    public void mostrar(boolean mostrarNota) {
        mostrar();
        if (mostrarNota) {
            double nFinal = parcial1 + parcial2 + exFinal;
            System.out.println("Nota final: " + nFinal);
        }
    }
}
