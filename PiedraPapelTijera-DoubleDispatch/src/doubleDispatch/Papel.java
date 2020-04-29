package doubleDispatch;

public class Papel implements Elemento{
	
	public Elemento jugar(Elemento e) {
		return e.jugar(this);
	}
	public Elemento jugar(Piedra p) {
		return this;
	}
	
	public Elemento jugar(Papel p) {
		return null;
	}
	
	public Elemento jugar(Tijera t) {	
		return t;
	}
	
	public String toString() {
		return "Papel";
	}

}
