
public class Dragon {
	private int posX;
	private int posY;
	private int vidaActual;
	private JugadorFly dragonFly;
	
	public Dragon(FlyFactory factory) {
		this.dragonFly = factory.getFly(FlyFactory.DRAGON_200);
		this.vidaActual = dragonFly.getVidaTotal();
	}
	
	public String toString() {
		return "Datos generales:" + getDragonFly() + 
				"\nPosx: " + getPosX() + " PosY: " + getPosY() + " VidaActual: " + getVidaActual() + "\n";
	}
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getVidaActual() {
		return vidaActual;
	}

	public void setVidaActual(int vidaActual) {
		this.vidaActual = vidaActual;
	}

	public JugadorFly getDragonFly() {
		return dragonFly;
	}
	
	
}
