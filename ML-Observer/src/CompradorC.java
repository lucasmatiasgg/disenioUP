
public class CompradorC implements Comprador{

	/*
	 * 
	 * Este comprador solo oferta hasta 300 pesos.
	 */
	private String nombre;
	@Override
	public float ofertar(Subasta subasta) {
		if(subasta.getPrecio() > 300) {
			return 0;
		}else {
			return subasta.getPrecio() + 25;
		}	
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
