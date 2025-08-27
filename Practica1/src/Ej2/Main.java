package Ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingrese a, b, c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Crear objeto
        EcuacionCuadratica eq = new EcuacionCuadratica(a, b, c);

        double d = eq.getDiscriminante();

        // Mostrar resultados
        if (d > 0) {
            System.out.println("La ecuación tiene dos raíces " + eq.getRaiz1() + " y " + eq.getRaiz2());
        } else if (d == 0) {
            System.out.println("La ecuación tiene una raíz " + eq.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }

        sc.close();
    }
}
