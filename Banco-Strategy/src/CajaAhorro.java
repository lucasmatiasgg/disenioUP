
public class CajaAhorro implements Cuenta{
	
	private Double saldo;
	
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

	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;	
	}

	@Override
	public double getSaldo() {
		return saldo;
	}
}


