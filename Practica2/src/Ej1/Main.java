package Ej1;

public class Main {
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(1, 2, 3);
        AlgebraVectorial b = new AlgebraVectorial(2, 4, 6);

        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);

        System.out.println("¿Perpendiculares? " + a.esPerpendicular(b));
        System.out.println("¿Paralelos? " + a.esParalelo(b));

        System.out.println("Producto punto: " + a.productoPunto(b));
        System.out.println("Producto cruz: " + a.productoCruz(b));

        System.out.println("Proyección de a sobre b: " + a.proyeccionSobre(b));
        System.out.println("Componente de a en dirección de b: " + a.componenteEn(b));
    }
}
