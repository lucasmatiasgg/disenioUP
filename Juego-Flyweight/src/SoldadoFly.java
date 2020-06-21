
public class SoldadoFly implements JugadorFly{

	private int vidaTotal;
	private int ataque;
	private int defensa;
	
	public SoldadoFly() {
		this.vidaTotal = 100;
		this.ataque = 10;
		this.defensa = 5;
	}
	
	@Override
	public int getVidaTotal() {
		return vidaTotal;
	}

	@Override
	public void setVidaTotal(int vidaTotal) {
		this.vidaTotal = vidaTotal;
	}
	
	@Override
	public int getAtaque() {
		return ataque;
	}
	@Override
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	@Override
	public int getDefensa() {
		return defensa;
	}
	
	@Override
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

}
