package Ej2;

class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // a) Suma
    public Vector3D sumar(Vector3D v) {
        return new Vector3D(x + v.x, y + v.y, z + v.z);
    }

    // b) Multiplicación por escalar
    public Vector3D escalar(double r) {
        return new Vector3D(r * x, r * y, r * z);
    }

    // c) Norma
    public double norma() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // d) Normalización
    public Vector3D normal() {
        double n = norma();
        if (n == 0) return new Vector3D(0, 0, 0);
        return new Vector3D(x / n, y / n, z / n);
    }

    // e) Producto escalar
    public double productoPunto(Vector3D v) {
        return x * v.x + y * v.y + z * v.z;
    }

    // f) Producto cruz
    public Vector3D productoCruz(Vector3D v) {
        double cx = y * v.z - z * v.y;
        double cy = z * v.x - x * v.z;
        double cz = x * v.y - y * v.x;
        return new Vector3D(cx, cy, cz);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
