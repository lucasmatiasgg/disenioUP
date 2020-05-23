
public class Soldado {
	
	private int posX;
	private int posY;
	private int vidaActual;
	
	private JugadorFly soldadoFly;
	
	public Soldado(String key, FlyFactory factory) {
		this.soldadoFly = factory.getFly(key);
		this.vidaActual = soldadoFly.getVidaTotal();
	}
	
	public String toString() {
		return "Datos generales:" + getSoldadoFly() + 
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

	public JugadorFly getSoldadoFly() {
		return soldadoFly;
	}

	public int getVidaActual() {
		return vidaActual;
	}

	public void setVidaActual(int vidaActual) {
		this.vidaActual = vidaActual;
	}
	
	
	
}
