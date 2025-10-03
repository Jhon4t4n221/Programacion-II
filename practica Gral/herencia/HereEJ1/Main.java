package HereEJ1;

public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("Carlos", "Perez", "123456", "C001", "ID789");
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido() +
                           ", CI: " + cliente.getCi() +
                           ", NroCompra: " + cliente.getnCompra() +
                           ", IdCliente: " + cliente.getIdCliente());

        // Crear un jefe
        Jefe jefe = new Jefe("Laura", "Gomez", "654321", "Sucursal Central", "General");
        System.out.println("Jefe: " + jefe.getNombre() + " " + jefe.getApellido() +
                           ", CI: " + jefe.getCi() +
                           ", Sucursal: " + jefe.getSucursal() +
                           ", Tipo: " + jefe.getTipo());
    }
}