
public class DragonFly implements JugadorFly{

	private int vidaTotal;
	private int ataque;
	private int defensa;
	
	public DragonFly() {
		this.vidaTotal = 150;
		this.ataque = 15;
		this.defensa = 10;
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
