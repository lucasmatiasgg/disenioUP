
public class Cafe implements IBebida{
	
	private String descripcion = "Cafe";
	
	@Override
	public double precio() {
		return 100;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public String toString() {
		return descripcion + ": $" + precio();
	}
}
