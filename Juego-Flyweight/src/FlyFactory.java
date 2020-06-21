import java.util.HashMap;

public class FlyFactory {
	public static final String SOLDADO_100 = "100";
	public static final String DRAGON_200 = "200";
	private HashMap<String, JugadorFly> instanceFly = new HashMap<String, JugadorFly>();
	
	public JugadorFly getFly(String key) {
		
		if(instanceFly.containsKey(key)) {
			return instanceFly.get(key);
		}

		JugadorFly jugador = null;
		switch(key) {
			
		case SOLDADO_100:
				jugador = new SoldadoFly();
				break;
		case DRAGON_200:
				jugador = new DragonFly();
				break;
		}
		
		instanceFly.put(key, jugador);
		return jugador;
	}
}
