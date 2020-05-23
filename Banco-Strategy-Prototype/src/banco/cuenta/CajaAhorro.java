package banco.cuenta;

public class CajaAhorro implements Cuenta{
	
	private Double saldo;
	
	public CajaAhorro() {
	}
	
	public CajaAhorro clone() {
		CajaAhorro ca = new CajaAhorro();
		ca.setSaldo(getSaldo());
		
		return ca;
	}
	
	
	@Override
	public void transferir(Cuenta destino, double monto) {
		verificarSaldo(monto);
		this.setSaldo(this.getSaldo() - monto);
		destino.setSaldo(destino.getSaldo() + monto);
		
	}
	private void verificarSaldo(double monto) {
		if(monto > saldo) {
			throw new RuntimeException("Saldo insuficiente");
		}
		
	}
	
	public String toString() {
		return "Saldo actual: " + getSaldo();
	}
	
	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;	
	}

	@Override
	public double getSaldo() {
		return saldo;
	}
}


