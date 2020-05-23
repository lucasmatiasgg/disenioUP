package banco.paquete;
import banco.cuenta.CajaAhorro;
import banco.tarjetas.Tarjeta;

public class Gold {
	private Tarjeta tarjeta;
	private CajaAhorro cajaAhorro;
	private String titular;
	
	public Gold() {
	}
	
	public Gold clone() {
		Gold gold = new Gold();
		
		gold.setCajaAhorro(getCajaAhorro().clone());
		gold.setTarjeta(getTarjeta().clone());
		gold.setTitular(""+getTitular());
		return gold;
	}
	
	
	public String toString() {
		return "Paquete Gold \n" + "Titular: " + 
	getTitular() +"\n" +"CA:" + getCajaAhorro() + "\n" + getTarjeta();
	}
	
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public CajaAhorro getCajaAhorro() {
		return cajaAhorro;
	}
	public void setCajaAhorro(CajaAhorro cajaAhorro) {
		this.cajaAhorro = cajaAhorro;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
}
