package doubleDispatch;

public class Tijera implements Elemento{
	
	public Elemento jugar(Elemento e) {
		return e.jugar(this);
	}
	
	public Elemento jugar(Piedra p) {
		return p;
	}
	
	public Elemento jugar(Papel p) {
		return this;
	}
	
	public Elemento jugar(Tijera t) {	
		return null;
	}
	
	public String toString() {
		return "Tijera";
	}

}
