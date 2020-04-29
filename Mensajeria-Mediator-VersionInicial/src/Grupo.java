
import java.util.ArrayList;
import java.util.List;

public class Grupo {
	private String mensaje;
	List<Persona> personas = new ArrayList<Persona>();
	
	
	public void recibirMensaje(String mensaje) {
		setMensaje(mensaje);
		
		enviarMensaje();
	}
	
	public void enviarMensaje() {
		for(Persona persona : personas) {
			persona.leer(mensaje);
		}
	}
	
	public void addPersona(Persona persona) {
		personas.add(persona);
	}
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
