
public class DecoradorLeche extends BebidaDecorator{
	
	private String descripcion = " con leche";
	
	public DecoradorLeche(IBebida bebida) {
		super(bebida);
	}
	
	public String toString() {
		return getDescripcion()  + " : $" + this.precio();
	}
	
	@Override
	public double precio() {
		return bebida.precio() + 20;
	}

	@Override
	public String getDescripcion() {
		return bebida.getDescripcion() + " " + this.descripcion;
	}
}
