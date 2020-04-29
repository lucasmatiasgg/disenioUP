
public class Persona {
	protected IGrupo grupo;
	private String nombre;
	
	public Persona() {};
	
	public Persona (IGrupo grupo, String nom) {
		this.grupo = grupo;
		nombre = nom;
	}
	
	public void enviar(String mensaje) {
		grupo.enviar(mensaje, this);
	}
	
	public void recibir(String mensaje) {
		System.out.println(this.getNombre() + " está leyendo: "+ mensaje);
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
