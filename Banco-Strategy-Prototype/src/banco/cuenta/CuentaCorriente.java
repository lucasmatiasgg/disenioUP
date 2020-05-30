package banco.cuenta;

public class CuentaCorriente implements Cuenta{
	
	private double saldo;
	private double porcentaje = 2;
	
	public CuentaCorriente() {
	}
	
	public CuentaCorriente clone() {
		CuentaCorriente cc = new CuentaCorriente();
		cc.setSaldo(getSaldo());
		
		return cc;
	}
	@Override
	public void transferir(Cuenta destino, double monto) {
		verificarSaldo(monto);
		double descuento = (monto * porcentaje) / 100;
		saldo = saldo - monto - descuento;
		destino.setSaldo(destino.getSaldo() + monto);
	}

	private void verificarSaldo(double monto) {
		if(monto > saldo) {
			throw new RuntimeException("Saldo Insuficiente");
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
