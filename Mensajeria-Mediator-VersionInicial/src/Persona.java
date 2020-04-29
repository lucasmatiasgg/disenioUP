
public class Persona {
	private String nombre;
	private Grupo grupo;
	
	public void leer(String mensaje) {
		System.out.println(nombre + " está leyendo: " + mensaje);
	}
	
	public void escribir(String mensaje) {
		grupo.recibirMensaje(mensaje);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
}
