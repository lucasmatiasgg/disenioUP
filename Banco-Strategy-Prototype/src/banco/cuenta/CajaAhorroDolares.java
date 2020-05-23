package banco.cuenta;

public class CajaAhorroDolares implements Cuenta{
	
	private Double saldo;
	
	public CajaAhorroDolares clone() {
		CajaAhorroDolares cd = new CajaAhorroDolares();
		cd.setSaldo(getSaldo());
		
		return cd;
	}
	
	@Override
	public void transferir(Cuenta destino, double monto) {
		// TODO Auto-generated method stub
		
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
