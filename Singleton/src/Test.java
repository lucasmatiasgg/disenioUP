
public class Test {

	public static void main(String[] args) {
		Prueba p1 = Prueba.getInstance();
		Prueba p2 = Prueba.getInstance();
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
