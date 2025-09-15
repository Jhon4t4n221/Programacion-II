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






//implementacion en python
import math

class Vector3D:
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z

    # a) Suma
    def sumar(self, v):
        return Vector3D(self.x + v.x, self.y + v.y, self.z + v.z)

    # b) Multiplicación por escalar
    def escalar(self, r):
        return Vector3D(r * self.x, r * self.y, r * self.z)

    # c) Norma
    def norma(self):
        return math.sqrt(self.x**2 + self.y**2 + self.z**2)

    # d) Normalización
    def normal(self):
        n = self.norma()
        if n == 0:
            return Vector3D(0, 0, 0)
        return Vector3D(self.x / n, self.y / n, self.z / n)

    # e) Producto escalar
    def producto_punto(self, v):
        return self.x * v.x + self.y * v.y + self.z * v.z

    # f) Producto cruz
    def producto_cruz(self, v):
        cx = self.y * v.z - self.z * v.y
        cy = self.z * v.x - self.x * v.z
        cz = self.x * v.y - self.y * v.x
        return Vector3D(cx, cy, cz)

    def __str__(self):
        return f"({self.x}, {self.y}, {self.z})"


# Clase de prueba
if __name__ == "__main__":
    a = Vector3D(1, 2, 3)
    b = Vector3D(4, 5, 6)

    print("Suma:", a.sumar(b))
    print("Escalar (a*2):", a.escalar(2))
    print("Norma de a:", a.norma())
    print("Normalizado de a:", a.normal())
    print("Producto punto:", a.producto_punto(b))
    print("Producto cruz:", a.producto_cruz(b))

