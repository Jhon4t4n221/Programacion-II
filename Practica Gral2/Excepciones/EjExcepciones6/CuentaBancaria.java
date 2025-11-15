package EjExcepciones6;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
        }
        saldo += monto;
    }

    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto > saldo) {
            throw new FondosInsuficientesException(
                "Fondos insuficientes. Saldo actual: " + saldo + ", solicitado: " + monto
            );
        }
        saldo -= monto;
    }

    public void mostrarInfo() {
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("--------------------------");
    }
}
