package doubleDispatch;

public class Piedra implements Elemento{
	
	public Elemento jugar(Elemento e) {
		return e.jugar(this);
	}
	
	public Elemento jugar(Piedra p) {
		return null;
	}
	
	public Elemento jugar(Papel p) {
		return p;
	}
	
	public Elemento jugar(Tijera t) {	
		return this;
	}
	
	public String toString() {
		return "Piedra";
	}
	
}
