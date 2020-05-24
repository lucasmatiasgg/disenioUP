
public class ServicioCuenta {
	
	public ServicioCuenta() {
		
	}
	public CuentaExterna servicioCuenta(int numeroCuenta) {
		
		switch(numeroCuenta) {
		case 100:
			return new CuentaExterna(numeroCuenta, "CA", 1500, "ARS");
		case 200:
			return new CuentaExterna(numeroCuenta, "CA", 9000, "ARS");
		case 300:
			return new CuentaExterna(numeroCuenta, "CC", 3000, "ARS");
		case 400:
			return new CuentaExterna(numeroCuenta, "CA", 400, "DOL");
		default:
			return null;
		}
		
	}
}
