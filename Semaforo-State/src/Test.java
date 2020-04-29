
public class Test {

	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo();
		String estado;
		
		//estado = semaforo.mostrar();
		
		semaforo.setEstado(new EstadoAmarillo());
		semaforo.mostrar();
		
		semaforo.setEstado(new EstadoRojo());
		semaforo.mostrar();
		
	}

}
