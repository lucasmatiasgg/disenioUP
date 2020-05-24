
public class Cuenta {
	private String tipo;
	private String balance;
	
	public Cuenta(String cuenta, String balance) {
		this.tipo = cuenta;
		this.balance = balance;
	}

	public String toString() {
		return "Cuenta: " + getTipo() + " Saldo: " + getBalance();
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	
}
