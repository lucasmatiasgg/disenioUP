
public class Test {

	public static void main(String[] args) {
		
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
		
		lucas.enviar("Hola grupo de la facu");
		
		jose.enviar("Hola gente de casa");
	}

}
