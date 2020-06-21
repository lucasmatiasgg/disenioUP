public class AutoFactory {
	
	private static AutoFactory instance;
	
	public Auto crearAutoEjecutivo(String patente, String marca, String anio) {
		
		return new Auto(patente, marca, anio);
	}
	
	public Auto crearAutoEmpleado(String patente) {
		return new Auto(patente, "VW", "2015");
	}
	
	public static AutoFactory getInstance() {
		if(instance == null) {
			return new AutoFactory();
		}
		return instance;
	}
}
