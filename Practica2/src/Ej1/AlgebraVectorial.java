package Ej1;
import java.util.*;
class AlgebraVectorial {
    private double x, y, z;

    // Constructor
    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Suma
    public AlgebraVectorial suma(AlgebraVectorial v) {
        return new AlgebraVectorial(x + v.x, y + v.y, z + v.z);
    }

    // Resta
    public AlgebraVectorial resta(AlgebraVectorial v) {
        return new AlgebraVectorial(x - v.x, y - v.y, z - v.z);
    }

    // Producto punto
    public double productoPunto(AlgebraVectorial v) {
        return x * v.x + y * v.y + z * v.z;
    }

    // Producto cruz
    public AlgebraVectorial productoCruz(AlgebraVectorial v) {
        double cx = y * v.z - z * v.y;
        double cy = z * v.x - x * v.z;
        double cz = x * v.y - y * v.x;
        return new AlgebraVectorial(cx, cy, cz);
    }

    // Norma
    public double norma() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Perpendicularidad: producto punto = 0
    public boolean esPerpendicular(AlgebraVectorial v) {
        return this.productoPunto(v) == 0;
    }

    // Paralelismo: producto cruz = (0,0,0)
    public boolean esParalelo(AlgebraVectorial v) {
        AlgebraVectorial cruz = this.productoCruz(v);
        return cruz.x == 0 && cruz.y == 0 && cruz.z == 0;
    }

    // Proyección de a sobre b: (a·b / |b|^2) * b
    public AlgebraVectorial proyeccionSobre(AlgebraVectorial v) {
        double escalar = this.productoPunto(v) / Math.pow(v.norma(), 2);
        return new AlgebraVectorial(escalar * v.x, escalar * v.y, escalar * v.z);
    }

    // Componente de a en dirección de b: (a·b) / |b|
    public double componenteEn(AlgebraVectorial v) {
        return this.productoPunto(v) / v.norma();
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

