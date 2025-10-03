package PoliEj1;

public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcArea() {
        return base * altura;
    }

    @Override
    public double calcPerimetro() {
        return 2 * (base + altura);
    }
}
