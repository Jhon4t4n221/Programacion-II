package PooEj3;

public class Main {

	public static void main(String[] args) {
		Producto p1 = new Producto("papitas",5.50,10);
		Producto p2 = new Producto("juguitos",1.50,20);
		
		p1.vender(8);
		p1.reabastecer(10);
		System.out.println();
		
		p2.vender(10);
		p2.reabastecer(30);
		System.out.println();
	}

}
