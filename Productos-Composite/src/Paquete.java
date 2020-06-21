import java.util.ArrayList;
import java.util.List;

public class Paquete extends AbstractProduct{
	
	private List<AbstractProduct> productos = new ArrayList<AbstractProduct>();
	
	public Paquete() {
	}
	
	public Paquete(String nombre) {
		super(nombre,0);
	}
	
	@Override
	public double getPrecio() {
		double precio = 0;
		for(AbstractProduct prods : productos) {
			precio += prods.getPrecio();
		}
		return precio;
	}
	
	public void addProducto(AbstractProduct prod) {
		productos.add(prod);
	}
	
	public void removeProducto(AbstractProduct prod) {
		productos.remove(prod);
	}
	
	public String toString() {
		String nombre = "";
		for(AbstractProduct prods : productos) {
			nombre = nombre + prods.getNombre() + "\n";
		}
		
		return getNombre() + "\nProductos:\n" + nombre + "Precio: $" + this.getPrecio();
	}

}
