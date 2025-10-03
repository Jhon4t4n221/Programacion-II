package PooEj11;

public class Cliente {
	private String nombre;
	private int mesa;
	
	public Cliente(String nombre, int mesa) {
     this.nombre = nombre;
     this.mesa = mesa;
 }
	public String getNombre() {
		return nombre;
 }
	public void setNombre(String nombre) {
		this.nombre = nombre;
 }
	public int getMesa() {
		return mesa;
 }
	public void setMesa(int mesa) {
		this.mesa = mesa;
 }
@Override
protected void finalize() throws Throwable {
     System.out.println("El objeto Cliente fue destruido.");
 }

 public void mostrar() {
     System.out.println("Cliente: " + nombre + " | Mesa: " + mesa);
 }
}
