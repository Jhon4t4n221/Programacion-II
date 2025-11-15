package EjExcepciones6;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("12345", "Juan Pérez", 1000);

        cuenta.mostrarInfo();

        // Depósito válido
        try {
            cuenta.depositar(500);
            System.out.println("Depósito exitoso.");
        } catch (Exception e) {
            System.out.println("ERROR depósito: " + e.getMessage());
        }

        // Depósito inválido
        try {
            cuenta.depositar(-200);
        } catch (Exception e) {
            System.out.println("ERROR depósito: " + e.getMessage());
        }

        // Retiro válido
        try {
            cuenta.retirar(300);
            System.out.println("Retiro exitoso.");
        } catch (FondosInsuficientesException e) {
            System.out.println("ERROR retiro: " + e.getMessage());
        }

        // Retiro inválido (excede saldo)
        try {
            cuenta.retirar(5000);
        } catch (FondosInsuficientesException e) {
            System.out.println("ERROR retiro: " + e.getMessage());
        }

        cuenta.mostrarInfo();
    }
}
