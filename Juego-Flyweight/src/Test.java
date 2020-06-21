import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		FlyFactory factory = new FlyFactory();
		
		List<Soldado> soldados = new ArrayList<Soldado>();
		makeSoldados(soldados, 5, factory);
		
		List<Dragon> dragones = new ArrayList<Dragon>();
		makeDragones(dragones, 3, factory);
		
		muestraSoldados(soldados);
		muestraDragones(dragones);

	}

	public static void makeSoldados(List<Soldado> soldados, int cantidad, FlyFactory factory) {
		Soldado soldado;
		
		for(int i=0; i<cantidad ; i++) {
			soldado = new Soldado(factory);
			soldado.setPosX(101+i);
			soldado.setPosY(55+i);
			soldados.add(soldado);
		}
	}
	
	public static void makeDragones(List<Dragon> dragones, int cantidad, FlyFactory factory) {
		Dragon dragon;
		
		for(int i=0; i<3 ; i++) {
			dragon = new Dragon(factory);
			dragon.setPosX(201+i);
			dragon.setPosY(90+i);
			dragones.add(dragon);
		}
	}
	
	public static void muestraSoldados(List<Soldado> soldados) {
		System.out.println("########Soldados########");
		for(Soldado sol : soldados) {
			System.out.println(sol);
		}
		System.out.println("#########################");
	}
	
	public static void muestraDragones(List<Dragon> dragones) {
		System.out.println("########Dragones########");
		for(Dragon drag : dragones) {
			System.out.println(drag);
		}
		System.out.println("#########################");
	}
}
