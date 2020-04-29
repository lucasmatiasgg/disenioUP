
public class Test {

	public static void main(String[] args) {
		
		Grupo grupo = new Grupo();
		Persona lucas = new Persona();
		Persona matias = new Persona();
		Persona pepe = new Persona();
		
		lucas.setGrupo(grupo);
		lucas.setNombre("Lucas");
		matias.setNombre("Matias");
		matias.setGrupo(grupo);
		pepe.setNombre("Pepe");
		pepe.setGrupo(grupo);
		
		grupo.addPersona(lucas);
		grupo.addPersona(matias);
		grupo.addPersona(pepe);
		
		lucas.escribir("Hola");
	}

}
