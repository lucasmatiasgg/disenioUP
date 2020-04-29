
public class Semaforo {
	private EstadoSemaforo estado;
	
	public Semaforo() {
		this.estado = new EstadoVerde();
	}
	
	public void setEstado(EstadoSemaforo estado) {
		this.estado = estado;
	}
	
	public void mostrar() {
		estado.mostrar();
	}
}

//ver de cambiar los estados "internamente" que pegue la vuelta.