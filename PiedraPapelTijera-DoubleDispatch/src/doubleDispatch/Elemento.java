package doubleDispatch;

public interface Elemento {
	abstract Elemento jugar(Elemento e);
	abstract Elemento jugar(Piedra p);
	abstract Elemento jugar(Papel p);
	abstract Elemento jugar(Tijera t);	
}
