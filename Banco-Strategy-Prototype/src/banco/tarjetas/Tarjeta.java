package banco.tarjetas;

public class Tarjeta {
	private String numero;
	private int codigoSeguridad;
	private String titular;
	private String marca;
	
	public Tarjeta() {
		
	}
	
	public Tarjeta(String marca, int cod) {
		this.marca = marca;
		this.codigoSeguridad = cod;
	}
	
	public Tarjeta clone() {
		Tarjeta tc = new Tarjeta();
		tc.setNumero(getNumero());
		tc.setCodigoSeguridad(getCodigoSeguridad());
		tc.setMarca(""+getMarca());
		tc.setTitular(""+getTitular());
		
		return tc;
	}
	
	public String toString() {
		return "Tarjeta: " + getMarca() + " Numero: " + getNumero() + " Cod:" + getCodigoSeguridad();
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getCodigoSeguridad() {
		return codigoSeguridad;
	}
	public void setCodigoSeguridad(int codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
