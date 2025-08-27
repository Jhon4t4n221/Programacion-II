package Ej2;

import java.util.Scanner;

class EcuacionCuadratica {
    private double a, b, c;

    // Constructor
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Obtener el discriminante
    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    // Raíz 1
    public double getRaiz1() {
        double d = getDiscriminante();
        if (d >= 0) {
            return (-b + Math.sqrt(d)) / (2 * a);
        } else {
            return 0;
        }
    }

    // Raíz 2
    public double getRaiz2() {
        double d = getDiscriminante();
        if (d >= 0) {
            return (-b - Math.sqrt(d)) / (2 * a);
        } else {
            return 0;
        }
    }
}

