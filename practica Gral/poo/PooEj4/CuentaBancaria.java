package PooEj4;

public class CuentaBancaria {
	private String titular;
	private int nCuenta;
	private double saldo;
	
	public CuentaBancaria(String titular, int nCuenta, double saldo) {
		this.titular = titular;
		this.nCuenta = nCuenta;
		this.saldo = saldo;
	}
	
	public void mostrar() {
		System.out.println("titular: "+this.titular);
		System.out.println("nro de cuenta: "+this.nCuenta);
		System.out.println("saldo total: "+this.saldo);
	}
	
	public void depositar(double adiMonto) {
		if(adiMonto < 0) {
			System.out.println("error, saldo inferior al limite");
		}else {
			adiMonto = this.saldo + adiMonto;
			System.out.println("se acaba de depositar: "+adiMonto+"a la cuenta");
			this.saldo = this.saldo + adiMonto;
			System.out.println("saldo total:"+this.saldo);
		}
	}
	
	public void retirar(double retiMonto) {
		if(retiMonto > saldo) {
			System.out.println("la cuenta no dispone de ese monto que solicita");
		}else {
			retiMonto = this.saldo - retiMonto;
			System.out.println("se retiro: "+retiMonto+"de la cuenta");
			this.saldo = this.saldo - retiMonto;
			System.out.println("saldo total: "+this.saldo);
		}
	}
}
