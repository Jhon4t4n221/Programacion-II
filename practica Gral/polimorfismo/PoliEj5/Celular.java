package PoliEj5;

public class Celular {
	private int nTel;
	private String dueño;
	private int espacio;
	private int ram;
	private int nApp;
	
	public Celular(int nTel, String dueño, int espacio, int ram, int nApp) {
		this.nTel = nTel;
		this.dueño = dueño;
		this.espacio = espacio;
		this.ram = ram;
		this.nApp = nApp;
	}
	
	public void mostrarDatos() {
		System.out.println("nro telefono: "+this.nTel);
		System.out.println("dueño: "+this.dueño);
		System.out.println("espacio de almacenamiento: "+this.espacio);
		System.out.println("ram disponible: "+this.ram);
		System.out.println("numero de apps: "+this.nApp);
	}
	
	public void incrementarApp() {
		nApp += 10;
	}
	
	public void reducirEspacio() {
		espacio -= 5;
		if(espacio < 0) {
			espacio = 0;
			System.out.println("sin espacio de almacenamiento libre");
		}
	}
}
