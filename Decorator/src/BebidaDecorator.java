
public abstract class BebidaDecorator implements IBebida{
	protected IBebida bebida;
	
	
	public BebidaDecorator(IBebida bebida) {
		this.setBebida(bebida);
	}
	
	@Override
	public double precio() {
		return bebida.precio();
	}

	public IBebida getBebida() {
		return bebida;
	}

	public void setBebida(IBebida bebida) {
		this.bebida = bebida;
	}
	
	
}
