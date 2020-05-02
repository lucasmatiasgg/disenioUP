import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> mensajeLeido = new ArrayList<String>();
		
		Grupo grupoFacu = new Grupo();
		Grupo grupoCasa = new Grupo();
		
		Persona lucas = new Persona(grupoFacu, "Lucas");
		Persona matias = new Persona(grupoFacu, "Matias");
		Persona casandra = new Persona(grupoFacu, "Casandra");
		Persona jose = new Persona(grupoCasa, "Jose");
		Persona luis = new Persona(grupoCasa, "Luis");
		
		grupoFacu.add(lucas);
		grupoFacu.add(matias);
		grupoFacu.add(casandra);
		
		grupoCasa.add(jose);
		grupoCasa.add(luis);
		
		mensajeLeido = lucas.enviar("Hola grupo de la facu");		
		for(String mensaje : mensajeLeido) {
			System.out.println(mensaje);
		}
		
		//Hago una prueba con un grupo diferente.
		mensajeLeido = jose.enviar("Hola gente de casa");		
		for(String mensaje : mensajeLeido) {
			System.out.println(mensaje);
		}
	}

}
