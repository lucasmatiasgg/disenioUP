
public class Semaforo {
	private EstadoSemaforo estado;
	
	public Semaforo() {
		this.estado = new EstadoVerde();
	}
	
	public void setEstado(EstadoSemaforo estado) {
		this.estado = estado;
	}
	
	public String mostrar() {
		return estado.mostrar();
	}
}