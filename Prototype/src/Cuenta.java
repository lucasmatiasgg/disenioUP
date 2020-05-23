
public class Cuenta {
	private int numero;
	private String tipo;
	
	public Cuenta() {
	}
	
	public Cuenta clone() {
		Cuenta cuenta = new Cuenta();
		cuenta.setNumero(getNumero());
		cuenta.setTipo(getTipo());
		return cuenta;
	}

	public String toString() {
		return "Cuenta numero: " + getNumero() + " Tipo: " + getTipo();
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
