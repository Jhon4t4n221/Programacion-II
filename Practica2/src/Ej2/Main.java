package Ej2;

public class Main {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, 5, 6);

        System.out.println("Suma: " + a.sumar(b));
        System.out.println("Escalar (a*2): " + a.escalar(2));
        System.out.println("Norma de a: " + a.norma());
        System.out.println("Normalizado de a: " + a.normal());
        System.out.println("Producto punto: " + a.productoPunto(b));
        System.out.println("Producto cruz: " + a.productoCruz(b));
    }
}