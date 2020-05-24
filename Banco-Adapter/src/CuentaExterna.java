
public class CuentaExterna {
	private int numeroCuenta;
	private String tipo;
	private double balance;
	private String moneda;
	
	public CuentaExterna(int numeroCuenta, String tipo, double balance, String moneda) {
		this.numeroCuenta=numeroCuenta;
		this.tipo=tipo;
		this.balance=balance;
		this.moneda=moneda;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	
}
