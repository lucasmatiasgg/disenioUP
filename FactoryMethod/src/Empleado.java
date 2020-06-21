
public class Empleado {
	private String nombre;
	private int legajo;
	private int antiguedad;
	private String patenteAuto;
	
	public Empleado(String nom, int leg, int ant) {
		this.nombre = nom;
		this.legajo = leg;
		this.antiguedad = ant;
	}
	
	public Auto crearAuto(String patente) {
		this.patenteAuto = patente;
		return new Auto(patente);
		
	}
	
	public String toString() {
		return "Nombre: " + getNombre() + " Legajo: " + getLegajo() + 
				(getPatenteAuto()!= null ? " Patente Auto: " + getPatenteAuto() : "");
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public String getPatenteAuto() {
		return patenteAuto;
	}
	
}
