package Ej1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los valores de a, b, c, d, e, f:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        EcuacionLineal eq = new EcuacionLineal(a, b, c, d, e, f);

        if (eq.tieneSolucion()) {
            System.out.println("x = " + eq.getX() + ", y = " + eq.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }

        sc.close();
    }
}