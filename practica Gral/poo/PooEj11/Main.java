package PooEj11;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Ana López", 5);
        c1.mostrar();

        Pedido p1 = new Pedido("Café Latte", "Registrado");
        p1.mostrar();
    }
}
