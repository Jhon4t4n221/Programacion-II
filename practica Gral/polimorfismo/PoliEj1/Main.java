package PoliEj1;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica cuadrado = new Cuadrado(5);
        FiguraGeometrica rectangulo = new Rectangulo(4, 6);
        FiguraGeometrica circulo = new Circulo(3);
        FiguraGeometrica triangulo = new Triangulo(5,4,3);

        System.out.println("area del cuadrado: " + cuadrado.calcArea());
        System.out.println("perímetro del cuadrado: " + cuadrado.calcPerimetro());
        System.out.println();
        
        System.out.println("area del rectángulo: " + rectangulo.calcArea());
        System.out.println("perímetro del rectángulo: " + rectangulo.calcPerimetro());
        System.out.println();
        
        System.out.println("area del círculo: " + circulo.calcArea());
        System.out.println("perímetro del círculo: " + circulo.calcPerimetro());
        System.out.println();
        
        System.out.println("area del triangulo: "+triangulo.calcArea());
        System.out.println("perimetro del triangulo: "+triangulo.calcPerimetro());
    }
}
