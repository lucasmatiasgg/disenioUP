import java.util.ArrayList;

public class Grupo implements IGrupo{
	
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	private ArrayList<String> mensajes;
	
	@Override
	public ArrayList<String> enviar(String mensaje, Persona emisor) {
		mensajes = new ArrayList<String>();
		for(Persona persona : personas) {
			if(persona != emisor) {
				mensajes.add(persona.recibir(mensaje)); 
			}
		}
		return mensajes;
	}
	
	public void add(Persona persona) {
		personas.add(persona);
	}
	
	public void remove(Persona persona) {
		personas.remove(persona);
	}
	
}
