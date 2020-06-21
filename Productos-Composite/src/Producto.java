
public class Producto extends AbstractProduct{
	
	private String marca;
	
	public Producto() {
	}
	
	public Producto(String nombre, double precio, String marca) {
		super(nombre, precio);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
}
