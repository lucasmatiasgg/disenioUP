import java.util.ArrayList;

public class Persona {
	protected IGrupo grupo;
	private String nombre;
	
	public Persona() {};
	
	public Persona (IGrupo grupo, String nom) {
		this.grupo = grupo;
		nombre = nom;
	}
	
	public ArrayList<String> enviar(String mensaje) {
		return grupo.enviar(mensaje, this);
	}
	
	public String recibir(String mensaje) {
		return (this.getNombre() + " está leyendo: "+ mensaje);
	}
	
	public IGrupo getGrupo() {
		return grupo;
	}

	public void setGrupo(IGrupo grupo) {
		this.grupo = grupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
