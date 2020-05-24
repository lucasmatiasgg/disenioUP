
public class CuentaAdapter {
	
	private ServicioCuenta servicio = new ServicioCuenta();
	
	public Cuenta getCuentaExterior(int numeroCuenta) {
		CuentaExterna datosCuenta = servicio.servicioCuenta(numeroCuenta);
		
		String cuenta = datosCuenta.getTipo() + " " + datosCuenta.getNumeroCuenta();
		
		String signoMoneda;
		signoMoneda = datosCuenta.getMoneda() == "ARS"  ? "$" : "u$s";
		
		String balance = signoMoneda + " " + datosCuenta.getBalance();
		
		return new Cuenta(cuenta, balance);
	}
}
