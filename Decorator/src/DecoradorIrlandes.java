
public class DecoradorIrlandes extends BebidaDecorator{
	
	private String descripcion = "Irlandes";
	
	public DecoradorIrlandes(IBebida bebida) {
		super(bebida);
	}
	
	public String toString() {
		return getDescripcion()+ " : $" + this.precio();
	}
	
	@Override
	public double precio() {
		return bebida.precio() + 50;
	}

	@Override
	public String getDescripcion() {
		return bebida.getDescripcion() + " " + this.descripcion;
	}
	
	
}
