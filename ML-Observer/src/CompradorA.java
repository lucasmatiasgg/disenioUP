
public class CompradorA implements Comprador{

	private String nombre;
	@Override
	public float ofertar(Subasta subasta) {
		return subasta.getPrecio() + 50;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		return nombre;
	}


}
