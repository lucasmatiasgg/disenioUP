package banco.paquete;

import banco.cuenta.CajaAhorro;
import banco.cuenta.CuentaCorriente;
import banco.tarjetas.Tarjeta;

public class Black {
	private CajaAhorro cajaAhorro;
	private Tarjeta tarjetaMaster;
	private Tarjeta tarjetaVisa;
	private CuentaCorriente cuentaCorriente;
	private String titular;
	
	public Black() {
	}
	
	public Black clone() {
		Black black = new Black();
		
		black.setCajaAhorro(getCajaAhorro().clone());
		black.setTarjetaMaster(getTarjetaMaster().clone());
		black.setTarjetaVisa(getTarjetaVisa().clone());
		black.setCuentaCorriente(getCuentaCorriente().clone());
		black.setTitular(""+getTitular());
		return black;
	}

	public String toString() {
		return "Paquete Black \n" + "Titular: " + 
				getTitular() +"\n" +"CA:" + getCajaAhorro() + "\n" + "\n" + 
				"CC:" + getCuentaCorriente() + "\n" +
				"Visa: " + getTarjetaVisa() + "\n" +
				"Mastercard: " + getTarjetaMaster();
	}

	public CajaAhorro getCajaAhorro() {
		return cajaAhorro;
	}

	public void setCajaAhorro(CajaAhorro cajaAhorro) {
		this.cajaAhorro = cajaAhorro;
	}

	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}

	public Tarjeta getTarjetaMaster() {
		return tarjetaMaster;
	}

	public void setTarjetaMaster(Tarjeta tarjetaMaster) {
		this.tarjetaMaster = tarjetaMaster;
	}

	public Tarjeta getTarjetaVisa() {
		return tarjetaVisa;
	}

	public void setTarjetaVisa(Tarjeta tarjetaVisa) {
		this.tarjetaVisa = tarjetaVisa;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
}
