import java.util.ArrayList;

public class Grupo implements IGrupo{
	
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	
	@Override
	public void enviar(String mensaje, Persona emisor) {
		for(Persona persona : personas) {
			if(persona != emisor) {
				persona.recibir(mensaje);
			}
		}
	}
	
	public void add(Persona persona) {
		personas.add(persona);
	}
	
	public void remove(Persona persona) {
		personas.remove(persona);
	}
	
}
