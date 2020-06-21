package banco.cuenta;

public class CajaAhorroDolares implements ICuenta{
	
	private Double saldo;
	
	public CajaAhorroDolares() {
	}
	
	public CajaAhorroDolares clone() {
		CajaAhorroDolares cd = new CajaAhorroDolares();
		cd.setSaldo(getSaldo());
		
		return cd;
	}
	
	@Override
	public void transferir(ICuenta destino, double monto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public void setSaldo(double saldo, double monto) {
		this.saldo = saldo;
	}

	@Override
	public double getSaldo() {
		return saldo;
	}

}
