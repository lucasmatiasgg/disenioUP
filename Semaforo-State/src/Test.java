
public class Test {

	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo();
		
		System.out.println(semaforo.mostrar());
		
		semaforo.setEstado(new EstadoAmarillo());
		System.out.println(semaforo.mostrar());
		
		semaforo.setEstado(new EstadoRojo());
		System.out.println(semaforo.mostrar());

	}

}
