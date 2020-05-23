import java.util.HashMap;

public class FlyFactory {
	private HashMap<String, JugadorFly> instanceFly = new HashMap<String, JugadorFly>();
	
	public JugadorFly getFly(String key) {
		
		switch(key) {
			
		case "100":
			{
				if(instanceFly.containsKey(key)) {
					return instanceFly.get(key);
				}else {
					JugadorFly jugador = new SoldadoFly(key);
					instanceFly.put(key, jugador);
					return jugador;
				}
			}
		case "200":
		{
			if(instanceFly.containsKey(key)) {
				return instanceFly.get(key);
			}else {
				JugadorFly jugador = new DragonFly(key);
				instanceFly.put(key, jugador);
				return jugador;
			}
		}
		
		default:
			
			return null;
		
		}
	}
}
