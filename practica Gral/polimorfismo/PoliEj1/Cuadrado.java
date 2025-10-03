package PoliEj1;

public class Cuadrado extends FiguraGeometrica {
	private int lado;
	
	public Cuadrado(int lado) {
		this.lado = lado;
	}
	
	public double calcArea() {
		return lado * lado;
	}
	
	  @Override
	    public double calcPerimetro() {
	        return 4 * lado;
	    }
}