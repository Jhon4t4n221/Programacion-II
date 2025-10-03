package PoliEj1;

public class Circulo extends FiguraGeometrica {
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double calcArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public double calcPerimetro() {
		return 2*Math.PI * radio;
	}
}
