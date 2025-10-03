package PoliEj1;

public class Triangulo extends FiguraGeometrica {
	private double base;
	private double altura;
	private double lado;
	
	public Triangulo(double base, double altura, double lado) {
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	
	public double calcArea() {
		return(base * altura)/2;
	}
	
	public double calcPerimetro() {
		return base + (lado*2);
	}
}
