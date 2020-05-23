
public class Test {

	public static void main(String[] args) {
		Cuenta ca = new Cuenta();
		
		ca.setNumero(12345);
		ca.setTipo("Caja Ahorro");

		
		
		Cuenta ca2 = ca.clone();
		
		ca.setNumero(9999);
		ca.setTipo("pepe");
		
		
		
		System.out.println(ca);
		System.out.println(ca2);
	}

}
