
public class Prueba {
	
	private static Prueba instance;
	
	private Prueba() {}
	
	public static Prueba getInstance() {
		if(instance == null) {
			instance = new Prueba(); 
		}
		return instance;
	}
	
}
