package PooEj3;

public class Producto {
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public void vender(int restarStock) {
		restarStock = stock --;
		System.out.println("se vendio el producto: "+nombre+restarStock);
	}
	
	public void reabastecer (int reab) {
		reab =  stock ++;
		System.out.println("se agrego la cantidad de: "+reab+" del producto al stock");
	}
	
	public void mostrar() {
		System.out.println("nombre del producto: "+nombre);
		System.out.println("precio: "+precio);
		System.out.println("stock disponible: "+stock);
	}
}
