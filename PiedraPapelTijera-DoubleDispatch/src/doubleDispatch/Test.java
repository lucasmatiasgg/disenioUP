package doubleDispatch;



public class Test {

	public static void main(String[] args) {
		
		Elemento piedra = new Piedra();
		Elemento tijera = new Tijera();
		Elemento papel = new Papel();
		
		mostrarResultado(piedra.jugar(papel));
		mostrarResultado(piedra.jugar(tijera));
		mostrarResultado(piedra.jugar(piedra));
		mostrarResultado(papel.jugar(piedra));
		mostrarResultado(papel.jugar(tijera));
		mostrarResultado(papel.jugar(papel));
		
	}
	
	public static void mostrarResultado(Elemento jugador) {
		if(jugador == null) {
			System.out.println("Empate");
		}else {
			System.out.println("Ganador:" + jugador);
		}
	}
}
