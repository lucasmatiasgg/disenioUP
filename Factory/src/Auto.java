
public class Auto {
	private String patente;
	private String marca;
	private String anio;
	
	public Auto() {
	}

	public Auto(String patente) {
		this.patente = patente;
	}
	
	public Auto(String patente, String marca, String anio) {
		this.patente = patente;
		this.marca = marca;
		this.anio = anio;
	}
	
	public String toString() {
		return "Patente: " + getPatente() + " Marca: " + getMarca() + " Modelo: " + getAnio();
	}
	
	
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	
}
