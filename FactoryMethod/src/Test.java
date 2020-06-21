
public class Test {

	public static void main(String[] args) {
		Empleado juan = new Empleado("Juan", 40, 10);
		Empleado pedro = new Empleado("Pedro", 20, 1);
		
		juan.crearAuto("AAA123");
		
		System.out.println(juan);
		System.out.println(pedro);
	}

}
