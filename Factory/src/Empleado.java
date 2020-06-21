
public class Empleado {
	private String nombre;
	private int legajo;
	private Auto auto;
	
	public Empleado() {
	}
	
	public Empleado(String nom, int leg) {
		this.nombre = nom;
		this.legajo = leg;
	}
	
	public String toString() {
		return "Nombre: " + getNombre() + " Legajo: " + getLegajo() + " Auto: " + getAuto();
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
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	
	
}
