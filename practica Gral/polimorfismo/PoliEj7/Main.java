package PoliEj7;
public class Main {
    public static void main(String[] args) {
        Parada p1 = new Parada();

        p1.adicionar("Juan");
        p1.adicionar("Ana");

        p1.adicionar("Toyota", "Land Cruiser", "Carlos");
        p1.adicionar("Nissan", "Tundra", "Luis");

        p1.mostrar();

        Parada p2 = new Parada("Parada Central", 5, 5);
        p2.adicionar("Pedro");
        p2.adicionar("Mazda", "CX-5", "Sofia");
        p2.mostrar();
    }
}
