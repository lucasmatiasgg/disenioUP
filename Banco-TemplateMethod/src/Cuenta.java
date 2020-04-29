
public abstract class Cuenta {
	
	private Double saldo;
	
	abstract double calcularComision(Double monto);
	
	public final void transferir(Cuenta destino, Double monto) {
		double montoConComision = monto + calcularComision(monto);		
		verificarSaldo(montoConComision);
		destino.saldo += monto;
		saldo = saldo - montoConComision;
	}
	
	private void verificarSaldo(Double monto) {
		if(saldo < monto) {
			throw new RuntimeException("Saldo insuficiente");
		}
	}
	
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	};
}
